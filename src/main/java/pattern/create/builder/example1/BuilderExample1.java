package pattern.create.builder.example1;

/**
 * 例1.建造者模式 - 简单（教学演示）
 */
public class BuilderExample1 {
    public static void main(String[] args) {
        // 1.建造者
        Builder builder = new ConcreteBuilder();
        // 2.导演者
        Director director = new Director(builder);
        // 3.组装
        director.construct();
        // 4.获得结果
        Product product = builder.retrieveResult();

        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}

/**
 * 产品类
 */
class Product {
    private String part1;
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }
}

/**
 * 创建者接口
 */
interface Builder {
    public void buildPart1();

    public void buildPart2();

    public Product retrieveResult();
}

/**
 * 具体创建者
 */
class ConcreteBuilder implements Builder {

    private Product product = new Product();

    /**
     * 产品零件建造方法1
     */
    @Override
    public void buildPart1() {
        //构建产品的第一个零件
        product.setPart1("编号：9527");
    }

    /**
     * 产品零件建造方法2
     */
    @Override
    public void buildPart2() {
        //构建产品的第二个零件
        product.setPart2("名称：XXX");
    }

    /**
     * 产品返还方法
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}

/**
 * 导演者
 */
class Director {
    /**
     * 持有当前需要使用的建造器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入建造器对象
     *
     * @param builder 建造器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}