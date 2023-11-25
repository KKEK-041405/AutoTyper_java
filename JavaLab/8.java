import java.util.Scanner;
class SalaryManagementSystem  {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Assistant_Professor assistant_Professor = new Assistant_Professor();
        Associate_Professor associate_Professor = new Associate_Professor();
        Professor professor = new Professor();
        programmer.setDetails();
        programmer.paySlip();
        assistant_Professor.setDetails();
        assistant_Professor.paySlip();
        associate_Professor.setDetails();
        associate_Professor.setDetails();
        professor.setDetails();
        professor.paySlip();
    }
    
}

 class Employee {
    String Emp_name,Emp_id,Address,Mail_id,Mobile_no;
    int BasicPay;
    void setDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        this.Emp_name = sc.next();
        System.out.print("Employee ID: ");
        this.Emp_id = sc.next();
        System.out.print("Address: ");
        this.Address = sc.next();
        System.out.print("Mail ID: ");
        this.Mail_id = sc.next();
        System.out.print("Mobile Number: ");
        this.Mobile_no = sc.next();
        System.out.print("Basic Pay: ");
        this.BasicPay = sc.nextInt();
    }
    void paySlip(){
        double DA = this.BasicPay*97/100;
        double HRA = this.BasicPay*10/100;
        double PF = this.BasicPay*12/100;
        double SCF = (this.BasicPay*0.1)/100;
        double GS = this.BasicPay-DA-HRA;
        double NS = GS+PF+SCF;
        System.out.println("Pay Slip for John");
        System.out.println("Employee ID: "+this.Emp_id);
        System.out.println("Address: "+this.Address);
        System.out.println("Mail ID: "+this.Mail_id);
        System.out.println("Mobile Number: "+this.Mobile_no);
        System.out.println("Basic Pay: "+this.BasicPay);
        System.out.println("DA: "+DA);
        System.out.println("HRA: "+HRA);
        System.out.println("PF: "+PF);
        System.out.println("Staff Club Fund: "+SCF);
        System.out.println("Gross Salary: "+GS);
        System.out.println("Net Salary: "+NS);
    }
    
}
class Programmer extends Employee{
    Programmer(){
        super();
    }
    
    @Override
    void paySlip() {
        super.paySlip();
    }
    
    @Override
    void setDetails() {
        System.out.println("Enter details for Programmer:");
        super.setDetails();
    }
}
class Assistant_Professor extends Employee{
    Assistant_Professor(){
        super();
    }
    
    @Override
    void paySlip() {
        super.paySlip();
    }

    @Override
    void setDetails() {
        System.out.println("Enter details for Assistant_Professor:");
        super.setDetails();
    }
}
class Associate_Professor extends Employee{
    Associate_Professor(){
        super();
    }
    
    @Override
    void paySlip() {
        super.paySlip();
    }
    
    @Override
    void setDetails() {
        System.out.println("Enter details for Associate_Professor:");
        super.setDetails();
    }
}
class Professor extends Employee{
    Professor(){
        super();
    }
    
    @Override
    void paySlip() {
        super.paySlip();
    }
    
    @Override
    void setDetails() {
        System.out.println("Enter details for Professor:");
        super.setDetails();
    }
}

