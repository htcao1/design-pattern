package pattern.structure.proxy;

import pattern.structure.proxy.image.IImage;
import pattern.structure.proxy.proxy.ProxyImage;

/**
 * 代理模式
 */
public class ProxyExample {
    public static void main(String[] args) {
        IImage image = new ProxyImage("test_10mb.jpg");

        System.out.println("--------- 第1次显示图片 ---------");
        // 图像将从磁盘加载
        image.display();
        System.out.println();
        System.out.println("--------- 第2次显示图片 ---------");
        // 图像不需要从磁盘加载
        image.display();
    }
}
