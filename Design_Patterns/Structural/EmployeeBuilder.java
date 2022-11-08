package Design_Patterns.Structural;

public class EmployeeBuilder {
    public void build(String department, String job){
        if (department.equalsIgnoreCase("Food") || department.equalsIgnoreCase("Furniture") || department.equalsIgnoreCase("Clothing")){
            StoreEmployeeAdapter storeAdapter = new StoreEmployeeAdapter(department,job);
            storeAdapter.workingEmployee();
        } else {
            System.out.println("No such department in the Store");
        }
    }
}