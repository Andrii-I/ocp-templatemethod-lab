package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.MochaCoffee;
import lab.assignment.afterrefactoring.CapuccinoCoffee;



public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        CoffeeMaker starbuzz = new CapuccinoCoffee();
        starbuzz.prepareCoffee();

    }

}
