package yenideneme;

public enum Color {

    WHITE, YELLOW, BLACK, CYAN,
    GREEN, PURPLE, GREY;

    public String toString() {
        switch(this) {
            case WHITE:    return "WHITE";
            case YELLOW: return "YELLOW";
            case BLACK:           return "BLACK";
            case CYAN:              return "CYAN";
            case GREEN:           return "GREEN";
            case PURPLE:              return "PURPLE";
            case GREY:         return "GREY";
            default:  return "unspecified";
        }
    }
}

