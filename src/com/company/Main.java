package com.company;

import restaurant.MenuItems;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItems basketOfBread = new MenuItems(0.00,"Basket of bread","appetizer",true);
        MenuItems buffaloWings = new MenuItems(7.99,"Hot and spicy buffalo wings","appetizer",true);
        MenuItems frenchSoup = new MenuItems(4.99,"Soup of the day","appetizer",true);
        MenuItems salad = new MenuItems(1.99,"Just a salad","appetizer",true);
        MenuItems drink1 = new MenuItems(1.99,"Pepsi","drinks",true);
        MenuItems drink2 = new MenuItems(1.99,"Sprite","drinks",true);
        MenuItems drink3 = new MenuItems(1.99,"Southern Style Sweet Tea","drinks",true);
        MenuItems drink4 = new MenuItems(1.99,"Just some water","drinks",true);
        MenuItems pizza = new MenuItems(1.99,"16' pizza","entrees",true);
        MenuItems  lambChops= new MenuItems(1.99,"Grilled Lamb Chops","entrees",true);
        MenuItems friedTurkey = new MenuItems(1.99,"Deep fried turkey","entrees",true);
        MenuItems crabBroil = new MenuItems(1.99,"Crab Broil","entrees",true);

        System.out.println(crabBroil.getId());
    }
}
