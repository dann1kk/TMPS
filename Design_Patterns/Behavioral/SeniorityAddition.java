package Design_Patterns.Behavioral;

public class SeniorityAddition implements Strategy {
    @Override
    public double calculateSalaryAddition(double salary, double seniority) {
        return salary+0.01*salary*seniority;
        // for each year worked in the hospital we add 1 % to the salary
    }
}
