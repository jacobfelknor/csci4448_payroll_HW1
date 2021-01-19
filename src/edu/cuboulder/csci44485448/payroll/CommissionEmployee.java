package edu.cuboulder.csci44485448.payroll;

public class CommissionEmployee extends Employee{
    private double percentage;
    public CommissionEmployee(String name, double salary, double percentage) {
//      Note: the salary field in this case keeps track of the total revenue brought in by employee
        super(name, salary);
        this.percentage = percentage;
    }

    public double getPercentage(){
        return this.percentage;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * getPercentage();
    }
}
