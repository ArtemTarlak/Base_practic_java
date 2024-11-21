public enum Recip {
    ESPRESSO(50, 30, 0),
    CAPPUCCINO(100, 70, 30),
    LATTE(150, 100, 50);

    private final int water;
    private final int coffee;
    private final int milk;

    Recip(int water, int coffee, int milk) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }

    public int getWater() { return water; }
    public int getCoffee() { return coffee; }
    public int getMilk() { return milk; }

    @Override
    public String toString() {
        return name() + ' ' + '{' + " Water: " + water +
                ", Coffee: " + coffee + ", Milk: " + milk + '}' + '\n';
    }
}


