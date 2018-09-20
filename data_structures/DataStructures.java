
package data_structures;

import data_structures.Collections.List.LinkedList.LinkedList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataStructures {

    public static void main(String[] args) {
        LinkedList<String> strLinked = new LinkedList<>();
        strLinked.add("str val");
        strLinked.add("2nd str val");
        strLinked.add("3rd str val");
        strLinked.insert(1, "inserted val");
        strLinked.add("4th str val");
        strLinked.add("5th str val");
        strLinked.insert(5, "2nd inserted val");
        strLinked.add("6th str val");
        strLinked.insert(7, "3rd inserted val");
        strLinked.delete(0);
        strLinked.delete(0);
        strLinked.delete(0);
        for(int i=0;i<strLinked.getLength();i++){
            System.out.println("[" + i + "] = " + strLinked.get(i));
        }
        System.out.println(strLinked.toString());
        try {
            System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(DataStructures.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
