package pattern.structure.adapter.base;

/**
 * 原播放器接口
 */
public interface IMediaPlayer {
    /**
     * 播放
     */
    void play(String audioType, String fileName);
}
