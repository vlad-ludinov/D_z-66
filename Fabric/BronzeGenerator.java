package Fabric;

import Interface.IGameItem;
import Product.BronzeReward;

public class BronzeGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new BronzeReward();
    }
    
}
