public class Song{

    private String Title;
    private String Artist;
    private String Album;
    private int duration;

    public Song(String Title, String Artist, String Album, int duration){
        this.Title = Title;
        this.Artist = Artist;
        this.Album = Album;
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public String getAlbum() {
        return Album;
    }
    public void printSong(){
        System.out.println("Title: " + Title);
        System.out.println("Artist: " + Artist);
        System.out.println("Album: " + Album);
        System.out.println("Duration: " + duration);
    }

}
