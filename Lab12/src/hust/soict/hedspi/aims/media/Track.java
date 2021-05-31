package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track() {
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public boolean equals(Track track) {
		if (track.title.equals(title) && track.length == length) {
			return true;
		}
		return false;
	}
	public void play() throws PlayerException{
		if (this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		}
		else {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
	}
}
