package SinglyLinkedLists;

public class ChampionNode {

    private ChampionNode next;
    private Champion employee;

    public ChampionNode(Champion employee) {        
        this.employee = employee;
    }

    public ChampionNode getNext() {
        return this.next;
    }

    public void setNext(ChampionNode next) {
        this.next = next;
    }

    public Champion getEmployee() {
        return this.employee;
    }

    public void setEmployee(Champion employee) {
        this.employee = employee;
    }    

    @Override
    public String toString() {
        return this.employee.toString();
    }    
}
