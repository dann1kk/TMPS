package Design_Patterns.Structural;

public abstract class StoreEmployee {

    protected StoreEmployeeAPI storeAPI;

    public StoreEmployee(){

    }
    public StoreEmployee(StoreEmployeeAPI storeAPI){
        this.storeAPI = storeAPI;
    }
    abstract void work();
    abstract String getInfo();
    abstract void qualification();

}