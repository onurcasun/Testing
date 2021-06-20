package SinglyLinkedLists;

public class ChampionLinkedList {

    private ChampionNode headNode;
    private int size;

    // O(1), constant time complexity
    public void addToFront(Champion employee){
        ChampionNode node = new ChampionNode(employee);
        node.setNext(headNode);
        headNode = node;
        size++;
    }

    public ChampionNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        ChampionNode removedNode = headNode;
        headNode = headNode.getNext();        
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    // O(n), linear time complexity
    public void addToEnd(Champion champion){
        ChampionNode newNode = new ChampionNode(champion);
        if(headNode == null){
            headNode = newNode;
            return;
        }
            
        ChampionNode currentNode = headNode;
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        size++;        
    }

    public void printList(){
        ChampionNode current = headNode;
        System.out.println("HEAD ->");
        while(current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println(" NULL ");
        System.out.println("Size: " + size);
        System.out.println("IsEmpty: " + isEmpty());
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return headNode == null;
    }

}
