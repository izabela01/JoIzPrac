package qa.emp;

import java.util.Random;
import java.util.ArrayList;

public class EmployeeTest {

    public static void main(String[] args) {
//        Employee jo = new Employee("Jo", "Day",50);
//        Employee rachel = new Employee("Rachel", "Morris",28);
//        Manager lj = new Manager("LJ","Stewart",30);
        Employee[] employees = {new Employee("Jo", "Day",50),
                                new Employee("Rachel", "Morris",29),
                                new Manager("LJ", "Stewart",30)};
        for(int i = 0; i < employees.length; i++ ) {
            System.out.println("Employee Details: ");
           // System.out.println(employees[i].getName() + "\t\t" + employees[i].getAge());
            System.out.println(employees[i].getDetails());

        }

        Employee employeeRand = new Employee("k", "l", 99);
        Manager mymanager = (Manager)employees[2];
        mymanager.addEmployee(employees[0]);
        mymanager.addEmployee(employees[1]);

        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        employees1.add(new Employee("Jo", "Day",50));
        employees1.add(new Employee("Izzy", "Day",21));
        employees1.add(new Employee("Ed", "Day",21));
        for(Employee e : employees1){
            System.out.println(e.getDetails());
        }



        for(int i = 0; i < 3; i++){

//            Employee empo4 = Employee.createRandomEmployee();

           employees1.add(Employee.createRandomEmployee());


        }
// PASTE HERE !!!!!!!!!


        System.out.println(employees1.get(3).getDetails());
        System.out.println(employees1.get(4).getDetails());






//        System.out.println("Employee Details: ");
//        System.out.println(jo.getName() + "\t\t" + jo.getAge());
//        rachel.setRetirementAge(40);
//        rachel.incAge();
//        jo.incAge();
//        System.out.println("Employee Details: ");
//        System.out.println(jo.getName() + "\t\t" + jo.getAge());
//        System.out.println(rachel.getName() + "\t\t" + rachel.getAge());
//        for(int i=0; i <= 30; i++){
//            rachel.incAge();
//            jo.incAge();
//            System.out.println("Employee Details: ");
//            System.out.println(jo.getName() + "\t\t" + jo.getAge());
//            System.out.println(rachel.getName() + "\t\t" + rachel.getAge());
//        }

//        System.out.println("Employee Details: ");
//        System.out.println(jo.getName() + "\t\t" + jo.getAge());
//        System.out.println(rachel.getName() + "\t\t" + rachel.getAge());
//        System.out.println(lj.getName() + "\t\t" + lj.getAge());


    }
}
