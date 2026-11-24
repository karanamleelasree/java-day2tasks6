class Employee{
    double baseSalary;
    double calculateSalary(){
        return baseSalary;
    }
}
class SalesEmployee extends Employee{
    double bonus ;
    double calculateSalary(){
        return super.calculateSalary() + bonus;
    }
}
class Main1{
    public static void main(String args[]){
        SalesEmployee s = new SalesEmployee();
        s.baseSalary = 100000;
        s.bonus = 20000;
        System.out.println("baseSalary :"+s.baseSalary);
        System.out.println("bonus:"+s.bonus);
        System.out.println("TotalcalculatedSalary:"+s.calculateSalary());
    }
}