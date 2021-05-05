/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import static java.util.Collections.sort;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author keerthi prayojitha bere
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp_1 = new Employee(1, "Keerthi", 4000);
        Employee emp_2 = new Employee(2, "Prayojitha", 3000);
        Employee emp_3 = new Employee(3, "Bere", 10000);
        Employee emp_4 = new Employee(4, "Milli", 7000);
        Employee emp_5 = new Employee(5, "Kit", 2000);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(emp_3);
        employeeList.add(emp_2);
        employeeList.add(emp_5);
        employeeList.add(emp_1);
        employeeList.add(emp_4);

        System.out.println("Before Sort::");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
//        employeeList.stream()
//                .forEach(System.out::println);

        sort(employeeList);

        System.out.println("After Sort By Id::");

        for (Employee e : employeeList) {
            System.out.println(e);
        }

        System.out.println("Sort By Name::");

        sort(employeeList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    String s_1 = (String) ((Employee) o1).getEmpName();
                    String s_2 = (String) ((Employee) o2).getEmpName();

                    return s_1.compareTo(s_2);
                }
                return 0;
            }
        });

        for (Employee e : employeeList) {
            System.out.println(e);
        }

        System.out.println("Sort By Salary::");

        sort(employeeList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Double d_1 = (double) ((Employee) o1).getEmpSalary();
                    Double d_2 = (double) ((Employee) o2).getEmpSalary();

                    return d_1.compareTo(d_2);
                }
                return 0;
            }
        });
        for (Employee e : employeeList) {
            System.out.println(e);
        }

    }
}
