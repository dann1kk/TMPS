package Design_Patterns.Structural;

public class ManagerEmployee implements StoreEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Food")){
            System.out.println("Doctor in Food has to have at least 6 years of experience.");
        } else if(department.equalsIgnoreCase("Furniture")){
            System.out.println("Doctor in Furniture has to have at least 3 years of experience.");
        } else {
            System.out.println("Doctor in Clothing has to have at least 9 years of experience.");
        }
    }
}