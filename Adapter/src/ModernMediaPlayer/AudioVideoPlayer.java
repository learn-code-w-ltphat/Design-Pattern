package ModernMediaPlayer;

public class AudioVideoPlayer implements ModernMediaPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName + " with lyrics...");
    }

    public void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }

}
