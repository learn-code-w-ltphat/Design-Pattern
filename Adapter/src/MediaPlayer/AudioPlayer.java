package MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}
