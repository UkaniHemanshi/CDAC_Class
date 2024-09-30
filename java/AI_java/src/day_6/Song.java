package day_6;

public class Song extends Media 
{
	private int srno;
	private String title;
	
	public Song(int srno, String title) {
		super();
		this.srno = srno;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Song [srno=" + srno + ", title=" + title + "]";
	}

	public void play()
	{
		System.out.println("Song is playing");
	}
	
}
