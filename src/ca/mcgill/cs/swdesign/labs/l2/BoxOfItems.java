package ca.mcgill.cs.swdesign.labs.l2;

public class BoxOfItems implements SellableThing {
    private float aPrice;
    private final SellableThing[] aItems;

    // *
    //  @post: aPrice != null
    // *
    public BoxOfItems(SellableThing[] pItems) {
        this.aItems = pItems;
        this.aPrice = 0;
        for (SellableThing i: pItems) {
            this.aPrice += i.getPrice();
        }
    }

    @Override
    public float getPrice() {
        return this.aPrice;
    }

    @Override
    public BoxOfItems clone() {
        
        SellableThing[] cItems = new SellableThing[this.aItems.length];
        for (int i = 0; i < this.aItems.length ; i++) {
            cItems[i] = this.aItems[i].clone();
        }
        
        BoxOfItems clone = new BoxOfItems(cItems);
        return clone;
    }
}
