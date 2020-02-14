public class MusicLibrary {
    private Album[] music;
    public MusicLibrary() {
        music = new Album[0];
    }

    public void add(Album a) {
       Album[] newMusic = new Album[music.length + 1];
       System.arraycopy(music, 0, newMusic, 0, music.length);
       newMusic[newMusic.length - 1] = a;
       music = newMusic;
    }

    public void remove(int index) {
        Album[] editedMusic = new Album[music.length - 1];
        for(int i = 0; i < index; i++) {
            editedMusic[i] = music[i];
        }
        for(int i = index + 1; i < music.length - 1; i++) {
            editedMusic[i] = music[i];
        }
        music = editedMusic;
    }

    public void doubleSize() {
        Album[] doubleMusic = new Album[music.length * 2];
        for(int i = 0; i < music.length; i++) {
            doubleMusic[i] = music[i];
        }
        music = doubleMusic;
    }

    public String toString() {
        StringBuilder array = new StringBuilder();
        for(Album a : music) {
            if(a != null)
                array.append(a.toString());
            else
                array.append("Empty\n");
        }
        return array.toString();
    }

    public int findTitle(String title) {

        for(int i = 0; i < music.length; i++) {
            if(music[i] != null && music[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public int findArtist(String artist) {
        for(int i = 0; i < music.length; i++) {
            if(music[i] != null && music[i].getArtist().equals(artist)) {
                return i;
            }
        }
        return -1;
    }

    public Album getAlbum(int i) {
        if(i >= 0 && i < music.length)
            return music[i];
        else {
            System.out.println("Out of Bounds");
            return null;

        }
    }
}
