package day2_functional_interface;

public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
/*
	Task: create a program that will help a farmer maintain his inventory. Find all the green apples and find all the apples that are heavier than 200g

		create a class Apple
		create instance variables color and weight
		create a constructor to initialize the variables
		encapsulate and override toString

		create an interface ApplePredicate
		create an abstract method test()
			parameter: Apple
			return: boolean

		create a class AppleGreenColorPredicate
		implement the ApplePredicate
		implement test method to check for green color apples

		create a class AppleHeavyPredicate
		implement the ApplePredicate
		implement test method to check for apples more than 200g

		create a runner class
		create an ArrayList of Apples
		create a method to filter the apples based on a ApplePredicate argument
			parameter: List<Apple>, ApplePredicate
			return: List<Apple>
 */