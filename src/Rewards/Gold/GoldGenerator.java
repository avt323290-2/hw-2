/**
 * Класс GoldGenerator отвечает за генерацию золота в игре.
 * Он наследует класс ItemGenerator и переопределяет метод createItem() для создания экземпляров золота (GoldRewards).
 */
package Rewards.Gold;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    /**
     * Создает и возвращает новый экземпляр золота (GoldRewards).
     *
     * @return Новый экземпляр золота (GoldRewards).
     */
    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}