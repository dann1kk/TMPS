package Design_Patterns.Behavioral;


public abstract class AbstractFactory {
    public abstract EmployeesBuilder getEmployeesJobType(String job);

}

class ClothingFactory extends AbstractFactory {
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Manager":
                jobtype = new ManagerClothingBuild();
                break;
            case "Consultant":
                jobtype =  new ConsultantClothingBuild();
                break;
            case "Cashier":
                jobtype = new CashierClothingBuild();
                break;
            default:
                System.out.println("No such job in clothing department!");
        }
        return jobtype;
    }
}

class FoodFactory extends AbstractFactory {
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Manager":
                jobtype = new ManagerFoodBuild();
                break;
            case "Consultant":
                jobtype =  new ConsultantFoodBuild();
                break;
            case "Cashier":
                jobtype = new CashierFoodBuild();
                break;
            default:
                System.out.println("No such job in food department!");
        }
        return jobtype;
    }
}

class FurnitureFactory extends AbstractFactory {
    public EmployeesBuilder getEmployeesJobType(String job){
        EmployeesBuilder jobtype = null;
        switch(job){
            case "Manager":
                jobtype = new ManagerFurnitureBuild();
                break;
            case "Pediater Assistant":
                jobtype =  new ConsultantFurnitureBuild();
                break;
            case "Pediatry Nurse":
                jobtype = new CashierFurnitureBuild();
                break;
            default:
                System.out.println("No such job in furniture department!");
        }
        return jobtype;
    }
}