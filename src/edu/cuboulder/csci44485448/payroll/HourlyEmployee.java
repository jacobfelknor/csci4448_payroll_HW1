package edu.cuboulder.csci44485448.payroll;

public class HourlyEmployee extends Employee{
    private int numHours;
    public HourlyEmployee(String name, double salary, int numHours) {
        super(name, salary);
        this.numHours = numHours;
    }

    public int getHours(){
        return this.numHours;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * this.getHours();
    }
}
