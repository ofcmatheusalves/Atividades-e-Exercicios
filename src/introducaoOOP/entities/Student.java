package introducaoOOP.entities;

public class Student {
    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;
    public double grade;

    public double reportCard(){
        return gradeOne + gradeTwo + gradeThree;
    }

    public void result( double grade){
        this.grade += grade;
        if (reportCard() < 60.0){
            double p = 60.00 - reportCard();
            System.out.println("FAILED");
            System.out.printf("MISSING = %.2f\n",p);
        }else {
            System.out.println("PASS");
        }
    }
}