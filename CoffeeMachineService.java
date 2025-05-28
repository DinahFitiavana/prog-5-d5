public class CoffeeMachineService {
    private final Payment payment;
    private final FlavorCheck flavorCheck;
    private final Brewer brewer;

    public CoffeeMachineService(Payment payment, FlavorCheck flavorCheck, Brewer brewer){
        this.payment = payment;
        this.flavorCheck = flavorCheck;
        this.brewer = brewer;
    }

    public void getCoffee (String flavorCoffee, double amountPaid){
        if (!payment.isPaid(amountPaid)) {
            System.out.println("Payment failed.");
            return;
        }

        if (!flavorCheck.isAvailable(flavorCoffee)) {
            System.out.println("Selected coffee's flavor is not available.");
            return;
        }

        brewer.brew(flavorCoffee);
    }
    
}