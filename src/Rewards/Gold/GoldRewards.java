/**
 * Класс GoldRewards представляет собой игровую награду в виде золота.
 * Реализует интерфейс IGameItem для определения метода open(), который возвращает название награды.
 */
package Rewards.Gold;

import Abstractions.IGameItem;

public class GoldRewards implements IGameItem {
    /**
     * Метод open() возвращает название  награды - золото .
     * @return Название награды ("Золото").
     */

    @Override
    public String open() {
        return "Золото";
    }
}