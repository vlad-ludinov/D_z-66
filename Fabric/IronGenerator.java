package Fabric;

import Interface.IGameItem;
import Product.IronReward;

public class IronGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new IronReward();
    }
    
}
