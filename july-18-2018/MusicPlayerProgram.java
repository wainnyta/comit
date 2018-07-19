import java.util.Scanner;

public class MusicPlayerProgram {

    private final static int SHOW_PLAYLIST = 1;
    private final static int PLAY_SONG = 2;
    private final static int ADD_SONG = 3;
    private final static int QUIT = 4;

    private MusicPlayer musicPlayer = new MusicPlayer(10);
    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        MusicPlayerProgram myProgram = new MusicPlayerProgram();
        myProgram.run();
    }

    public void run() {
        int userChoice;
        do {
            System.out.println(menu());
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case MusicPlayerProgram.SHOW_PLAYLIST:
                    showPlayList();
                    break;
                case MusicPlayerProgram.PLAY_SONG:
                    playSong();
                    break;
                case MusicPlayerProgram.ADD_SONG:
                    addSong();
                    break;
                case MusicPlayerProgram.QUIT:
                    System.out.println("Thank you for using Music Player! See you round!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 4);
    }

    public void showPlayList() {
        if (musicPlayer.isPlaylistEmpty()) {
            System.out.println("Playlist is empty. Add a new song? [y/N]");
            String answer = scanner.next();

            if(answer.trim().equalsIgnoreCase("Y")) {
                addSong();
            }
        } else {
            System.out.println(musicPlayer);
        }
    }

    public void addSong() {
        String author;
        String name;

        System.out.println("Please enter the song name");
        name = scanner.next();

        System.out.println("Please enter the author's name");
        author = scanner.next();

        Song addedSong = musicPlayer.addSong(name, author);

        System.out.println("Successfully added " + addedSong);
    }

    public void playSong() {
        showPlayList();

        System.out.println("Please choose a song from the above playlist");

        int songIndex = scanner.nextInt();

        musicPlayer.play(songIndex - 1);
    }

    public static String menu() {
        String menu = "1. Show playlist\n";
        menu += "2. Play a song\n";
        menu += "3. Add a song\n";
        menu += "4. Quit\n";

        menu += "Please make a selection";
        return menu;
    }
}
