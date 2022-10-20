package Design_Patterns.Creational;

public class Factory {
    public static Factory instance;

    private Factory(){

    }
    public static synchronized Factory getInstance(){
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public AbstractFactory getFactory(String department){
        AbstractFactory fc = null;
        switch (department) {
            case "Clothing" -> {
                fc = new ClothingFactory();
                System.out.println("\nEmployee Successfully Added!");
            }
            case "Food" -> {
                fc = new FoodFactory();
                System.out.println("\nEmployee Successfully Added!");
            }
            case "Furniture" -> {
                fc = new FurnitureFactory();
                System.out.println("\nEmployee Successfully Added!");
            }
            default -> System.out.println("Nonexistent department in our store!");
        }
        return fc;

    }
}