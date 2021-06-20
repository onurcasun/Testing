import java.util.Arrays;

import com.onurcasun.sortalgorithms.*;
import com.onurcasun.util.ArrayGenerator;
import com.onurcasun.util.ConsolePrinter;

import SinglyLinkedLists.Champion;
import SinglyLinkedLists.ChampionLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Champion bloodHound = new Champion("Blood", "Hound", 1);
        Champion lifeLine = new Champion("Life", "Line", 2);
        Champion octaneFastger = new Champion("Octane", "Faster", 3);
        Champion valkyrieValhalla = new Champion("Valkyrie", "Valhalla", 4);
        

        ChampionLinkedList linkedList = new ChampionLinkedList();
        linkedList.addToFront(bloodHound);
        linkedList.addToFront(lifeLine);
        linkedList.addToFront(octaneFastger);
        linkedList.addToEnd(valkyrieValhalla);
        linkedList.printList();        

        linkedList.removeFromFront();
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();

        linkedList.removeFromFront();
        linkedList.printList();
        
    }
}
