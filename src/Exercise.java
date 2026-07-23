class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    private String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }



    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }
}


public class Exercise {
    public static void main(String[] args) {

        int[] numbers = {45, 22, 89, 16, 90, 33};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {


            if (num > largest)
                largest = num;

            if (num < smallest)
                smallest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        System.out.println("________ Final Exercise ___________");

        Employee employee = new Employee("Alice", 50000.0);
        Employee manager = new Manager("Bob", 80000.0, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}
