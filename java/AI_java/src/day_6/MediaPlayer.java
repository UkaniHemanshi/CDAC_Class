package day_6;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer 
{
	public void playMyList(List<? extends Media> medialist)
	{
		for(Media m : medialist)
		{
			m.play();
		}
	}
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		List<Media> songs = new ArrayList<>();
		songs.add(new Song(14,"ruewrye"));
		songs.add(new Song(15,"eiwtr"));
		songs.add(new Song(16,"ewgjdw"));
		
		songs.add(new Video());
		player.playMyList(songs);
		
	}
}
