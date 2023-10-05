package Fabric;

import Interface.IGameItem;
import Product.StoneReward;

public class StoneGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new StoneReward();
    }
    
}
