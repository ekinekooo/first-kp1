package yenideneme;

public enum Builder {

    OPEL, MERCEDES, FERRARI, TOGG, TOYOTA, PEUGEOT, BENTLEY, ANY;

    public String toString() {
        switch(this) {
            case OPEL:   return "Opel";
            case MERCEDES:   return "Mercedes";
            case FERRARI:   return "Ferrari";
            case TOGG: return "Togg";
            case TOYOTA:    return "Toyota";
            case PEUGEOT:     return "Peugeot";
            case BENTLEY :     return "Bentley";
            default:       return "Unspecified";
        }
    }
}

