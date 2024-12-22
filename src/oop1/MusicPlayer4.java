package oop1;

public class MusicPlayer4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        musicPlayer.on();

        musicPlayer.volumeUp();
        musicPlayer.volumeUp();

        musicPlayer.off();
        musicPlayer.showStatus();

        System.out.println(musicPlayer.volume);

    }
}
