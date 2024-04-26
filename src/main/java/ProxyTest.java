import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProxyTest {

    @Test
    public void TestSearchById(){
        Spotify_Server spotifyServer = new Spotify_Server();
        spotifyServer.addToDatabase(4,new Song("Best Song Ever","One Direction","Midnight Memories",202));
        SongServiceProxy spotifyProxy = new SongServiceProxy(spotifyServer);

        Song song1 = spotifyProxy.searchById(4);
        assertEquals("Best Song Ever",song1.getTitle());
    }

    @Test
    public void TestSearchByTitle(){
        Spotify_Server spotifyServer = new Spotify_Server();
        spotifyServer.addToDatabase(6,new Song("Stay","Rihanna","Unapologetic",240));
        spotifyServer.addToDatabase(7,new Song("Stay","Zedd","Stay +",210));
        SongServiceProxy spotifyProxy = new SongServiceProxy(spotifyServer);

        List<Song> songsFound = spotifyProxy.searchByTitle("Stay");
        Song song6 = new Song("Stay","Rihanna","Unapologetic",240);
        Song song7 = new Song("Stay","Zedd","Stay +",210);
        List<Song> songList = new ArrayList<Song>();
        songList.add(song6);
        songList.add(song7);

        assertEquals(songsFound.get(0).getTitle(),songList.get(0).getTitle());
        assertEquals(songsFound.get(1).getTitle(),songList.get(1).getTitle());
    }

    @Test
    public void TestSearchByAlbum(){
        Spotify_Server spotifyServer = new Spotify_Server();
        spotifyServer.addToDatabase(0,new Song("Smooth","Santana","Supernatural",295 ));
        spotifyServer.addToDatabase(1,new Song("Put Your Lights On","Santana","Supernatural",285));
        spotifyServer.addToDatabase(2,new Song("Maria Maria","Santana","Supernatural",263));
        SongServiceProxy spotifyProxy = new SongServiceProxy(spotifyServer);

        List<Song> songsFound = spotifyProxy.searchByAlbum("Supernatural");
        Song song0 = new Song("Smooth","Santana","Supernatural",295);
        Song song1 = new Song("Put Your Lights On","Santana","Supernatural",285);
        Song song2 = new Song("Maria Maria","Santana","Supernatural",263);
        List<Song> songList = new ArrayList<Song>();
        songList.add(song0);
        songList.add(song1);
        songList.add(song2);

        assertEquals(songsFound.get(0).getAlbum(),songList.get(0).getAlbum());
        assertEquals(songsFound.get(1).getAlbum(),songList.get(1).getAlbum());
        assertEquals(songsFound.get(2).getAlbum(),songList.get(2).getAlbum());
    }

}
