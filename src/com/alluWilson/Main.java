package com.alluWilson;

public class Main {

    public static void main(String[] args) {
        groceryList AllansList = new groceryList();
        AllansList.addGroceryItem("Milk");
        AllansList.addGroceryItem("Ham");
        AllansList.printGroceryList();
        AllansList.modifyGroceryItem(1,"Eggs");
        AllansList.printGroceryList();
        AllansList.removeGroceryItem(1);
        AllansList.printGroceryList();
    }

}
