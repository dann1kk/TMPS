package Design_Patterns.Structural;

public class FoodEmployee extends Employees{
    FoodEmployee(StoreEmployeeAPI storeAPI){
        super(storeAPI);
        super.setDepartment("Food");
    }
    public void work() {
        System.out.println("Working in the Food Department");
    }

}