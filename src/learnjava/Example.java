/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;
/**
 *
 * @author risha
 */
public class Example {
    public static void main(String[] args){
        Box smallbox=new Box();
        smallbox.setDimension(2, 3, 4);
        smallbox.showDimension();
        smallbox=new Box();
        smallbox.showDimension();
    }
}
