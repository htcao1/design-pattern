package pattern.behavior.chain;

import pattern.behavior.chain.base.AbstractLogger;
import pattern.behavior.chain.logger.ConsoleLogger;
import pattern.behavior.chain.logger.ErrorLogger;
import pattern.behavior.chain.logger.FileLogger;

/**
 * 责任链模式：日志记录
 */
public class ChainExample {
    /** 获取日志职责链 */
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger debugLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        // 构建责任链
        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);
        return debugLogger;
    }
    /** 主函数入口 */
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.DEBUG, "这是一个调试信息");
        System.out.println("----------------------------");
        loggerChain.logMessage(AbstractLogger.INFO, "这是一个普通信息");
        System.out.println("----------------------------");
        loggerChain.logMessage(AbstractLogger.ERROR, "这是一个错误信息");
    }
}
