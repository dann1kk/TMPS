# Lab.2 Topic: *Structural Design Patterns*

## Theory :
&ensp;&ensp;&ensp;&ensp; In software engineering, the Structural Design Patterns are concerned with how classes and objects are composed to form larger structures. Structural class patterns use inheritance to create a hierarchy of classes/abstractions, but the structural object patterns use composition which is generally a more flexible alternative to inheritance.

Some examples of this kind of design patterns are :
* Adapter- Allows objects with incompatible interfaces to collaborate;
* Bridge- Lets you split a large class, or a set of closely related classes into two separate hierarchies
* Composite- Lets you compose objects into tree structures and then work with these structures as if they were individual objects;
* Filter- Can combines multiple criteria to obtain single criteria.
* Decorator- Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors;
* Facade- Wraps a complex sub-system with a simple abstraction.
* Flyweight- Lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.
* Proxy- Lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object;

## Implementation

In this lab is implemented a project based on store center.
This project illustrates the implementation of the following structural design patterns:
* __Adapter__
* __Bridge__
* __Composite__

&ensp;&ensp;&ensp;&ensp; We have a store which has employees that are working in 3 different departments and have a set of attributes like: name, surname, age, salary, job type and a list of colleagues.
Each department has 3 types of available job types: manager, consultant and cashier. The main object of our project is the __StoreEmployee__. This abstract class also has an attribute which is an interface used to differentiate employees between departments, __StoreEmployeeAPI__.
The __StoreEmployee__ is extended by the class __Employees__ that has all the basic attributes with the information about the specific employee and the list of colleagues. 
1. Adapter
   Adapter is a design pattern that allows objects with incompatible interfaces to collaborate. For the Adapter pattern it has implemented 2 classes, the __StoreEmployeeAdapter__ 
and __EmployeeBuilder__. In the __EmployeeBuilder__, first we see if the department is valid, create the adapter and then execute the specific method, as we have 3 specialized classes __FoodEmployee__, __FurnitureEmployee__ and __ClothingEmployee__ .
~~~
StoreEmployeeAdapter(String department, String job) {
if (department.equalsIgnoreCase("Food")){
storeEmployee = new FoodEmployee(job.equalsIgnoreCase("Manager") ?  new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee():  new CashierEmployee());
} else if (department.equalsIgnoreCase("Furniture")){
storeEmployee = new FurnitureEmployee(job.equalsIgnoreCase("Manager") ? new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee() :  new CashierEmployee());
} else {
storeEmployee = new ClothingEmployee(job.equalsIgnoreCase("Manager") ? new ManagerEmployee() : (job.equalsIgnoreCase("Consultant")) ? new ConsultantEmployee() : new CashierEmployee());
}
}
~~~
~~~
public class FurnitureEmployee extends Employees{
FurnitureEmployee(StoreEmployeeAPI storeAPI){
super(storeAPI);
super.setDepartment("Furniture");
}
public void work() {
System.out.println("Working in the Furniture Store!");
}
~~~
2. Bridge
   Bridge is a design pattern that lets you split a large class, or a set of closely related classes into two separate hierarchies.

The variable __storeAPI__ is used in the __Employee__ class which is the bridge between the implementation and the abstract class __StoreEmployee__. In fact, it is used a reference to 
the interface __StoreEmployeeAPI__. Depending on the job of the employee, we have different classes which implement different methods from the interface.
~~~
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
~~~
To create an object(employee) in this case it is necessary to  give to it also a reference to the class which implements the API depending on the job and department of the employee.
3. Composite design pattern lets you compose objects into tree structures and then work with these structures as if they were individual objects;
   
In this case, in the __Employees__ class, where we have all the basic attributes, it was added a group of objects in the form of a list of __colleagues__, this group of objects 
can be treated in a similar manner, which actually represents the implementation of the __Composite Pattern__.
~~~
public class Employees extends StoreEmployee {
    private String name;
    private String surname;
    private Integer age;
    private Integer salary;
    private String department;
    private String job;
    private List<Employees> colleagues;

    public void addHiredColleague(Employees newEmployee) {
        this.colleagues.add(newEmployee);
    }
    public void removeFiredColleague(Employees firedEmployee){
        this.colleagues.remove(firedEmployee);
    }
~~~
