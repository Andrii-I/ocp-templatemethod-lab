package lab.assignment.afterrerefactoring.clientcode;

import lab.assignment.afterrerefactoring.CoffeeMaker;
import lab.assignment.afterrerefactoring.MochaCoffee;
import lab.assignment.afterrerefactoring.CapuccinoCoffee;



public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();
        starbuzz.prepareCoffee();

    }

}
