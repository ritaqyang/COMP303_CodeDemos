package ca.mcgill.cs.swdesign.review.q1q2;

public class Apple implements Produce{
    private String aName;
    private int aPrice;

    public Apple(String pName, int pPrice){
        assert pName != null && pPrice > 0;
        aName = pName;
        aPrice = pPrice;
    }

    @Override
    public String getName(){
        return "Apple: " + aName;
    }

    @Override
    public int getPrice(){
        return aPrice;
    }

}
