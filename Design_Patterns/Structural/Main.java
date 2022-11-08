package Design_Patterns.Structural;

import java.util.List;

public class Main {
    public static void main(String[] args) {
// Adapter

        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        employeeBuilder.build("Food", "Manager");
        employeeBuilder.build("Clothing","Cashier");

//Bridge

        StoreEmployee empl1 = new FoodEmployee(new ManagerEmployee());
        StoreEmployee empl2 = new ClothingEmployee(new ConsultantEmployee());
        empl1.work();
        empl2.work();

        Employees emp1 = new Employees(new ManagerEmployee());
        Employees emp2 = new Employees(new ConsultantEmployee());
        Employees emp3 = new Employees(new ManagerEmployee());
        Employees emp4 = new Employees(new CashierEmployee());
        Employees emp5 = new Employees(new ConsultantEmployee());
        emp1.setName("Doina");
        emp2.setName("Oana");
        emp3.setName("Ira");
        emp4.setName("Silviu");
        emp5.setName("Nicu");
        emp1.setSurname("Lozovan");
        emp2.setSurname("Caloev");
        emp3.setSurname("Bostan");
        emp4.setSurname("Cojuhari");
        emp5.setSurname("Caliman");
        emp1.setAge(23);
        emp2.setAge(53);
        emp3.setAge(18);
        emp4.setAge(23);
        emp5.setAge(43);
        emp1.setSalary(4500);
        emp2.setSalary(4500);
        emp3.setSalary(4500);
        emp4.setSalary(4500);
        emp5.setSalary(4500);
        emp1.setDepartment("Food");
        emp2.setDepartment("Clothing");
        emp3.setDepartment("Furniture");
        emp4.setDepartment("Clothing");
        emp5.setDepartment("Food");
        emp1.setJob("Manager");
        emp2.setJob("Consultant");
        emp3.setJob("Manager");
        emp4.setJob("Cashier");
        emp5.setJob("Consultant");

        // Composite pattern
        emp5.addHiredColleague(emp1);
        emp5.addHiredColleague(emp2);
        emp5.addHiredColleague(emp3);
        emp5.addHiredColleague(emp4);

        emp5.removeFiredColleague(emp2);
        for(Employees emp : emp5.getColleagues()){
        System.out.println(emp.getInfo());}

    }

}