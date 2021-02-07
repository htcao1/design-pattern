package pattern.structure.proxy.proxy;

import pattern.structure.proxy.image.IImage;
import pattern.structure.proxy.image.RealImage;

public class ProxyImage implements IImage {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 代理控制显示，加载过的图片，就不用再次加载了
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
