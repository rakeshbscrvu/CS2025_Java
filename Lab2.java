import java.util.Scanner;

class Employee {
    private String name;
    private String department;
    private int age;
    private double salary;

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Age        : " + age);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("-----------------------------------");
    }

    public void updateSalary(double increment) {
        this.salary += increment;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(name, dept, age, salary);
        }

        for (int i = 0; i < args.length && i < n; i++) {
            try {
                double increment = Double.parseDouble(args[i]);
                employees[i].updateSalary(increment);
            } catch (Exception e) {}
        }

        for (Employee emp : employees) {
            emp.displayDetails();
        }

        sc.close();
    }
}
