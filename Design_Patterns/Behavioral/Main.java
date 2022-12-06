package Design_Patterns.Behavioral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please first select the department of the employee that you would like to add: ");
        String department = input.readLine();
        System.out.println("Name of the employee ");
        String name = input.readLine();
        System.out.println("Surname of the employee ");
        String surname = input.readLine();
        System.out.println("Age of the employee ");
        Integer age = Integer.parseInt(input.readLine());
        System.out.println("Salary of the employee ");
        Integer salary = Integer.parseInt(input.readLine());
        System.out.println("Seniority of the employee ");
        Integer seniority = Integer.parseInt(input.readLine());
        System.out.println("Enter the job of the employee according to the department that was specified ");
        String job = input.readLine();
        double newsalary=0;
        if(seniority>5){
            Context context=new Context(new SeniorityAddition());
            System.out.println("Your new salary (after additions) in 2022 will be:" + context.execStrategy(salary,seniority) );
            newsalary = context.execStrategy(salary,seniority);

        } else {
            Context context = new Context(new YoungSpecialistsAddition());
            System.out.println("As a young specialist you get a salary addition for motivation.");
            System.out.println("Your new salary starting from january 2022 will be " + context.execStrategy(salary,seniority));
            newsalary = context.execStrategy(salary,seniority);
        }


        Factory fc = Factory.getInstance();
        AbstractFactory employeesfc = fc.getFactory(department);
        EmployeesBuilder employebuild = employeesfc.getEmployeesJobType(job);
        employebuild.addName(name);
        employebuild.addSurname(surname);
        employebuild.addAge(age);
        employebuild.addSalary((int) newsalary);
        employebuild.addSeniority(seniority);
        employebuild.addDepartment(department);
        employebuild.addJob(job);
        employebuild.getJobType();



    }
}
