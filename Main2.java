class Payment {
    void pay(double amount){
        System.out.println("Processing generic payment"+amount);
    }
}
class CreditCard extends Payment{
    @Override 
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via Credit Card");
        
    }
}
class Upi extends Payment{
    void pay(double amount){
        System.out.println( "Paid ₹" + amount + " via UPI");
    }
}
class Main2{
    public static void main(String args[]){
    Payment[] payments = { new CreditCard(), new Upi() };
    for(int i=0;i<2;i++){
        payments[i].pay(500.0);
    }
}
}
