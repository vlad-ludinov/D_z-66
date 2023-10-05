package Fabric;

import Interface.IGameItem;


public abstract class ItemGenerator {

    public abstract IGameItem createItem();
    
    public void openReward() {
        createItem().open();
    }
}