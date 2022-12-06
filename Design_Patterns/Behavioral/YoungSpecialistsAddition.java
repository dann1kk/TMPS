package Design_Patterns.Behavioral;

public class YoungSpecialistsAddition  implements Strategy{
    @Override
    public double calculateSalaryAddition(double salary, double seniority) {
        return salary+seniority*0.03*salary;
        // for young specialists we add 3% to the salary as a motivation
    }
}