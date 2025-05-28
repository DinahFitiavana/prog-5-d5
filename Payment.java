public class Payment {
    private double priceCoffee = 50;

    public boolean isPaid(double amountPaid){
       return amountPaid >= priceCoffee;
    }
}
