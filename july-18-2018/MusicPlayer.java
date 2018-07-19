public class MusicPlayer {

    private Song[] songs;
    private int currentIndex;

    public MusicPlayer(int size) {
        songs = new Song[size];
        currentIndex = 0;
    }

    public Song addSong(String name, String author) {
        Song mySong = new Song();
        mySong.setName(name);
        mySong.setAuthor(author);

        songs[currentIndex++] = mySong;

        return mySong;
    }

    public void play(int index) {
        songs[index].play();
    }

    public boolean isPlaylistEmpty() {
        return currentIndex == 0;
    }

    public String toString() {
        String output = "";

        for(int i = 0; i < currentIndex; i++) {
            output += (i+1) + ". " + songs[i] + "\n";
        }

        return output;
    }
}
