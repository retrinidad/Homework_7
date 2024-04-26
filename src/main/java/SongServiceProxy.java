import java.util.*;
public class SongServiceProxy implements SongService {
    Spotify_Server spotify;
    HashMap<Integer,Song> song_cache;

    public SongServiceProxy(Spotify_Server server) {
        this.spotify = server;
        this.song_cache = new HashMap<Integer,Song>();
    }

    public Song searchById(Integer songID){
        if(!song_cache.containsKey(songID)){
            Song found_song = spotify.searchById(songID);
            song_cache.put(songID,found_song);
            return song_cache.get(songID);
        }
        else{
            return song_cache.get(songID);
        }
    }
    public List<Song> searchByTitle(String title){
        List<Song> songList = new ArrayList<Song>();
        List<Song> cachedSongList = new ArrayList<Song>();
        List<Song> nonCachedSongList = new ArrayList<Song>();
        for(Integer songID : song_cache.keySet()){
            if(title.equals(song_cache.get(songID).getTitle())){
                cachedSongList.add(song_cache.get(songID));
            }
        }
        nonCachedSongList = spotify.searchByTitle(title);

        for(Song song : nonCachedSongList){
            int randomKey  = new Random().nextInt(100 - 20) + 20;
            song_cache.put(randomKey,song);
        }

        songList.addAll(nonCachedSongList);
        songList.addAll(cachedSongList);
        return songList;
    }

    public List<Song> searchByAlbum(String album){
        List<Song> songList = new ArrayList<Song>();
        List<Song> cachedSongList = new ArrayList<Song>();
        List<Song> nonCachedSongList = new ArrayList<Song>();
        for(Integer songID : song_cache.keySet()){
            if(album.equals(song_cache.get(songID).getTitle())){
                cachedSongList.add(song_cache.get(songID));
            }
        }
        nonCachedSongList = spotify.searchByAlbum(album);

        for(Song song : nonCachedSongList){
            int randomKey  = new Random().nextInt(100 - 20) + 20;
            song_cache.put(randomKey,song);
        }

        songList.addAll(nonCachedSongList);
        songList.addAll(cachedSongList);
        return songList;
    }
}
