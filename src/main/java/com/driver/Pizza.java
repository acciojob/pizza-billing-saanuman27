package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private final int extraCheesePrice;
    private final int extraToppingsPrice;
    private final int extraTakeawayPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeawayAdded;
    private boolean isGetBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheesePrice=80;
        this.extraTakeawayPrice=20;
        if(isVeg==true)
        {
            this.price=300;
            this.extraToppingsPrice=70;
        }
        else
        {
            this.price=400;
            this.extraToppingsPrice=120;
        }
        this.bill+="Base Price Of The Pizza: "+this.price +"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            this.price+=this.extraCheesePrice;
            isExtraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            this.price+=this.extraToppingsPrice;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded)
        {
            this.price+=this.extraTakeawayPrice;
            isTakeawayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isGetBill)
        {
            if(isExtraCheeseAdded)
            {
                this.bill+="Extra Cheese Added: "+this.extraCheesePrice +"\n";
            }
            if(isExtraToppingsAdded)
            {
                this.bill+="Extra Toppings Added: "+this.extraToppingsPrice +"\n";
            }
            if(isTakeawayAdded)
            {
                this.bill+="Paperbag Added: "+this.extraTakeawayPrice +"\n";
            }
            this.bill+="Total Price: "+this.getPrice() + "\n";
            isGetBill=true;
        }
        return this.bill;
    }
}
