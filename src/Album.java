public class Album {
    private String name;
    private String artist;
    private int numSongs;
    private int time;

    public Album(String name, String artist, int numSongs, int time) {
        this.name = name;
        this.artist = artist;
        this.numSongs = numSongs;
        this.time = time;
    }

    public String toString() {
        return "Name: " + name + "\nArtist: " + artist + "\nNumber of Songs: " + numSongs + "\nLength: " + time + " minutes";
    }
}
