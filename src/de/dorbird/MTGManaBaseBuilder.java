package de.dorbird;

import java.util.ArrayList;
import java.util.Map;

public class MTGManaBaseBuilder {
    ArrayList<ManaColor> deckColors;
    private ArrayList<LandType> landTypes;

    public ArrayList<LandType> defaultLandTypes;

    private ArrayList<Land> allLands;

    private ArrayList<LandType> allImplementedLandTypes;

    public MTGManaBaseBuilder(ArrayList<ManaColor> deckColors, ArrayList<LandType> landTypes) {
        init();
        this.deckColors = deckColors;
        this.landTypes = landTypes;
    }

    public MTGManaBaseBuilder(ArrayList<ManaColor> deckColors) {
        init();
        this.deckColors = deckColors;
        this.landTypes = defaultLandTypes;
    }

    private void init() {
        //init default LandTypes
        defaultLandTypes = new ArrayList<>();
        defaultLandTypes.add(LandType.DUAL);
        defaultLandTypes.add(LandType.TRIOME);
        defaultLandTypes.add(LandType.FETCH);
        defaultLandTypes.add(LandType.SHOCK);
        defaultLandTypes.add(LandType.BOUNCE);
        defaultLandTypes.add(LandType.TRITAP);
        defaultLandTypes.add(LandType.CHECK);


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
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Tundra"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Underground Sea"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Badlands"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Taiga"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Savannah"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Scrubland"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Volcanic Island"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Bayou"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Plateau"));
        allLands.add(new Land(LandType.DUAL, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Tropical Island"));
        allImplementedLandTypes.add(LandType.DUAL);
        //Shocks
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Hallowed Fountain"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Watery Grave"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Blood Crypt"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Stpmping Grounds"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Temple Garden"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Godless Shrine"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Steam Vents"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Overgrown Tomb"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Sacred Foundry"));
        allLands.add(new Land(LandType.SHOCK, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Breeding Pool"));
        allImplementedLandTypes.add(LandType.SHOCK);
        //Fetches
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Flooded Strand"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Polluted Delta"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Bloodstained Mire"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Wooded Foothills"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Windswept Heath"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Marsh Flats"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Scalding Tarn"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Verdant Catacombs"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Arid Mesa"));
        allLands.add(new Land(LandType.FETCH, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Misty Rainforest"));
        allImplementedLandTypes.add(LandType.FETCH);
        //Checklands
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Glacial Fortress"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Drowned Catacombs"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Dragonskull Sumit"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Rootbound Crag"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Sunpetal Grove"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Isolated Chapel"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Sulfur Falls"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Woodland Cemetery"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Clifftop Retreat"));
        allLands.add(new Land(LandType.CHECK, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Hinterland Harbor"));
        allImplementedLandTypes.add(LandType.CHECK);
        //Filters Shadow Moore/ Eventide
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Mystic Gate"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Sunken Ruins"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Graven Cairns"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Fire-lit Thicket"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Wooded Bastion"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Fetid Heath"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Cascade Bluffs"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Twilight Mire"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Rugged Prairie"));
        allLands.add(new Land(LandType.FILTER1, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Flooded Grove"));
        allImplementedLandTypes.add(LandType.FILTER1);
        //Filters Odyssey
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Skycloud Expanse"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Darkwater Catacombs"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Shadowblood Ridge"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Mossfire Valley"));
        allLands.add(new Land(LandType.FILTER2, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Sungrass Prairie"));
        allImplementedLandTypes.add(LandType.FILTER2);
        //Amonkhet Cylcelands
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Irrigated Farmland"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Fetid Pools"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Canyon Slough"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Sheltered Thicket"));
        allLands.add(new Land(LandType.DUALCYLCE, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Scattered Groves"));
        allImplementedLandTypes.add(LandType.DUALCYLCE);
        //Horizonlands
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Horizon Canopy"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Silent Clearing"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Fiery Islet"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Nurturing Peatland"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Sunbaked Canyon"));
        allLands.add(new Land(LandType.HORIZON, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Waterlogged Grove"));
        allImplementedLandTypes.add(LandType.HORIZON);
        //Fastlands Aetherrevolt / Scars of Mirodin
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Seachrome Coast"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Darkslick Shores"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Blackcleave Cliffs"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Copperline Gorge"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Razorverge Thicket"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Concealed Courtyard"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Spirebluff Canal"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Blooming Marsh"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Inspiring Vantage"));
        allLands.add(new Land(LandType.FAST, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Botanical Sanctum"));
        allImplementedLandTypes.add(LandType.FAST);
        //Bouncelands
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Azorius Chancery"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Dimir Aqueduct"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Rakdos Carnarium"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Copperline Gorge"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Selesnya Sanctuary"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Orzhov Basilica"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Izzet Boilerworks"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Golgari Rot Farm"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Boros Garrison"));
        allLands.add(new Land(LandType.BOUNCE, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Simic Growth Chamber"));
        allImplementedLandTypes.add(LandType.BOUNCE);
        //Painlands
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Adarkar Wastes"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Underground River"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Sulfurous Springs"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Karplusan Forest"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Brushland"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Caves of Koilos"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Shivan Reevf"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Llanowar Wastes"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Battlefield Forge"));
        allLands.add(new Land(LandType.PAIN, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Yavimaya Coast"));
        allImplementedLandTypes.add(LandType.PAIN);
        //Scrylands
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.AZORIUS), "Temple of Enlightment"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.DIMIR), "Temple of Deceit"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.RAKDOS), "Temple of Malice"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.GRUUL), "Temple of Abandon"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.SELESNYA), "Temple of Plenty"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.ORZHOV), "Temple of Silence"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.IZZET), "Temple of Epiphany"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.GOLGARI), "Temple of Malady"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.BOROS), "Temple of Triumph"));
        allLands.add(new Land(LandType.SCRYTEMPLE, ManaColor.ColorPairingNameToMana(ManaColor.SIMIC), "Temple of Mystery"));
        allImplementedLandTypes.add(LandType.SCRYTEMPLE);



        //Tri Taps
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.ESPER), "Arcane Sanctum"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.GRIXIS), "Crumbling Necropolis"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.JUND), "Savage Lands"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.NAYA), "Jungle Shrine"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.BANT), "Seaside Citadel"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.ABZAN), "Sandsteppe Citadel"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.JESKAI), "Mystic Monastry"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.SULTAI), "Opulent Palace"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.MARDU), "Momad Outpost"));
        allLands.add(new Land(LandType.TRITAP, ManaColor.ColorPairingNameToMana(ManaColor.TEMUR), "Frontier Bivouac"));
        allImplementedLandTypes.add(LandType.TRITAP);
        //Tri Taps
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana(ManaColor.ABZAN), "Indatha Trome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana(ManaColor.JESKAI), "Raugrin Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana(ManaColor.SULTAI), "Zagoth Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana(ManaColor.MARDU), "Savai Triome"));
        allLands.add(new Land(LandType.TRIOME, ManaColor.ColorPairingNameToMana(ManaColor.TEMUR), "Ketria Triome"));
        allImplementedLandTypes.add(LandType.TRIOME);



        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Mana Confluence"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "City of Brass"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Reflecting Pooö"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Exotic Orchard"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Command Tower"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Opal Palace"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Forbidden Orchard"));
        allLands.add(new Land(LandType.FIVECOLOR, ManaColor.ColorPairingNameToMana("Five Color"), "Cascading Cataracts"));
        allImplementedLandTypes.add(LandType.FIVECOLOR);

        allLands.add(new Land(LandType.TRIBAL, ManaColor.ColorPairingNameToMana("Five Color"), "Path of Ancestry"));
        allLands.add(new Land(LandType.TRIBAL, ManaColor.ColorPairingNameToMana("Five Color"), "Unclaimned Terretory"));
        allLands.add(new Land(LandType.TRIBAL, ManaColor.ColorPairingNameToMana("Five Color"), "Muta Vault"));
        allLands.add(new Land(LandType.TRIBAL, ManaColor.ColorPairingNameToMana("Five Color"), "Cavern of Souls"));
        allImplementedLandTypes.add(LandType.TRIBAL);

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

    public ArrayList<LandType> getAllImplementedLandTypes() {
        return allImplementedLandTypes;
    }

    public void setLandTypes(ArrayList<LandType> landTypes) {
        this.landTypes = landTypes;
    }
}
