public abstract class CoffeeDecorator implements Coffee {
    protected Coffee DecoratedCoffee;

    public CoffeeDecorator(Coffee DecoratedCoffee) {
        this.DecoratedCoffee = DecoratedCoffee;
    }

    @Override
    public double cost(){
        return DecoratedCoffee.cost();
    }

    @Override
    public String description(){
        return DecoratedCoffee.description();
    }
}
