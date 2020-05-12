package de.dorbird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print("Enter a your Deck colors: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        MTGManaBaseBuilder mmbb = new MTGManaBaseBuilder(ManaColor.ColorPairingNameToMana(inputString));

        System.out.print(String.format("Use default LandTypes(%s)? [y]/[n]: ", mmbb.defaultLandTypes));
        if (!scanner.nextLine().equals("y")) {
            ArrayList<LandType> types = new ArrayList<>();
            for (LandType type : mmbb.getAllImplementedLandTypes()) {
                System.out.print(String.format("Do you want %s Lands in your deck? [y]/[n]: ", type));
                if (scanner.nextLine().equals("y"))
                    types.add(type);
            }
            mmbb.setLandTypes(types);
        }


        Map<ManaColor, Integer> manaPips = new HashMap<>();
        for (ManaColor color :
                ManaColor.ColorPairingNameToMana(inputString)) {
            System.out.print(String.format("Enter pips of the color %s: ", color.name()));
            int pips = scanner.nextInt();
            manaPips.put(color, pips);
        }

        ArrayList<Land> lands = mmbb.getAllMatchingLands();
        for (Land land :
                lands) {
            System.out.println(String.format("1 %s", land.name));
        }

        ArrayList<Land> basics = mmbb.suggestBasics(manaPips, 37 - lands.size());
        for (Land land :
                basics) {
            System.out.println(String.format("1 %s", land.name));
        }
    }
}
