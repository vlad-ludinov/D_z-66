package Fabric;

import Interface.IGameItem;
import Product.ClayReward;

public class ClayGenerator extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new ClayReward();
    }
    
}
