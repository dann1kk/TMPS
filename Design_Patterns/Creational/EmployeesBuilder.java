package Design_Patterns.Creational;

abstract class EmployeesBuilder {


    private StoreEmployee employee;

    public StoreEmployee getEmployee(){
        return employee;
    }

    public EmployeesBuilder(){
        employee=new StoreEmployee();

    }
    public void addName(String name) {
        employee.setName(name);
    }

    public void addSurname(String surname) {
        employee.setSurname(surname);
    }

    public void addAge(Integer age) {
        employee.setAge(age);
    }

    public void addSalary(Integer salary) {
        employee.setSalary(salary);
    }

    public void addDepartment(String department) {
        employee.setDepartment(department);
    }

    public void addJob(String job) {
        employee.setJob(job);
    }
    public abstract String getJobType();

}

class ManagerClothingBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Manager - Clothing";
    }

}

class ConsultantClothingBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Consultant/Seller - Clothing";
    }

}

class CashierClothingBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Cashier - Clothing";
    }
}


class ManagerFoodBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Manager - Food";
    }
}

class ConsultantFoodBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Consultant/Seller - Food";
    }
}

class CashierFoodBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Cashier - Food";
    }
}

class ManagerFurnitureBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Manager - Furniture";
    }
}

class ConsultantFurnitureBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Consultant/Seller - Furniture";
    }
}

class CashierFurnitureBuild extends EmployeesBuilder{
    public String getJobType(){
        return "Cashier - Furniture";
    }
}