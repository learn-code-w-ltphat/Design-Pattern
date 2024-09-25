class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    // Constructor is now public
    public Pizza(String size, boolean cheese, boolean pepperoni, boolean mushrooms) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return String.format(
                "Pizza size: %s, cheese: %b, pepperoni: %b, mushrooms: %b",
                size, cheese, pepperoni, mushrooms
        );
    }
}

// Separate PizzaBuilder class
class PizzaBuilder {
    private final String size;
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean mushrooms = false;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder cheese(boolean value) {
        cheese = value;
        return this;
    }

    public PizzaBuilder pepperoni(boolean value) {
        pepperoni = value;
        return this;
    }

    public PizzaBuilder mushrooms(boolean value) {
        mushrooms = value;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, cheese, pepperoni, mushrooms);
    }
}