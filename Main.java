public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        FlavorCheck flavorCheck = new FlavorCheck();
        Brewer brewer = new Brewer();
        CoffeeMachineService coffeeMachineService = new CoffeeMachineService(payment, flavorCheck, brewer);
        UserController userController = new UserController(coffeeMachineService);

        userController.requestCoffee("Mocha", 200);
        userController.requestCoffee("Espresso", 10);
        userController.requestCoffee("Black", 140);
    }
}
