package main.java.com.telusko;

import java.util.ArrayList;

public class EmpSer {


    private ArrayList<Employee> employees = new ArrayList<>();





    public void addEmployee(int empId, String empName, String empDep){
        Employee emp= new Employee(empId, empName, empDep);
        employees.add(emp);
    }

    public void viewEmployees(){
        for (Employee emp : employees) {

            System.out.println(emp);
        }
    }

    public void searchEmployee(int empId){

        for(Employee emp:employees){
            if(emp.getEmpId() == empId){
                System.out.println(emp);
                return;
            }

        }
        System.out.println("Employee not found");

    }


    public void updateEmployee(int empId, String newDepartment){

        for(Employee emp: employees){
            if(emp.getEmpId() == empId){
                emp.setEmpDep(newDepartment);
                System.out.println("Department updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found");
    }









}
