package lab.assignment.afterrerefactoring;

public class AmericanoCoffee extends CoffeeMaker {
    @Override
    protected void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}