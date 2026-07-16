package main.java.com.telusko;

public class Employee {

    private int empId;
    private String empName;
    private String empDep;

    public Employee(int empId, String empName, String empDep){
        this.empId= empId;
        this.empName = empName;
        this.empDep = empDep;
    }

    public void setEmpId(int empId){
        this.empId =empId;
    }

    public void setEmpName(String empName){
        this.empName =empName;
    }

    public void setEmpDep(String empDep){
        this.empDep =empDep;
    }

    public int getEmpId(){
        return empId;
    }

    public String getEmpName(){
        return empName;
    }

    public String getEmpDep(){
        return empDep;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDep='" + empDep + '\'' +
                '}';
    }
}
