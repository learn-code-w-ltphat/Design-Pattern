package ModernMediaPlayer;

import MediaPlayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    private final ModernMediaPlayer mediaPlayer;

    public MediaAdapter(ModernMediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void playAudio(String fileName) {
        System.out.println("\nUsing adapter to play media:");

        if (fileName.endsWith(".mp3")) {
            mediaPlayer.playAudio(fileName);
        }
        else if (fileName.endsWith(".mp4")) {
            mediaPlayer.playVideo(fileName);
        } else {
            System.out.println("Unsupported file type: " + fileName);
        }
    }
}
