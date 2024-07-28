public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee DecoratedCoffee) {
        super(DecoratedCoffee);
    }

    @Override
    public double cost(){
        return super.cost() + 1.0;
    }

    @Override
    public String description(){
        return super.description() + ",açucar";
    }
}
