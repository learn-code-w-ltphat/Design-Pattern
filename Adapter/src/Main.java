import MediaPlayer.MediaPlayer;
import MediaPlayer.AudioPlayer;
import ModernMediaPlayer.ModernMediaPlayer;
import ModernMediaPlayer.AudioVideoPlayer;
import ModernMediaPlayer.MediaAdapter;

/// Bài toán: Cho một trình phát nhạc cũ (Media Player) chỉ phát được mỗi nhạc không có lời. Hãy thiết kế và tích hợp
/// một trình phát nhạc mới (ModernMediaPlayer) có lời và thậm chí có thể trình chiếu video. Đơn giản hóa việc phát nhạc,
/// lời và chiếu video bằng dòng thông báo.
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.playAudio("Hello-world.mp3");

        System.out.println("------------------------------------------");

        ModernMediaPlayer modernMediaPlayer = new AudioVideoPlayer();
        MediaPlayer modernMediaPlayerAdapter = new MediaAdapter(modernMediaPlayer);

        modernMediaPlayerAdapter.playAudio("Hello-world.mp3");
        modernMediaPlayerAdapter.playAudio("Hello-world.mp4");
    }
}