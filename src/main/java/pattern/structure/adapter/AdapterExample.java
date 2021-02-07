package pattern.structure.adapter;

import pattern.structure.adapter.player.AudioPlayer;

/**
 * 例.适配器模式 - 实际案例：播放器
 */
public class AdapterExample {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
