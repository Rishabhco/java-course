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
public class CommandLineArguements {
    public static void main(String[] args){
        int s=0;
        for(int i=0;i<args.length;i++){
            s=s+Integer.parseInt(args[i]);
        }
        System.out.println(s);
    }
}
