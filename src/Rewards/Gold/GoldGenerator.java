package Rewards.Gold;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new GoldRewards();
    }
}