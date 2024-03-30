package tests;

import decoratorcode.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        assertEquals(5.0, burger.getCost(), 0.01);
    }

    @Test
    public void testAdditionalTopping() {
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        FoodItem burgerWithCheese = new AdditionalTopping(burger, "Cheese", 1.0);
        assertEquals(6.0, burgerWithCheese.getCost(), 0.01);
    }

    @Test
    public void testOrder() {
        Order order = new Order();
        FoodItem burger = new BaseFoodItem("Burger", 5.0);
        FoodItem fries = new BaseFoodItem("Fries", 2.5);
        order.addItem(burger);
        order.addItem(fries);
        assertEquals(7.5, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        assertEquals(90.0, loyaltyStatus.applyDiscount(100.0), 0.01);
    }
}
