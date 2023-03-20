package ca.mcgill.cs.swdesign.labs.l1;

public class Food {
    private String aName;
    private float aPrice;

    public Food(String pName, float pPrice) {
        // assert price is greater than 0 and not to more than 2 decimal places 
        assert pPrice > 0.0 && pPrice == ((int)pPrice * 100) / 100.0;
        aName = pName;
        aPrice = pPrice;
    }

    public String getName() {
        return aName;
    }

    // in the offchance a brand would like to change its name and rebrand, it's still the same food.
    // if we assume that the brand will never change its name we would not have this method
    public void setName(String pName) {
        aName = pName;
    }

    public float getPrice() {
        return aPrice;
    }

    // in case of inflation or sudden change in price, it's still the same food.
    // if we assume the price is fixed we wouldn't have this method
    public void setPrice(float pPrice) {
        assert pPrice > 0.0 && pPrice == ((int)pPrice * 100) / 100.0;
        aPrice = pPrice;
    }
}
