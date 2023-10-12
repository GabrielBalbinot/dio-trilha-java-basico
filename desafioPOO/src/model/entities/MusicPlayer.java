package model.entities;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer implements MusicPlayerInterface {
	
	List<Music> playlist = new ArrayList<Music>();
	
	public MusicPlayer() {
		
	}

	public List<Music> getPlaylist() {
		return playlist;
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music!");
	}

	@Override
	public void pauseMusic() {
		System.out.println("Pausing music!");		
	}

	@Override
	public void selectMusic(Music music) {
		System.out.println("Selecting music!");
	}

	@Override
	public void nextMusic() {
		System.out.println("Goint to next music!");
	}

	@Override
	public void previousMusic() {
		System.out.println("Going to previous music!");
	}

	@Override
	public void addMusic(Music music) {
		playlist.add(music);
	}

	@Override
	public void removeMusic(Music music) {
		playlist.remove(music);
	}

}
