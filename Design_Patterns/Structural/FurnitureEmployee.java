package Design_Patterns.Structural;

public class FurnitureEmployee extends Employees{
    FurnitureEmployee(StoreEmployeeAPI storeAPI){
        super(storeAPI);
        super.setDepartment("Furniture");
    }
    public void work() {
        System.out.println("Working in the Furniture Store!");
    }

}