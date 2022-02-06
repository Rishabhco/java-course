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
public class Box {
        private int length,height,breadth;
        public void setDimension(int l,int b,int h){
            length=l;
            height=h;
            breadth=b;
        }
        public void showDimension(){
            System.out.println(length);
            System.out.println(breadth);
            System.out.println(height);
        }
}
