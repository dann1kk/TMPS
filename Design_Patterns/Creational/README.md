# Lab.1 Topic: *Creational Design Patterns*

## Theory :

In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.

Some examples of this kind of design patterns are :

   * Singleton
   * Builder
   * Prototype
   * Object Pooling
   * Factory Method
   * Abstract Factory


## Implementation

__The following laboratory work implemented a store human resources and departments.__

__This project illustrates the implementation of the following creational design patterns:__
   * Singleton
   * Builder
   * Factory Method
   * Abstract Factory

In this laboratory work we have a store which has employees that are working in 3 different departments and have a set of attributes like: name, surname, age, salary and job type.
But the idea of mapping a job to a certain employee while instatiating an object of this type depends on some builder methods which are taken by specific factory methods that corresponds to a specific department. In other words, the idea is that
it should be impossible to create a Food Consultant, for example, in the Clothing department.

__1.Singleton__

Singleton is a design pattern that restricts the instantiation of a class to one "single" instance. 

~~~
 public static synchronized Factory getInstance(){
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
 ~~~

__2.Builder__

Builder is a design pattern that allows to produce different objects using the same code and constructs complex objects step by step.
In this case, the creation of an employee is seen as a complex object creation.

First, in the process of creation of an object, it is instatiated the factory depending on the department that is specified:


~~~
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
~~~
Then we chose the builder method depending on the factory:
~~~
class FurnitureFactory extends AbstractFactory{
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
 ~~~

And then we get to the corresponding builder method, that can create different corresponding objects:

~~~
public EmployeesBuilder(){
        employee=new StoreEmployee();

    }
    public void addName(String name) {
        employee.setName(name);
    }

    public void addSurname(String surname) {
        employee.setSurname(surname);
    }

    public void addAge(Integer age) {
        employee.setAge(age);
    }

    public void addSalary(Integer salary) {
        employee.setSalary(salary);
    }

    public void addDepartment(String department) {
        employee.setDepartment(department);
    }

    public void addJob(String job) {
        employee.setJob(job);
    }
    public abstract String getJobType();

}
~~~

In other words, we provide a flexible solution of various StoreEmployee object creation with same creational functions.

__3.Factory__

The idea of factory pattern is that subclasses are responsible to create instance of the class.
In this example, the factory methods are obtained by defining an abstract class AbstractFactory , but the subclases (ClothingFactory, FoodFactory, FurnitureFactory) decide which class to instantiate, based on the department jobtype:


~~~
class FurnitureFactory extends AbstractFactory{
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
~~~

__4.Abstract factory__

Abstract factory is used to kind of isolate the client code from concrete classes implementation and it is realised via an implementation 
of an abstract class for creating related or dependent objects without specifying their concrete sub-classes. 
In other words, we have an additional level of abstractisation, the AbstractFactory class defines Factory Methods for each type of new object that is created :

~~~
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
~~~
