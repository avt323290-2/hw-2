/**
 * Класс DiamondGenerator является генератором алмазов.
 * Он наследует абстрактный класс ItemGenerator и реализует его метод createItem(),
 * чтобы создавать экземпляры алмазов (DiamondRewards).
 */

package Rewards.Diamond;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class DiamondGenerator extends ItemGenerator {
    /**
     * Метод createItem() создает и возвращает новый экземпляр алмазов (DiamondRewards).
     * @return Новый экземпляр алмазов (DiamondRewards).
     */
    @Override
    public IGameItem createItem() {
        return new DiamondRewards();
    }
}