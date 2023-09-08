package Core;

import Abstractions.ItemGenerator;
import Rewards.Coal.CoalGenerator;
import Rewards.Diamond.DiamondGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс Core представляет собой ядро логики игры, в которой генерируются и отображаются награды.
 */
public class Core {
    /**
     * Метод run() запускает игровую логику, включая генерацию и вывод наград.
     */
    public void run() {
        // Создаем генератор случайных чисел
        Random random = ThreadLocalRandom.current();

        // Создаем список генераторов наград
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new CoalGenerator());
        generatorList.add(new DiamondGenerator());

        // Генерируем и выводим 20 наград
        for (int i = 0; i <20;i++) {
            int indx=Math.abs(random.nextInt()%4);
            ItemGenerator myGenerator = generatorList.get(indx);
            System.out.println(myGenerator.openReward());
        }
    }
}