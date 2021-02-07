package pattern.behavior.chain.logger;

import pattern.behavior.chain.base.AbstractLogger;

/** 控制台输出日志 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("控制台输出日志：" + message);
    }
}
