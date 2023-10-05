package Fabric;

import Interface.IGameItem;
import Product.WoodReward;

public class WoodGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new WoodReward();
    }
    
}
