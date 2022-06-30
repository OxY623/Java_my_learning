/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author 37533
 */
public class arrayListAndHisMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList listTest = new ArrayList();
        listTest.add("first str");
        listTest.add("second str");
        listTest.add("third str");
        listTest.add(9);
        
        Iterator it = listTest.iterator();
        while(it.hasNext()){
         System.out.println(it.next());
        }
        System.out.println(listTest);
        System.out.println(listTest.get(3));
        listTest.remove(9);
        System.out.println(listTest);
        
    }
    
}
