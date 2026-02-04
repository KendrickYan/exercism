public class GameMaster {

    public String describe(Character ch) {
        return "You're a level " + ch.getLevel() +
                " " + ch.getCharacterClass() +
                " with " + ch.getHitPoints() +
                " hit points.";
    }

    public String describe(Destination dest) {
        return "You've arrived at " + dest.getName() +
                ", which has " + dest.getInhabitants() +
                " inhabitants.";
    }

    public String describe(TravelMethod travMeth) {
        return switch (travMeth) {
            case TravelMethod.HORSEBACK -> "You're traveling to your destination on horseback.";
            case TravelMethod.WALKING -> "You're traveling to your destination by walking.";
            default -> "";
        };
    }

    public String describe(Character ch, Destination dest, TravelMethod travMeth) {
        return describe(ch) +
                " " + describe(travMeth) +
                " " + describe(dest);
    }

    public String describe(Character ch, Destination dest) {
        return describe(ch, dest, TravelMethod.WALKING);
    }
}
