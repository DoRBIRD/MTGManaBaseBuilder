package de.dorbird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<LandType> landTypes = new ArrayList<>();
        landTypes.add(LandType.DUAL);
        landTypes.add(LandType.TRIOME);
        landTypes.add(LandType.FETCH);
        landTypes.add(LandType.SHOCK);
        landTypes.add(LandType.BOUNCE);
        landTypes.add(LandType.TRITAP);
        landTypes.add(LandType.CHECK);

        System.out.print("Enter a your Deck colors: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        MTGManaBaseBuilder mmbb = new MTGManaBaseBuilder(ManaColor.ColorPairingNameToMana(inputString), landTypes);

        Map<ManaColor, Integer> manaPips = new HashMap<>();
        for (ManaColor color :
                ManaColor.ColorPairingNameToMana(inputString)) {
            System.out.print(String.format("Enter pips of the color %s:", color.name()));
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
