package introducaoOOP.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double increase;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public double IncreaseSalary(){
        double p = (grossSalary * increase) / 100;
        return NetSalary() + p;
    }

    public String discount(){
        return name
                +String.format(", $ %.2f",NetSalary());
    }

    public String updated(){
        return name
                +String.format(", $ %.2f",IncreaseSalary());
    }
}
