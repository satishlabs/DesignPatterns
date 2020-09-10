package com.dp.builder.pizza;

/*
 we should use builder design pattern when a class have multiple properties, 
 some of which are optional and some mandatory for an object creation that is constructor or 
 static factories of such a class would require more than 4 to 5 parameters.
 
 
 A class with many constructors, where each constructor calls a more specific constructor in the hierarchy, 
 which has more parameters than itself, providing default values for the extra parameters.
  The next constructor does the same until there is no left.
 * */

public class Test {
	public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder(6, BreadType.THICK_CRUST)
                .withCheese(true)
                .withOlive(true)
                .build();
        System.out.println(pizza);
    }
}
