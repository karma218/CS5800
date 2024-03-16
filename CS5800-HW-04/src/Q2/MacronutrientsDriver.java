package Q2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class MacronutrientsDriver {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Naruto", DietPlan.NO_RESTRICTION),
                new Customer("Sasuke", DietPlan.PALEO),
                new Customer("Lee", DietPlan.VEGAN),
                new Customer("Gara", DietPlan.PALEO),
                new Customer("Tsunade", DietPlan.NUT_ALLERGY),
                new Customer("Jiraya", DietPlan.NO_RESTRICTION)
        );

        for (Customer customer : customers) {
            BalancedMealFactory factory = new BalancedMealFactory();
            MacronutrientFactory carbFactory = factory.getCarbFactory();
            MacronutrientFactory proteinFactory = factory.getProteinFactory();
            MacronutrientFactory fatFactory = factory.getFatFactory();

            Macronutrient carb = carbFactory.getRandomMacronutrient(null);
            Macronutrient protein = proteinFactory.getRandomMacronutrient(customer.getDietPlan());
            Macronutrient fat = fatFactory.getRandomMacronutrient(customer.getDietPlan());

            System.out.println(String.format("Customer: %s, Diet Plan: %s\n  Carb: %s\n  Protein: %s\n  Fat: %s\n",
                    customer.getName(), Optional.ofNullable(customer.getDietPlan()), carb.getName(), protein.getName(), fat.getName()));
        }
    }
}