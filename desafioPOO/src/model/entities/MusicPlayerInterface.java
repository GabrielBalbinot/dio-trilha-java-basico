package model.entities;

import java.util.ArrayList;
import java.util.List;

public interface MusicPlayerInterface {
	
	List<Music> playlist = new ArrayList<Music>();
	
	void playMusic();
	void pauseMusic();
	void selectMusic(Music music);
	void nextMusic();
	void previousMusic();
	void addMusic(Music music);
	void removeMusic(Music music);

}
