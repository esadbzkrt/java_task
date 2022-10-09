public class Main {

        public static void main(String[] args) {
            Employee employee1 = new Employee("Ahmet", 3700, 50, 1995);
            Employee employee2 = new Employee("Hasan", 6000, 35, 1985);
            Employee employee3 = new Employee("Metin", 5500, 40, 2000);
            Employee employee4 = new Employee("Can", 8000, 45, 2007);
            Employee employee5 = new Employee("Kemal", 6000, 45, 1975);

            Employee[] employees = {employee1, employee2, employee3, employee4, employee5};


            for (Employee employee : employees) {
                System.out.println("");
                System.out.println(employee);
                System.out.println("Tax: " + employee.tax());
                System.out.println("Bonus: " + employee.bonus());
                System.out.println("Raise Salary: " + employee.raiseSalary());
                System.out.println("");
            }
        }


}