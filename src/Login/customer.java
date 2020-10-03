/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Shivam
 */
public class customer {
    public static int i = 0;    //keeps track of record
    public static String[]  password = new String[10];   //public static so as  
    public static String[] email = new String[10];      //to access it both 
    public static String[] name = new String[10];     //across signin and signup
    public static String[] phno = new String[10];                    
    public static String[] address = new String[10]; 
    public static int current;
    
    boolean passcheck(){
        return true;
    }
}