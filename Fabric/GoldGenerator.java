package Fabric;

import Interface.IGameItem;
import Product.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
    
}
