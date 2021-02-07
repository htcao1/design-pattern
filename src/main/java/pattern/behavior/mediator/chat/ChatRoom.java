package pattern.behavior.mediator.chat;

import pattern.behavior.mediator.user.User;

import java.util.Date;

/** 聊天室（中介者）*/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
