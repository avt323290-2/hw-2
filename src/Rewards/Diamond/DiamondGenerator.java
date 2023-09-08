package Rewards.Diamond;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class DiamondGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new DiamondRewards();
    }
}