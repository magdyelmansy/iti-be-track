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


            if (num > largest) largest = num;

            if (num < smallest) smallest = num;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        System.out.println("______ Exercise 3 _______");

        int score = 75;
        char grade;

        // Pass/Fail check
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Grade assignment
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Grade: " + grade);

        System.out.println("______ Exercise 4 _______");

        // For loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // While loop
        System.out.print("While Loop: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j);
            if (j < 5) {
                System.out.print(" ");
            }
            j++;
        }
        System.out.println();

        // Do-while loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do {
            System.out.print(k);
            if (k < 5) {
                System.out.print(" ");
            }
            k++;
        } while (k <= 5);

        System.out.println();

        System.out.println("______ Exercise 5 _______");

        double num1 = 7;
        double num2 = 3;
        char operator = '+';

        String again = "y";

        while (again.equals("y")) {
            if (operator == '+') {
                double result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator == '-') {
                double result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator == '*') {
                double result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    double result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            }

            again = "n";
        }

        System.out.println("Thank you for using the calculator.");

        System.out.println("________ Final Exercise ___________");

        Employee employee = new Employee("Alice", 50000.0);
        Employee manager = new Manager("Bob", 80000.0, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
    }
}
