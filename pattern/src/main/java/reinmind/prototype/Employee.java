package reinmind.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型设计模式强调对象必须手动复制
 * 实现Cloneable接口需要手动实现Object的clone方法，否则会报错
 * @author xiang.zhang
 */
public class Employee implements Cloneable{
    private List<String> empList;
    public Employee(){
        this.empList = new ArrayList<>();
    }
    public void loadData(){
        empList.add("张🐍");
        empList.add("李🐒");
        empList.add("王🐎");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empList=" + empList +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
