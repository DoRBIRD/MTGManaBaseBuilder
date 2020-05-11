package de.dorbird;

import java.util.ArrayList;

public enum ManaColor {
    WHITE, BLUE, BLACK, RED, GREEN, COLORLESS;

    public static ManaColor CharToMana(char c) {
        switch (c) {
            case 'W':
                return WHITE;
            case 'U':
                return BLUE;
            case 'B':
                return BLACK;
            case 'R':
                return RED;
            case 'G':
                return GREEN;
            case 'C':
                return COLORLESS;
            default:
                return COLORLESS;
        }
    }

    public static ArrayList<ManaColor> ColorPairingNameToMana(String string) {
        ArrayList<ManaColor> manaColors = new ArrayList<>();
        switch (string) {
            case "W":
                manaColors.add(WHITE);
                break;
            case "U":
                manaColors.add(BLUE);
                break;
            case "B":
                manaColors.add(BLACK);
                break;
            case "R":
                manaColors.add(RED);
                break;
            case "G":
                manaColors.add(GREEN);
                break;
            case "C":
                manaColors.add(COLORLESS);
                break;

            case "Azorius":
            case "UW":
            case "WU":
                manaColors.add(BLUE);
                manaColors.add(WHITE);
                break;
            case "Dimir":
            case "uB":
            case "BU":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                break;
            case "Rakdos":
            case "BR":
            case "RB":
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case "Gruul":
            case "RG":
            case "GR":
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Selesnya":
            case "WG":
            case "GW":
                manaColors.add(WHITE);
                manaColors.add(GREEN);
                break;
            case "Orzhov":
            case "BW":
            case "WB":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                break;
            case "Izzet":
            case "UR":
            case "RU":
                manaColors.add(BLUE);
                manaColors.add(RED);
                break;
            case "Golgari":
            case "GB":
            case "BG":
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case "Boros":
            case "WR":
            case "RW":
                manaColors.add(WHITE);
                manaColors.add(RED);
                break;
            case "Simic":
            case "UG":
            case "GU":
                manaColors.add(BLUE);
                manaColors.add(GREEN);
                break;

            case "Esper":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                break;
            case "Grixis":
            case "UBR":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case "Jund":
            case "BRG":
            case "RGB":
                manaColors.add(BLACK);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Naya":
            case "WRG":
                manaColors.add(WHITE);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Bant":
            case "WUG":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(GREEN);
                break;
            case "Abzan":
            case "WBG":
            case "GBW":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case "Jeskai":
            case "WUR":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(RED);
                break;
            case "Sultai":
            case "UGB":
            case "BUG":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case "Mardu":
            case "WBR":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case "Temur":
            case "URG":
                manaColors.add(BLUE);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;

            case "Yore-Tiller":
            case "Greenless":
            case "WUBR":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case "Glint-Eye":
            case "Whiteless":
            case "UBRG":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Dune-Brood":
            case "Blueless":
            case "WBRG":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Ink-Treader":
            case "Blackless":
            case "WURG":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case "Witch-Maw":
            case "Redless":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;

            case "WUBRG":
            case "Five Color":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;

            default:
                manaColors.add(COLORLESS);
        }

        return manaColors;

    }
}
