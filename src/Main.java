public class Main {
    public static void main(String[] args) {
        // Simple coffee
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.description() + " custa: " + myCoffee.cost());

        // Coffee with milk
        myCoffee = new Milk(myCoffee);
        System.out.println(myCoffee.description() + " custa: " + myCoffee.cost());

        // Coffee with sugar
        myCoffee = new Sugar(myCoffee);
        System.out.println(myCoffee.description() + " custa: " + myCoffee.cost());
    }
}
