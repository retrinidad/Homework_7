import java.util.*;

public class ProxyDriver {
    public static void main(String[] args) {
        Spotify_Server spotifyServer = new Spotify_Server();

        spotifyServer.addToDatabase(0,new Song("Smooth","Santana","Supernatural",295 ));
        spotifyServer.addToDatabase(1,new Song("Put Your Lights On","Santana","Supernatural",285));
        spotifyServer.addToDatabase(2,new Song("Maria Maria","Santana","Supernatural",263));
        spotifyServer.addToDatabase(3,new Song("Love Is a Long Road","Tom Petty","Full Moon Fever",247));
        spotifyServer.addToDatabase(4,new Song("Best Song Ever","One Direction","Midnight Memories",202));
        spotifyServer.addToDatabase(5,new Song("What I've Done","Linkin Park","Minutes to Midnight",205));
        spotifyServer.addToDatabase(6,new Song("Stay","Rihanna","Unapologetic",240));
        spotifyServer.addToDatabase(7,new Song("Stay","Zedd","Stay +",210));

        SongServiceProxy spotifyProxy = new SongServiceProxy(spotifyServer);

        System.out.println("\nSearching for song by songID");
        Song song1 = spotifyProxy.searchById(3);
        song1.printSong();

        System.out.println("\nSearching for song by songID");
        Song song2 = spotifyProxy.searchById(3);
        song1.printSong();

        System.out.println("\nSearching for songs by Title");
        List<Song> songlist = spotifyProxy.searchByTitle("Stay");
        for (Song song : songlist) {song.printSong();}

        System.out.println("\nSearching for songs by Album");
        spotifyProxy.searchByAlbum("Supernatural");
        for (Song song : songlist) {song.printSong();}


    }
}
