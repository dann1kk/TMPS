package Design_Patterns.Structural;

public class StoreEmployeeAdapter extends Employees {

    private Employees storeEmployee;

    StoreEmployeeAdapter(String department, String job) {
        if (department.equalsIgnoreCase("Food")){
            storeEmployee = new FoodEmployee(job.equalsIgnoreCase("Manager") ?  new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee():  new CashierEmployee());
        } else if (department.equalsIgnoreCase("Furniture")){
            storeEmployee = new FurnitureEmployee(job.equalsIgnoreCase("Manager") ? new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee() :  new CashierEmployee());
        } else {
            storeEmployee = new ClothingEmployee(job.equalsIgnoreCase("Manager") ? new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee() : new CashierEmployee());
        }
    }
    public void workingEmployee(){
        storeEmployee.work();
    }
}