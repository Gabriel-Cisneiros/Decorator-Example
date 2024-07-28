public class Milk extends CoffeeDecorator {
    public Milk(Coffee DecoratedCoffee) {
        super(DecoratedCoffee);
    }

    @Override
    public double cost(){
        return super.cost() + 2.0;
    }

    @Override
    public String description(){
        return super.description() + ",leite";
    }
}
