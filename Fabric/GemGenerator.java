package Fabric;

import Interface.IGameItem;
import Product.GemReward;

public class GemGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
    
}
