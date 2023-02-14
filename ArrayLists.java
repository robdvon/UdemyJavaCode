package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class ArrayLists {
    public static void main(String[] args) {

        Object[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("apples", "produce", 6);
        groceryArray[2] = new GroceryItem("oranges", "produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "produce", 5));
        groceryList.set(0, new GroceryItem("apples", "produce", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
