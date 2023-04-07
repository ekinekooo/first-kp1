package yenideneme;

public enum Engine {

    GASOLINE, ELECTRIC, DIESEL, GAS;

    public String toString() {
        switch(this) {
            case GASOLINE: return "GASOLINE";
            case ELECTRIC: return "ELECTRIC";
            case DIESEL: return "DIESEL";
            case GAS: return "GAS";
            default:       return "unspecified";
        }
    }
}

