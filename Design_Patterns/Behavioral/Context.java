package Design_Patterns.Behavioral;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public double execStrategy(double salary, double seniority){
        return strategy.calculateSalaryAddition(salary, seniority);
    }
}
