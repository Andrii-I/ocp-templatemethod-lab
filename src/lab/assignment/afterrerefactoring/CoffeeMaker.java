package lab.assignment.afterrerefactoring;

public abstract class CoffeeMaker {

    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();

    protected abstract void finalTouch();
}
