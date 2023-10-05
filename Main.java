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
        
        

        // Считаю что это выглядит страшно, по крайней мере как мне всегда казалось в Main,
        // не должно быть столько кода, и все должно было быть аккуратнее, но это
        // единственный вариант как не сильно заморачиваясь проверить
        // что награды распределяются с коэфицентом 10:10:10:10:10:10:3:1, 
        // другие способы подразумевают собой впринципе другие методы решения,
        // так что будь как будет
        // еще я думал занести все награды в список только по одному разу,
        // а потом все также через рандом брать число от 0 до 63,
        // только через if проверять в каком диапозоне оно лежит, 
        // например если 0, то Gem, если от 1 до 3, то Gold, если от 4 до 13,
        // то Silver, а от 14 до 23, то Bronze, и т.д., но меня смутило
        // что придется делать много if, (все равно столько же получилось =) )
        // тогда можно было бы в этот же if, сразу вставить увеличение счетчика
        // но это что называется, шило на мыло, все равно примерно одно и то же по размеру получмилось бы
        // короче вроде все работает

        
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
