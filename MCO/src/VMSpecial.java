
/**
 * This class contains a subclass of VMReg
 * @author Johan Marlo T. Cabili
 * @author Joemar T. Lapasaran
 * @version 1.0
 */


import java.util.*;

public class VMSpecial extends VMReg {

    private ArrayList<Item> orderBag = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String buffer;
    /** Blueprint of the class VMSpecial
     * @param name name of the item
     * @param slotCount calories of the item
     * @param slotItemLimit price of the item
     */
    public VMSpecial(String name, int slotCount, int slotItemLimit) {
        super(name, slotCount, slotItemLimit);
    }   
    
    /** Gets the order bag
     * @return the order bag
     */
    public ArrayList<Item> getOrderBag(){
        return this.orderBag; 
    }

    
    
    /** Displays meal prepping
     * @return the message that it is prepping
     */
    public String prepareMeat(){
        String message = "";

        int size = this.getOrderBag().size();

        for (int k = 0; k < size; k++) {
            if (orderBag.get(k) instanceof Meat) {
                message += ("Searing " + orderBag.get(k).getName() + "...\n");
            }
        }
        return message; 
    }
    /**  Displays rice prep
     * @return the message that it is prepping
     */
    public String prepareRice(){
        String message = "";
        int size = this.getOrderBag().size();

        for (int k = 0; k < size; k++) {
            if (orderBag.get(k) instanceof Rice) {
                message += ("Boiling " + orderBag.get(k).getName() + "...\n");
            }
        }
        return message; 
    }
    /** Displays veggie prep
     * @return the message that it is prepping
     */
    public String prepareVeggies(){
        String message = "";

        int size = this.getOrderBag().size();
        for (int k = 0; k < size; k++) {
            if (orderBag.get(k) instanceof Veggie) {
                message += ("Frying " + orderBag.get(k).getName() + "...\n");
            }
        }
        return message; 
    }
    /** Displays extras prep
     * @return the message that it is prepping
     */
    public String prepareExtras(){
        String message = "";


        int size = this.getOrderBag().size();
        for (int k = 0; k < size; k++) {
            if (orderBag.get(k) instanceof Extra) {
                message += ("Topping with " + orderBag.get(k).getName() + "...\n");
            }
        }
        return message; 
    }
    /** Computes for the total price of the order bag
     * @return the total price of the order bag
     */
    public int computeOrderBag(){
        int total = 0; 
        int size = this.orderBag.size(); 
        for (int i = 0; i < size; i++){
            total += orderBag.get(i).getPrice();
        }
        return total; 
    }

}