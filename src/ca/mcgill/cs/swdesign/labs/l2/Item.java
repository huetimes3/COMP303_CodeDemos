package ca.mcgill.cs.swdesign.labs.l2;

public class Item implements SellableThing {
    private final float aPrice;

    // *
    //  @pre: pPrice < 0
    //  @post: aPrice != null
    // *
    public Item(float pPrice) {
        assert (pPrice >= 0);
        this.aPrice = pPrice;
    }

    @Override
    public float getPrice() {
        return this.aPrice;
    }

    @Override
    public Item clone() {
        Item clone = new Item(this.aPrice);
        return clone;
        
    }
}
