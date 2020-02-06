package com.sameeksha.gifts;

import com.sameeksha.gifts.gift;

public abstract class chocolate extends gift {
	private int weight;
    private int Chocolate_content;
    private int price;
    private String chocolate_name;
    private String gift_type;
    private String chocolate_brand;

   public chocolate(int Chocolate_content,int weight,int price,String chocolate_name,String gift_type,String chocolate_brand)
   {
       super(price, weight, gift_type);
       this.chocolate_name =chocolate_name;
       this.Chocolate_content =Chocolate_content;
       this.weight = weight;
       this.price = price;
       this.gift_type=gift_type;
       this.chocolate_brand=chocolate_brand;
   }

   public int get_chocolate_content()
   {
       return  Chocolate_content;
   }

   public String get_type(){
       return gift_type;
   }
   public int get_weight()
   {
       return weight;
   }

   public int get_price()
   {
       return price;
   }

   public String get_chocolate_name()
   {
       return chocolate_name;
   }
   public String get_chocolate_brand(){
       return chocolate_brand;
   }
   abstract void description(); 
   public String toString()
   {
       return "Chocolate name: "+this.chocolate_name+"\n"+" Chocolate Content "+this.Chocolate_content+"\n"+" Chocolate price "+this.price+"\n"+" Chocolate weight "+this.weight+"\n";    }

}
