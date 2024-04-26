import java.util.*;

public class Spotify_Server implements SongService {
    HashMap<Integer, Song> song_database;

    Spotify_Server(){
        this.song_database = new HashMap<Integer,Song>();
    }

    public void addToDatabase(Integer songID, Song song){
        this.song_database.put(songID,song);
    }

    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
            System.out.println("Accessing server...");
            if (!song_database.containsKey(songID)) {
                throw new Exception();
            } else {
                return song_database.get(songID);
            }

        } catch (Exception e) {
            System.out.println("Can't find any songs with the given songID: " + songID);
            return null;
        }
    }

    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
            System.out.println("Accessing server...");
            List<Song> song_list = new ArrayList<Song>();
            for (Integer songID : song_database.keySet()) {
                if (title.equals(song_database.get(songID).getTitle())) {
                    song_list.add(song_database.get(songID));
                }
            }
            if (song_list.size() == 0) {
                throw new Exception();
            }
            return song_list;
        } catch (Exception e) {
            System.out.println("Can't find any songs with the given title: " + title);
            return null;
        }
    }

    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
            System.out.println("Accessing server...");
            List<Song> song_list = new ArrayList<Song>();
            for (Integer songID : song_database.keySet()) {
                if (album.equals(song_database.get(songID).getAlbum())) {
                    song_list.add(song_database.get(songID));
                }
            }
            if (song_list.size() == 0) {
                throw new Exception();
            }
            return song_list;
        } catch (Exception e) {
            System.out.println("Can't find any songs with the given album: " + album);
            return null;
        }
    }
}
