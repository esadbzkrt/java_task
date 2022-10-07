public class Main {

        public static void main(String[] args) {
            Employee employee1 = new Employee("Ali", 2000, 45, 1985);
            Employee employee2 = new Employee("Veli", 3000, 35, 1995);
            Employee employee3 = new Employee("Ayse", 2500, 40, 2005);
            Employee employee4 = new Employee("Fatma", 2200, 37, 2010);
            Employee employee5 = new Employee("Kemal", 2750, 42, 1975);

            Employee[] employees = {employee1, employee2, employee3, employee4, employee5};


            for (Employee employee : employees) {
                System.out.println(employee);
                System.out.println("Tax: " + employee.tax());
                System.out.println("Bonus: " + employee.bonus());
                System.out.println("Raise Salary: " + employee.raiseSalary());
                System.out.println("----------------------------");
            }
        }


}