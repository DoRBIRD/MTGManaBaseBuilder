package de.dorbird;

import java.util.ArrayList;

public enum ManaColor {
    WHITE, BLUE, BLACK, RED, GREEN, COLORLESS;

    public static final String AZORIUS = "Azorius";
    public static final String DIMIR = "Dimir";
    public static final String RAKDOS = "Rakdos";
    public static final String GRUUL = "Gruul";
    public static final String SELESNYA = "Selesnya";
    public static final String ORZHOV = "Orzhov";
    public static final String IZZET = "Izzet";
    public static final String GOLGARI = "Golgari";
    public static final String BOROS = "Boros";
    public static final String SIMIC = "Simic";

    public static final String ESPER = "Esper";
    public static final String GRIXIS = "Grixis";
    public static final String JUND = "Jund";
    public static final String NAYA = "Naya";
    public static final String BANT = "Bant";
    public static final String ABZAN = "Abzan";
    public static final String JESKAI = "Jeskai";
    public static final String SULTAI = "Sultai";
    public static final String MARDU = "Mardu";
    public static final String TEMUR = "Temur";

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

            case AZORIUS:
            case "UW":
            case "WU":
                manaColors.add(BLUE);
                manaColors.add(WHITE);
                break;
            case DIMIR:
            case "uB":
            case "BU":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                break;
            case RAKDOS:
            case "BR":
            case "RB":
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case GRUUL:
            case "RG":
            case "GR":
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case SELESNYA:
            case "WG":
            case "GW":
                manaColors.add(WHITE);
                manaColors.add(GREEN);
                break;
            case ORZHOV:
            case "BW":
            case "WB":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                break;
            case IZZET:
            case "UR":
            case "RU":
                manaColors.add(BLUE);
                manaColors.add(RED);
                break;
            case GOLGARI:
            case "GB":
            case "BG":
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case BOROS:
            case "WR":
            case "RW":
                manaColors.add(WHITE);
                manaColors.add(RED);
                break;
            case SIMIC:
            case "UG":
            case "GU":
                manaColors.add(BLUE);
                manaColors.add(GREEN);
                break;

            case ESPER:
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                break;
            case GRIXIS:
            case "UBR":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case JUND:
            case "BRG":
            case "RGB":
                manaColors.add(BLACK);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case NAYA:
            case "WRG":
                manaColors.add(WHITE);
                manaColors.add(RED);
                manaColors.add(GREEN);
                break;
            case BANT:
            case "WUG":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(GREEN);
                break;
            case ABZAN:
            case "WBG":
            case "GBW":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case JESKAI:
            case "WUR":
                manaColors.add(WHITE);
                manaColors.add(BLUE);
                manaColors.add(RED);
                break;
            case SULTAI:
            case "UGB":
            case "BUG":
                manaColors.add(BLUE);
                manaColors.add(BLACK);
                manaColors.add(GREEN);
                break;
            case MARDU:
            case "WBR":
                manaColors.add(WHITE);
                manaColors.add(BLACK);
                manaColors.add(RED);
                break;
            case TEMUR:
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
