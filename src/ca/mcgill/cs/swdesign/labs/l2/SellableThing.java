package ca.mcgill.cs.swdesign.labs.l2;

public interface SellableThing extends Cloneable {
    //float aPrice;

    public float getPrice();

    public SellableThing clone();
}
