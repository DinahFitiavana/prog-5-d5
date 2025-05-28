public class UserController {
    private final CoffeeMachineService coffeeMachineService;

    public UserController (CoffeeMachineService coffeeMachineService){
        this.coffeeMachineService = coffeeMachineService;
    }

    public void requestCoffee (String flavorCoffee, double amountPaid){
        coffeeMachineService.getCoffee(flavorCoffee, amountPaid);
    }
}
