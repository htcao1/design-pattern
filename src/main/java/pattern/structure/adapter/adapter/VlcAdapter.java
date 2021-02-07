package pattern.structure.adapter.adapter;

import pattern.structure.adapter.base.IMediaPlayer;

/**
 * 适配器-播放Vlc
 */
public class VlcAdapter implements IMediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // 此处有可能有大量播放vlc的实现代码，这里省略了
        // ...
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
