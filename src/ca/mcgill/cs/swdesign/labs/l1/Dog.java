package ca.mcgill.cs.swdesign.labs.l1;

public class Dog {

    public enum Size {
        SMALL, MEDIUM, LARGE, GIANT;
    }

    public enum LikesCats {
        YES, NO;
    }

    private String aName;
    private Size aSize;
    private int aAge;
    private String aBreed;
    private LikesCats aLikesCats;

    private Food aFavoriteFood;

    public Dog(String pName, Size pSize, int pAge, String pBreed, LikesCats pLikesCats) {
        aName = pName;
        aSize = pSize;
        aAge = pAge;
        aBreed = pBreed;
        aLikesCats = pLikesCats;
    }

    public String getName() {
        return aName;
    }

    public Size getSize() {
        return aSize;
    }

    public String getBreed() {
        return aBreed;
    }

    public LikesCats getLikesCats() {
        return aLikesCats;
    }

    public void setLikesCats(LikesCats pLikesCats) {
        aLikesCats = pLikesCats;
    }

    public int getAge() {
        return aAge;
    }

    public void setAge(int pAge) {
        aAge = pAge;
    }

    public Food getFavoriteFood() {
        return aFavoriteFood;
    }

    public void setFavoriteFood(Food pFavoriteFood) {
        aFavoriteFood = pFavoriteFood;
    }
}
