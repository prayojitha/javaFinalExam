/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Employee implements Comparable<Employee> {

    private long empId;
    private String empName;
    private double empSalary;

    public Employee(long empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "empId=" + empId
                + ", empName='" + empName + '\''
                + ", empSalary=" + empSalary
                + '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (empId == o.empId) {
            return 0;
        } else if (empId > o.empId) {
            return 1;
        } else {
            return -1;
        }
    }
}
