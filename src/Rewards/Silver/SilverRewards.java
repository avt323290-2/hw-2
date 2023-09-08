package Rewards.Silver;

import Abstractions.IGameItem;

public class SilverRewards implements IGameItem {
    @Override
    public String open() {
        return "Серебро";
    }
}