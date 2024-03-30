import decoratorcode.*;

// Driver program
public class Driver {
    public static void main(String[] args) {
        // Create food items
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        FoodItem fries = new BaseFoodItem("Fries", 2.5);
        FoodItem hotdog = new BaseFoodItem("HotDog", 5.0);

        // Add toppings
        FoodItem burgerWithCheese = new AdditionalTopping(burger, "Cheese", 1.0);
        FoodItem burgerWithBaconAndCheese = new AdditionalTopping(burgerWithCheese, "Bacon", 1.5);

        // Create order
        Order order = new Order();
        order.addItem(burgerWithBaconAndCheese);
        order.addItem(fries);
        order.addItem(hotdog);

        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply discount based on loyalty status
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1); // 10% discount for example
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after discount: $" + discountedCost);
    }
}
