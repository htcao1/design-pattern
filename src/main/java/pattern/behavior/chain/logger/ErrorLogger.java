package pattern.behavior.chain.logger;

import pattern.behavior.chain.base.AbstractLogger;

/** 控制台错误日志 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.err.println("控制台错误日志：" + message);
    }
}
