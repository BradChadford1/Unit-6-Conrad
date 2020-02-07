public class Album {
    private String title;
    private String artist;
    private int numSongs;
    private double time;

    public Album(String title, String artist, int numSongs, double time) {
        this.title = title;
        this.artist = artist;
        this.numSongs = numSongs;
        this.time = time;
    }

    public String toString() {
        return "Name: " + title + " | Artist: " + artist + " | Number of Songs: " + numSongs + " | Length: " + time + " minutes\n";
    }
}
