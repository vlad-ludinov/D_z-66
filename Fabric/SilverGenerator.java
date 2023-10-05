package Fabric;

import Interface.IGameItem;
import Product.SilverReward;

public class SilverGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new SilverReward();
    }
    
}
