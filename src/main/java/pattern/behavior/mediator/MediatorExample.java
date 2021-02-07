package pattern.behavior.mediator;

import pattern.behavior.mediator.user.User;

/**
 * 中介者模式：聊天室
 */
public class MediatorExample {
    public static void main(String[] args) {
        User zhaoyun = new User("赵云");
        User zhangfei = new User("张飞");

        zhaoyun.sendMessage("三哥！我回来啦！");
        zhangfei.sendMessage("四弟，回来就好啊，哈哈");
    }
}
