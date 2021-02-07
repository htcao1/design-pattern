package pattern.structure.composite;

import pattern.structure.composite.employee.Employee;

/**
 * 组合模式：员工层级关系
 */
public class CompositeExampe {
    public static void main(String[] args) {
        //CEO
        Employee CEO = new Employee("魏虎", "Lv1.CEO", 30000);
        // 主管
        Employee headSales = new Employee("刘赞行", "Lv2.销售主管", 20000);
        Employee headMarketing = new Employee("金苑", "Lv2.市场主管", 20000);
        // 职员
        Employee clerk1 = new Employee("吴芳芳", "Lv3.市场推广员", 10000);
        Employee clerk2 = new Employee("鲍向", "Lv3.市场推广员", 10000);
        Employee salesExecutive1 = new Employee("张冬冬", "Lv3.销售员", 10000);
        Employee salesExecutive2 = new Employee("李丽", "Lv3.销售员", 10000);

        // CEO下属：销售主管、市场主管
        CEO.add(headSales);
        CEO.add(headMarketing);
        // 销售主管下属：销售员
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        // 市场主管下属：市场推广员
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
