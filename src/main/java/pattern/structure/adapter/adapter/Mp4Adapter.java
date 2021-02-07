package pattern.structure.adapter.adapter;

import pattern.structure.adapter.base.IMediaPlayer;

/**
 * 适配器-播放Mp4
 */
public class Mp4Adapter implements IMediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // 此处有可能有大量播放mp4的实现代码，这里省略了
        // ...
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
