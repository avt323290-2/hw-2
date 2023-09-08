/**
 * Класс DiamondRewards представляет собой награду в виде бриллианта.
 * Реализует интерфейс IGameItem для определения метода open(), который возвращает название награды.
 */
package Rewards.Diamond;

import Abstractions.IGameItem;

public class DiamondRewards implements IGameItem {
    /**
     * Метод open() возвращает название алмаз.
     * @return Название алмаза ("Бриллиант").
     */
    @Override
    public String open() {
        return "Бриллиант";
    }
}