/**
 * Класс CoalRewards представляет собой награду в виде угля.
 * Реализует интерфейс IGameItem для определения метода open(), который возвращает название награды.
 */

package Rewards.Coal;

import Abstractions.IGameItem;

public class CoalRewards implements IGameItem {
    /**
     * Метод open() возвращает название награды уголь.
     * @return Название награды ("Уголь").
     */
    @Override
    public String open() {
        return "Уголь";
    }
}