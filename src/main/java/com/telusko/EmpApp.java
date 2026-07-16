package main.java.com.telusko;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        EmpSer service = new EmpSer();

        int chc;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Department");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            chc = sc.nextInt();
            sc.nextLine();

            switch (chc) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    service.addEmployee(id, name, department);
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    service.searchEmployee(searchId);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();

                    service.updateEmployee(updateId, newDepartment);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }


        } while (chc != 5);

        sc.close();

    }

}
