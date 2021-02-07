package pattern.behavior.template;

import pattern.behavior.template.game.Basketball;
import pattern.behavior.template.game.Football;
import pattern.behavior.template.game.Game;

/**
 * 模板模式：玩游戏
 */
public class TemplateExample {
    public static void main(String[] args) {
        Game game = new Basketball(); // 篮球
        game.play();
        System.out.println();
        game = new Football(); // 足球
        game.play();
    }
}
