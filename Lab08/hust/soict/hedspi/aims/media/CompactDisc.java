package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

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
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for (Track track: tracks) {
			track.play();
		}
	}
	public int getCountTrack() {
		return tracks.size();
	}
	//Override compareTo method
	public int compareTo(CompactDisc cd) {
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
		return 1;
	}
}
