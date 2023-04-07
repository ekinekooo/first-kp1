package yenideneme;


public class CarSpec {

    private Builder builder;
    private String model;
    private Engine engine;
    private int numStrings;
    private Color color;

    public CarSpec(Builder builder, String model, Engine engine,
                   int numStrings, Color color) {
        this.builder = builder;
        this.model = model;
        this.engine = engine;
        this.numStrings = numStrings;
        this.color = color;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Color getColor() {
        return color;
    }

    public boolean matches(CarSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
            return false;
        if (engine != otherSpec.engine)
            return false;
        if (numStrings != otherSpec.numStrings)
            return false;
        if (color != otherSpec.color)
            return false;
        return true;
    }
}

