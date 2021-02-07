package pattern.structure.proxy.image;

/**
 * 真实图片类
 */
public class RealImage implements IImage {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示：" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("加载：" + fileName);
    }
}