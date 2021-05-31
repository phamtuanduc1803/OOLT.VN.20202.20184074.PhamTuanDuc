package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

import hust.soict.hedspi.aims.PlayerException;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc(String title, String category, String artist, float cost) {
		this.title = title;
		this.category = category;
		this.artist = artist;
		this.cost = cost;
	}
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track ... trackList) {
		for(Track track: trackList) {
			boolean exist = false;
			for(Track alTrack: tracks) {
				if(track.equals(alTrack)) {
					System.out.println("Track '" + track.getTitle() + "' already exists!");
					exist = true;
					break;
				}
			}
			if(exist == false) {
				tracks.add(track);
				System.out.println("Added track '" + track.getTitle() +"' successful!");
			}
		}
	}
	public void removeTrack(Track ... trackList) {
		for(Track track: trackList) {
			boolean exist = false;
			for(Track alTrack: tracks) {
				if(track.equals(alTrack)) {
					tracks.remove(track);
					System.out.println("Remove track '" + track.getTitle() + "' successful!");
					exist = true;
					break;
				}
			}
			if(exist == false) {
				System.out.println("Track '" + track.getTitle() +"' not exist in list!");
			}
		}
	}
	public int getLength() {
		int total = 0;
		for (Track track: tracks) {
			total += track.getLength();
		}
		return total;
	}
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing CD: " + this.getTitle());
			System.out.println("CD length: " + this.getLength());
			java.util.Iterator<Track> iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				} 
				catch (PlayerException e) {
					System.out.println("Here 0");
					System.out.println(e.toString());
					System.out.println("Here 1");
					e.printStackTrace();
					throw e;
				}
			}
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
		
	}
	public int getCountTrack() {
		return tracks.size();
	}
	//Override compareTo method
	public int compareTo(CompactDisc cd) throws Exception{
		try {
			if (tracks.size() < cd.getCountTrack()) {
				return -1;
			}
			else if (tracks.size() == cd.getCountTrack()) {
				if(getLength() == cd.getLength()) {
					return 0;
				}
				else if (getLength() < cd.getLength()){
					return -1;
				}
			}
		}
		catch (NullPointerException e1) {
			e1.printStackTrace();
		}
		catch (ClassCastException e2) {
			e2.printStackTrace();
		}
		return 1;
	}
}
