import java.rmi.activation.ActivationGroup_Stub;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Employees information: \n");
        Employee[] employ = new Employee[10];
        employ[0] = new Employee("Akhmetov Samat Aralovich", 1, 500);
        employ[1] = new Employee("Braun Oleg Vladimirovich", 3, 550);
        employ[2] = new Employee("Dobraya Anna Sergeyevna", 2, 540);
        employ[3] = new Employee("Kim Aleksey Antonovich", 5, 480);
        employ[4] = new Employee("Ivanov Ivan Romanovich", 4, 600);
        employ[5] = new Employee("Sabirov Nurlan Muratovich", 2, 660);
        employ[6] = new Employee("Makina Saule Serikovna", 3, 584);
        employ[7] = new Employee("Lukin Igor Nikolayevich", 1, 630);
        employ[8] = new Employee("Saparov Akim Zhandosovich", 5, 555);
        employ[9] = new Employee("Kurina Olga Pavlovna", 2, 623);

        ///////  ПРОВЕРКА РАБОТЫ КОДОВ: БАЗОВЫЙ УРОВЕНЬ   //////////////
        Employee.printAll(employ);
        System.out.println(Employee.calculateExpenses(employ));
        Employee.calculateAverSalary(employ);
        Employee.findMinSalary(employ);
        Employee.findMaxSalary(employ);
        Employee.printNames(employ);
        System.out.println(employ[2].getId());

        /////////////// ПОВЫШЕННОЙ  СЛОЖНОСТИ /////////////////////

        System.out.println("New Methods: level two");
        Employee.indexingSalary(employ,10);
        Employee.minSalaryInDept(employ, 3);
        Employee.maxSalaryInDept(employ, 1);
        System.out.println(Employee.expensesInDept(employ, 4));
        Employee.averSalaryInDept(employ,3);
        Employee.onlyDepartment(employ, 5);

    }

}