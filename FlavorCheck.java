import java.util.Arrays;
import java.util.List;

public class FlavorCheck {

    private final List<String> AvailableCoffee = Arrays.asList("Espresso", "Latte", "Cappuccino", "Mocha");
    
    public boolean isAvailable (String flavorCoffee){
        return AvailableCoffee.contains(flavorCoffee);
    }
}
