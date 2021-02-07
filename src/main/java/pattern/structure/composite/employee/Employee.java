package pattern.structure.composite.employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工类
 */
public class Employee {
    /**
     * 姓名
     */
    private String name;
    /**
     * 岗位
     */
    private String dept;
    /**
     * 薪资
     */
    private int salary;
    /**
     * 下属成员
     */
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("员工: [姓名:" + name + ", 岗位:" + dept + ", 薪资:" + salary + "]");
    }
}
