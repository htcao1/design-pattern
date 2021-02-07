package pattern.behavior.chain.logger;

import pattern.behavior.chain.base.AbstractLogger;

/** 文件日志 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("文件日志：" + message);
    }
}
