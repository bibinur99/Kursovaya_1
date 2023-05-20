import java.sql.SQLOutput;
import java.util.Arrays;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private final int id;
    static int counter = 1;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {     // in Euro
        this.salary = salary;
    }

    public static void printAll(Employee[] arr) {  // печать всех сотрудников
        System.out.println("List of Employees:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printNames(Employee[] arr) {  // печать имен всех сотрудников
        System.out.println("Employees' names:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
        System.out.println();
    }

    public static double calculateExpenses(Employee[] arr) {  // вычисление затрат на ЗП
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        return sum;
        //System.out.println(sum);
    }

    public static void calculateAverSalary(Employee[] arr) {   // вычисление средне ЗП
        double val = calculateExpenses(arr);
        double aver = val / arr.length;
        System.out.println("Average salary is " + aver);
        System.out.println();
    }

    public static void findMinSalary(Employee[] arr) {     // вычисление мин ЗП
        double min = 1000;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < min) {
                min = arr[i].getSalary();
                index = i;
            }
        }
        System.out.println("Minimal Salary has " + arr[index].getFullName() + " " + min);
        System.out.println();
    }

    public static void findMaxSalary(Employee[] arr) { // вычисление макс ЗП
        double max = 10;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() > max) {
                max = arr[i].getSalary();
                index = i;
            }
        }
        System.out.println("Maximal Salary has " + arr[index].getFullName() + " " + max);
        System.out.println();
    }
    ///////////////  МЕТОДЫ: ПОВЫШ СЛОЖНОСТИ  /////////////////////////////////////
    public static void onlyDepartment(Employee[] arr, int dep) {
        System.out.println("Department "+ dep+ ":" );
        for (int k = 0; k < arr.length; k++) {
            if (dep == arr[k].getDepartment()) {
                System.out.println(arr[k].getFullName());
            }
        }
    }
    /////////////
    public static void  indexingSalary(Employee[] arr,int val) {
        System.out.println("Increased salary: ");
         for (int i = 0; i < arr.length; i++) {
            arr[i].setSalary(arr[i].getSalary() + (arr[i].getSalary() * val / 100));
            System.out.println(arr[i]);
        }
    }

       public static void minSalaryInDept(Employee [] arr, int dept) {
        double min = 1100;
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (dept == arr[i].getDepartment() && arr[i].getSalary() < min) {
                min = arr[i].getSalary();
                index = i;
            }
        }
        System.out.println("Min Salary in Dept " + dept +" has " +
                arr[index].getFullName() + ", " + min);
        System.out.println();
    }
    public static void maxSalaryInDept(Employee[] arr, int dept) {
        double max = 10;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dept == arr[i].getDepartment() && arr[i].getSalary() > max) {
                max = arr[i].getSalary();
                index = i;
            }
        }
        System.out.println("Max Salary in Dept " + dept + " has " +
                arr[index].getFullName() + ", " + max);
        System.out.println();
    }
    public static double expensesInDept(Employee[] arr, int dept) {  // вычисление затрат на ЗП
        double exp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dept == arr[i].getDepartment()) {
                exp += arr[i].getSalary();
            }
        }
        return exp;
    }
    public static void averSalaryInDept(Employee[] arr,int dept) {
        double sum = expensesInDept(arr,dept);
        double averExp = sum / arr.length;
        System.out.printf("Average salary in department "+ dept + " is " + "%.2f",averExp);
        System.out.println();
    }
    @Override
    public String toString() {
        return "name: " + fullName + ",  department: " + department + ", salary: " + salary + ", id:" + id;
    }
}





