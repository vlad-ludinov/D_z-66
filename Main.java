import Fabric.BronzeGenerator;
import Fabric.ClayGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.IronGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;
import Fabric.StoneGenerator;
import Fabric.WoodGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    
    public static void main(String[] args) {
        
        


        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> casinoList = createCasino();
        int gem = 0;
        int gold = 0;
        int silver = 0;
        int bronze = 0;
        int iron = 0;
        int stone = 0;
        int wood = 0;
        int clay = 0;
        ItemGenerator itemGenerator;
        String generatorName;
        for (int i = 0; i < 6400; i++) {
            itemGenerator = casinoList.get(random.nextInt(64));
            itemGenerator.openReward();
            generatorName = itemGenerator.getClass().getSimpleName();
            if (generatorName.equals("GemGenerator")){
                gem++;
            } else {
                if (generatorName.equals("GoldGenerator")) {
                    gold++;
                } else {
                    if (generatorName.equals("SilverGenerator")) {
                        silver++;
                    } else {
                        if (generatorName.equals("BronzeGenerator")) {
                            bronze++;
                        } else {
                            if (generatorName.equals("IronGenerator")) {
                                iron++;
                            } else {
                                if (generatorName.equals("StoneGenerator")) {
                                    stone++;
                                } else {
                                    if (generatorName.equals("WoodGenerator")) {
                                        wood++;
                                    } else {
                                        if (generatorName.equals("ClayGenerator")) {
                                            clay++;
                                        }
                                    }
                                }
                            }
                        } 
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Gem: " + gem);
        System.out.println("Gold: " + gold);
        System.out.println("Silver: " + silver);
        System.out.println("Bronze: " + bronze);
        System.out.println("Iron: " + iron);
        System.out.println("Stone: " + stone);
        System.out.println("Wood: " + wood);
        System.out.println("Clay: " + clay);
        
    }

    static List<ItemGenerator> createCasino() {
        ItemGenerator f1 = new GemGenerator();
        ItemGenerator f2 = new GoldGenerator();
        ItemGenerator f3 = new SilverGenerator();
        ItemGenerator f4 = new BronzeGenerator();
        ItemGenerator f5 = new IronGenerator();
        ItemGenerator f6 = new StoneGenerator();
        ItemGenerator f7 = new WoodGenerator();
        ItemGenerator f8 = new ClayGenerator();
        
        List<ItemGenerator> itemGeneratorsList = new ArrayList<>();
        itemGeneratorsList.add(f1);
        itemGeneratorsList.add(f2);
        itemGeneratorsList.add(f2);
        itemGeneratorsList.add(f2);
        for (int i = 0; i < 10; i++) {
            itemGeneratorsList.add(f3);
            itemGeneratorsList.add(f4);
            itemGeneratorsList.add(f5);
            itemGeneratorsList.add(f6);
            itemGeneratorsList.add(f7);
            itemGeneratorsList.add(f8);
        }

        return itemGeneratorsList;
    }
}
