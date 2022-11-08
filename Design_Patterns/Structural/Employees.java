package Design_Patterns.Structural;

import java.util.ArrayList;
import java.util.List;

public class Employees extends StoreEmployee {

    private String name;
    private String surname;
    private Integer age;
    private Integer salary;
    private String department;
    private String job;
    private List<Employees> colleagues;

    Employees(){

    }
    Employees(StoreEmployeeAPI storeAPI){
        super(storeAPI);
        colleagues = new ArrayList<Employees>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getJob() {
        return job;
    }

    public void addHiredColleague(Employees newEmployee) {
        this.colleagues.add(newEmployee);
    }

    public void removeFiredColleague(Employees firedEmployee){
        this.colleagues.remove(firedEmployee);
    }

     List<Employees> getColleagues(){
        return this.colleagues;
    }

    public void work(){
        System.out.println(" Working with a client!");
    }

    public String getInfo(){
        return "Store Employee Name : " + name
                + " Surname : " + surname
                + " Age : " + age
                + " Salary : " + salary
                + " Department : " + department
                + " Job : " + job;
    }

    public void qualification(){
        storeAPI.qualification(department);
    }


}