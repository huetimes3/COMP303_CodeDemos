package ca.mcgill.cs.swdesign.labs.l2;

public class Store {
    private SellableThing[] aSellableThings;

    public Store(SellableThing[] pSellableThings) {
        SellableThing[] cSellableThings = new SellableThing[pSellableThings.length];
        for (int i = 0; i < pSellableThings.length; i++) {
            cSellableThings[i] = pSellableThings[i].clone();
        }
        aSellableThings = cSellableThings;
    }

    

}
