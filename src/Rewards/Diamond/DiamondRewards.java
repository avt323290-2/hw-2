package Rewards.Diamond;

import Abstractions.IGameItem;

public class DiamondRewards implements IGameItem {
    @Override
    public String open() {
        return "Бриллиант";
    }
}