package Design_Patterns.Structural;

public class CashierEmployee implements StoreEmployeeAPI {

    public void qualification(String department){
        if (department.equalsIgnoreCase("Food")){
            System.out.println("Cashier in Food has to have at least 5 years experience.");
        } else if(department.equalsIgnoreCase("Furniture")){
            System.out.println("Cashier in Furniture has to have at least 6 years experience.");
        } else {
            System.out.println("Cashier in Clothing has to have at least 4 years experience.");
        }
    }
}