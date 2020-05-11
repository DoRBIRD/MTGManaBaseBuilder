package de.dorbird;

import java.util.ArrayList;
import java.util.Map;

public class MTGManaBaseBuilder {
    ArrayList<ManaColor> deckColors;
    ArrayList<LandType> landTypes;
    int amountOflands = 37;


    ArrayList<Land> allLands;
    Map<LandType, ArrayList<Land>> allLandsMap;

    ArrayList<LandType> allImplementedLandTypes;

    public MTGManaBaseBuilder(ArrayList<ManaColor> deckColors, ArrayList<LandType> landTypes) {
        this.deckColors = deckColors;
        this.landTypes = landTypes;
        init();
    }

    private void init() {
        allLands = new ArrayList<>();
        allImplementedLandTypes = new ArrayList<>();
        //Basics
        allLands.add(new Land(LandType.BASIC, 'W', "Plains"));
        allLands.add(new Land(LandType.BASIC, 'U', "Island"));
        allLands.add(new Land(LandType.BASIC, 'B', "Swamp"));
        allLands.add(new Land(LandType.BASIC, 'R', "Mountain"));
        allLands.add(new Land(LandType.BASIC, 'G', "Forest"));
        allImplementedLandTypes.add(LandType.BASIC);
        //Snow Basics
        allLands.add(new Land(LandType.SNOWCOVERED, 'W', "Snow-Covered Plains"));
        allLands.add(new Land(LandType.SNOWCOVERED, 'U', "Snow-Covered Island"));
        allLands.add(new Land(LandType.SNOWCOVERED, 'B', "Snow-Covered Swamp"));
        allLands.add(new Land(LandType.SNOWCOVERED, 'R', "Snow-Covered Mountain"));
        allLands.add(new Land(LandType.SNOWCOVERED, 'G', "Snow-Covered Forest"));
        allImplementedLandTypes.add(LandType.SNOWCOVERED);

        //Duals
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Azorius"), "Tundra"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Dimir"), "Underground Sea"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Rakdos"), "Badlands"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Gruul"), "Taiga"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Selesnya"), "Savannah"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Orzhov"), "Scrubland"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Izzet"), "Volcanic Island"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Golgari"), "Bayou"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Boros"), "Plateau"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana("Simic"), "Tropical Island"));
        allImplementedLandTypes.add(LandType.DUAL);
        //Shocks
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Azorius"), "Hallowed Fountain"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Dimir"), "Watery Grave"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Rakdos"), "Blood Crypt"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Gruul"), "Stpmping Grounds"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Selesnya"), "Temple Garden"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Orzhov"), "Godless Shrine"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Izzet"), "Steam Vents"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Golgari"), "Overgrown Tomb"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Boros"), "Sacred Foundry"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana("Simic"), "Breeding Pool"));
        allImplementedLandTypes.add(LandType.SHOCK);
        //Fetches
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Azorius"), "Flooded Strand"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Dimir"), "Polluted Delta"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Rakdos"), "Bloodstained Mire"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Gruul"), "Wooded Foothills"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Selesnya"), "Windswept Heath"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Orzhov"), "Marsh Flats"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Izzet"), "Scalding Tarn"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Golgari"), "Verdant Catacombs"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Boros"), "Arid Mesa"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana("Simic"), "Misty Rainforest"));
        allImplementedLandTypes.add(LandType.FETCH);
        //Fetches
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Azorius"), "Glacial Fortress"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Dimir"), "Drowned Catacombs"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Rakdos"), "Dragonskull Sumit"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Gruul"), "Rootbound Crag"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Selesnya"), "Sunpetal Grove"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Orzhov"), "Isolated Chapel"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Izzet"), "Sulfur Falls"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Golgari"), "Woodland Cemetery"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Boros"), "Clifftop Retreat"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana("Simic"), "Hinterland Harbor"));
        allImplementedLandTypes.add(LandType.CHECK);
        //Filters Shadow Moore/ Eventide
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Azorius"), "Mystic Gate"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Dimir"), "Sunken Ruins"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Rakdos"), "Graven Cairns"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Gruul"), "Fire-lit Thicket"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Selesnya"), "Wooded Bastion"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Orzhov"), "Fetid Heath"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Izzet"), "Cascade Bluffs"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Golgari"), "Twilight Mire"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Boros"), "Rugged Prairie"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana("Simic"), "Flooded Grove"));
        allImplementedLandTypes.add(LandType.FILTER1);
        //Filters Odyssey
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana("Azorius"), "Skycloud Expanse"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana("Dimir"), "Darkwater Catacombs"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana("Rakdos"), "Shadowblood Ridge"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana("Gruul"), "Mossfire Valley"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana("Selesnya"), "Sungrass Prairie"));
        allImplementedLandTypes.add(LandType.FILTER2);
        //Amonkhet Cylcelands
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana("Azorius"), "Irrigated Farmland"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana("Dimir"), "Fetid Pools"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana("Rakdos"), "Canyon Slough"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana("Gruul"), "Sheltered Thicket"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana("Selesnya"), "Scattered Groves"));
        allImplementedLandTypes.add(LandType.DUALCYLCE);
        //Horizonlands
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Selesnya"), "Horizon Canopy"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Orzhov"), "Silent Clearing"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Izzet"), "Fiery Islet"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Golgari"), "Nurturing Peatland"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Boros"), "Sunbaked Canyon"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana("Simic"), "Waterlogged Grove"));
        allImplementedLandTypes.add(LandType.HORIZON);
        //Fastlands Aetherrevolt / Scars of Mirodin
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Azorius"), "Seachrome Coast"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Dimir"), "Darkslick Shores"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Rakdos"), "Blackcleave Cliffs"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Gruul"), "Copperline Gorge"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Selesnya"), "Razorverge Thicket"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Orzhov"), "Concealed Courtyard"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Izzet"), "Spirebluff Canal"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Golgari"), "Blooming Marsh"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Boros"), "Inspiring Vantage"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana("Simic"), "Botanical Sanctum"));
        allImplementedLandTypes.add(LandType.FAST);
        //Bouncelands
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Azorius"), "Azorius Chancery"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Dimir"), "Dimir Aqueduct"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Rakdos"), "Rakdos Carnarium"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Gruul"), "Copperline Gorge"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Selesnya"), "Selesnya Sanctuary"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Orzhov"), "Orzhov Basilica"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Izzet"), "Izzet Boilerworks"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Golgari"), "Golgari Rot Farm"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Boros"), "Boros Garrison"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana("Simic"), "Simic Growth Chamber"));
        allImplementedLandTypes.add(LandType.BOUNCE);
        //Painlands
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Azorius"), "Adarkar Wastes"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Dimir"), "Underground River"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Rakdos"), "Sulfurous Springs"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Gruul"), "Karplusan Forest"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Selesnya"), "Brushland"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Orzhov"), "Caves of Koilos"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Izzet"), "Shivan Reevf"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Golgari"), "Llanowar Wastes"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Boros"), "Battlefield Forge"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana("Simic"), "Yavimaya Coast"));
        allImplementedLandTypes.add(LandType.PAIN);

        //Tri Taps
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Esper"), "Arcane Sanctum"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Grixis"), "Crumbling Necropolis"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Jund"), "Savage Lands"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Naya"), "Jungle Shrine"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Bant"), "Seaside Citadel"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Abzan"), "Sandsteppe Citadel"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Jeskai"), "Mystic Monastry"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Sultai"), "Opulent Palace"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Mardu"), "Momad Outpost"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana("Temur"), "Frontier Bivouac"));
        allImplementedLandTypes.add(LandType.TRITAP);
        //Tri Taps
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana("Abzan"), "Indatha Trome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana("Jeskai"), "Raugrin Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana("Sultai"), "Zagoth Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana("Mardu"), "Savai Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana("Temur"), "Ketria Triome"));
        allImplementedLandTypes.add(LandType.TRIOME);
    }

    public ArrayList<Land> getAllMatchingLands() {
        ArrayList<Land> lands = (ArrayList<Land>) allLands.clone();
        lands = filterByColors(lands, deckColors);
        lands = filterByTypes(lands, landTypes);
        return lands;
    }

    public ArrayList<Land> suggestBasics(Map<ManaColor, Integer> manaPips, int landSlotsLeft) {
        ArrayList<Land> basics = new ArrayList<>();
        int manaPipsSum = 0;
        for (ManaColor color :
                manaPips.keySet()) {
            manaPipsSum += manaPips.get(color);
        }
        for (ManaColor color :
                manaPips.keySet()) {
            double verheltnis = (double) manaPips.get(color) / manaPipsSum;
            int temp = (int) (verheltnis * landSlotsLeft + 1);
            for (int i = 0; i < temp; i++) {
                basics.add(new Land(color));
            }
        }
        return basics;
    }

    private ArrayList<Land> filterByColors(ArrayList<Land> listToFilter, ArrayList<ManaColor> filterManaColors) {
        ArrayList<Land> lands = new ArrayList<>();
        lands:
        for (Land land :
                listToFilter) {
            for (ManaColor color :
                    land.colors)
                if (!filterManaColors.contains(color))
                    continue lands;
            lands.add(land);
        }
        return lands;
    }

    private ArrayList<Land> filterByTypes(ArrayList<Land> listToFilter, ArrayList<LandType> filterLandTypes) {
        ArrayList<Land> lands = new ArrayList<>();
        for (Land land :
                listToFilter) {
            if (filterLandTypes.contains(land.type))
                lands.add(land);
        }
        return lands;
    }


}
