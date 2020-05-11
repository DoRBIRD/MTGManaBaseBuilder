package de.dorbird;

import java.util.ArrayList;

public class Land {
    LandType type;
    ArrayList<ManaColor> colors;
    String name;

    public Land(LandType type, ArrayList<ManaColor> colors, String name) {
        this.type = type;
        this.colors = colors;
        this.name = name;
    }

    public Land(ManaColor color) {
        this.type = LandType.BASIC;
        ArrayList<ManaColor> colors = new ArrayList<>();
        colors.add(color);
        this.colors = colors;
        this.name = colorToBasic(color);
    }

    public Land(LandType type, char c, String name) {
        ArrayList<ManaColor> colors = new ArrayList<>();
        colors.add(ManaColor.CharToMana(c));
        this.type = type;
        this.colors = colors;
        this.name = name;
    }

    private String colorToBasic(ManaColor color) {
        switch (color) {
            case WHITE:
                return "Plains";
            case BLUE:
                return "Island";
            case BLACK:
                return "Swamp";
            case RED:
                return "Mountain";
            case GREEN:
                return "Forest";
            default:
                return "Wastes";
        }
    }
}
