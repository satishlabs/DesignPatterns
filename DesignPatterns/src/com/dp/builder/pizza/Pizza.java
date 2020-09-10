package com.dp.builder.pizza;

public class Pizza {
	private int size;
	private BreadType breadType;
	
	private boolean cheese;
	private boolean olive;
	private boolean pepper;
	
	public Pizza(PizzaBuilder pizzaBuilder) {
		this.size = pizzaBuilder.size;
		this.breadType = pizzaBuilder.breadType;
		
		this.cheese = pizzaBuilder.cheese;
        this.olive = pizzaBuilder.olive;
        this.pepper = pizzaBuilder.pepper;
	}
	
	public static class PizzaBuilder{

		 //Mandatory Parameters
        private int size;
        private BreadType breadType;
 
        //Optional Parameters
        private boolean cheese;
        private boolean olive;
        private boolean pepper;
        
        public PizzaBuilder(int size, BreadType breadType) {
            this.size = size;
            this.breadType = breadType;
        }
 
        public PizzaBuilder withCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }
        public PizzaBuilder withOlive(boolean olive) {
            this.olive = olive;
            return this;
        }
        public PizzaBuilder withPepper(boolean pepper) {
            this.pepper = pepper;
            return this;
        }
 
        public Pizza build() {
            return new Pizza(this);
        }
		
	}
}
