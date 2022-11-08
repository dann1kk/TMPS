package Design_Patterns.Structural;

public class ConsultantEmployee implements StoreEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Food")){
            System.out.println("Assistant in Food Store has to have at least 3 years of experience.");
        } else if(department.equalsIgnoreCase("Furniture")){
            System.out.println("Assistant in Furniture Store has to have at least 2 years of experience.");
        } else {
            System.out.println("Assistant in Clothing Store has to have at least 5 years of experience.");
        }
    }
}