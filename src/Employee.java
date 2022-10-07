
public class Employee {

    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int year = 2021;
        if (year - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (year - this.hireYear > 9 && year - this.hireYear < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        return "Name: " + this.name + ", Salary: " + this.salary + ", Work Hours: " + this.workHours + ", Hire Year: " + this.hireYear;
    }


}
