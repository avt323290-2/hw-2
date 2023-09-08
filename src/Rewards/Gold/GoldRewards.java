package Rewards.Gold;

import Abstractions.IGameItem;

public class GoldRewards implements IGameItem {

    @Override
    public String open() {
        return "Золото";
    }
}