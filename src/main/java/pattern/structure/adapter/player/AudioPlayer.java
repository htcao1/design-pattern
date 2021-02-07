package pattern.structure.adapter.player;

import pattern.structure.adapter.adapter.Mp4Adapter;
import pattern.structure.adapter.adapter.VlcAdapter;
import pattern.structure.adapter.base.IMediaPlayer;

/**
 * 播放器
 */
public class AudioPlayer implements IMediaPlayer {
    /**
     * 适配器-播放Mp4
     */
    private Mp4Adapter mp4Adapter;
    /**
     * 适配器-播放Vlc
     */
    private VlcAdapter vlcAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            // 此处有可能有大量播放mp3的实现代码，这里省略了
            // ...
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            //mp4Adapter 提供了播放mp4文件格式的支持
            mp4Adapter = new Mp4Adapter();
            mp4Adapter.play(audioType, fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            //vlcAdapter 提供了播放vlc文件格式的支持
            vlcAdapter = new VlcAdapter();
            vlcAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
