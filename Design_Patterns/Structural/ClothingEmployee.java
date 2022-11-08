package Design_Patterns.Structural;

public class ClothingEmployee extends Employees{
    ClothingEmployee(StoreEmployeeAPI storeAPI){
        super(storeAPI);
        super.setDepartment("Clothing");
    }
    public void work() {
        System.out.println("Working in the Clothing Store!");
    }

}