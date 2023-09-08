/**
 * Класс CoalGenerator является генератором уголя.
 * Он наследует абстрактный класс ItemGenerator и реализует его метод createItem(),
 * чтобы создавать экземпляры уголя (CoalRewards).
 */
package Rewards.Coal;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class CoalGenerator extends ItemGenerator {
    /**
     * Метод createItem() создает и возвращает новый экземпляр угля (CoalRewards).
     *
     * @return Новый экземпляр угля (CoalRewards).
     */
    @Override
    public IGameItem createItem() {
        return new CoalRewards();
    }
}