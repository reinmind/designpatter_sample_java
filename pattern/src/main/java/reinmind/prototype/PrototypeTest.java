package reinmind.prototype;

/**
 * @author xiang.zhang
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();
        Employee e1 = (Employee)employee.clone();
        System.out.println(employee);
        System.out.println(e1);
    }
}
