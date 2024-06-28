package Songs_Store;

import java.util.LinkedHashMap;
import java.util.Map;

public class songsstore 
{
	public int capacity=3;

	LinkedHashMap<String, String>playlist=new LinkedHashMap<>(capacity, 0.75f, true);

	public void addSong(String song, String user) 
	{
		playlist.put(song, user);

		if (playlist.size() > capacity) 
		{

			String RecentlyPlayedSong = playlist.keySet().iterator().next();
			playlist.remove(RecentlyPlayedSong);
		}
	}

	public void printPlaylist() 
	{
		System.out.println("Recently Played Songs:");
		for (Map.Entry<String, String> entry : playlist.entrySet()) 
		{
			System.out.println(entry.getKey() + " played by " + entry.getValue());
		}
		System.out.println();
	}

	public static void main(String[] args)
	{

		songsstore store = new songsstore();

		store.addSong("S1", "User1");
		store.addSong("S2", "User1");
		store.addSong("S3", "User1");

		store.printPlaylist(); 

		store.addSong("S4", "User1");

		store.printPlaylist(); 

		store.addSong("S2", "User1");

		store.printPlaylist(); 

		store.addSong("S1", "User1");

		store.printPlaylist();
	}

	}

