/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Day1;

/**
 *
 * @author pokem
 */
import java.util.Scanner;
import java.util.ArrayList;

public class LittleShopStart {
    public static ArrayList<String> check;
    public static void main(String[] args){
        //extra variables 
        check = new ArrayList<>();
        int menuCount =0;
        //for user input to order
        Scanner scan = new Scanner(System.in);
        String order;
        //make menu
        SandwichShopMenu Sandwich = new SandwichShopMenu();
        Iterator SandwichI = Sandwich.createIterator();
        //Start to print menu
        System.out.println("Menu");
        showMenu(SandwichI);
        //saveMenu(SandwichI);
        System.out.println("What sandwich would you like?");
        order = scan.nextLine();
        
        check = Sandwich.getMenu();
        /*
        //to see what is in check
        for(int i = 0; i < check.size(); i++) {   
            System.out.print(check.get(i));
        }
       */
        if (check.contains(order)){
            System.out.println("Item is on Menu");
        }
        else{
        //for testing
            System.out.println("Item is not on Menu");
        }
               
    }
    
    
    private static void showMenu(Iterator iterator){
        while (iterator.hasNextItem()){
            String menuI = (String) iterator.next();
            System.out.println(menuI);
        }
    }
     private static void saveMenu(Iterator iterator){
        while (iterator.hasNextItem()){
            String menuI = (String) iterator.next();
            check.add(menuI);
        }
    }
}
