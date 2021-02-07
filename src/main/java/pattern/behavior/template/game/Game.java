package pattern.behavior.template.game;

/** 游戏 */
public abstract class Game {
    abstract void initialize(); //初始化游戏
    abstract void startPlay(); //开始游戏
    abstract void endPlay(); //结束游戏

    /** 玩 */
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
