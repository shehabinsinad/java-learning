// Question:
//
// Write an Employee Salary Calculator:
//
// - Create an Employee class with name and basicSalary fields.
// - Store details of 5 employees.
// - Write a method that calculates the salary after adding
//   a 20% bonus.
// - Write a method to find the highest basic salary.
// - Print the final salary of each employee.
// - Print the employee with the highest basic salary.

class Employee {
    String name;
    double basicSalary;

    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

public class EmployeeSalaryCalculator {

    public static double calculateSalary(double basicSalary) {
        return basicSalary + (basicSalary * 0.20);
    }

    public static double findHighestSalary(double[] salaries) {
        double highest = salaries[0];

        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > highest) {
                highest = salaries[i];
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        String[] names = {
            "Rahul",
            "Anjali",
            "Vivek",
            "Meera",
            "Arun"
        };

        double[] salaries = {
            25000,
            32000,
            28000,
            40000,
            30000
        };

        Employee[] employees = new Employee[names.length];

        for (int i = 0; i < names.length; i++) {
            employees[i] = new Employee(names[i], salaries[i]);
        }

        System.out.println("Final Salaries:");

        for (Employee e : employees) {
            double finalSalary = calculateSalary(e.basicSalary);
            System.out.println(e.name + " - ₹" + finalSalary);
        }

        double highest = findHighestSalary(salaries);

        System.out.println();

        for (Employee e : employees) {
            if (e.basicSalary == highest) {
                System.out.println("Highest Salary: " + e.name + " - ₹" + e.basicSalary);
            }
        }
    }
}