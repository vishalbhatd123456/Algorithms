package PWC_Practices;

class Node{
	int value;
	Node next;
	public Node(){}
	public Node(int value){
		this.value = value;
	}
	
	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
	
	//overloaded the constructors
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	@Override
	public String toString(){
		String sequence = "";
		Node head = this;
		while(head!=null){
			sequence = sequence + head.getValue()+" -> ";
			head = head.getNext();
		}
		sequence = sequence + "null";
		return sequence;
	}
}

public class RearrangeNodes {
	public static Node swap(Node current, Node next){
		current.setNext(next.getNext());
		next.setNext(current);
		return next;
	}
	
	public static Node makeLowHigh(Node current){
		if(current == null || current.getNext() == null || current.getValue() < current.getNext().getValue()){
			return current;
		}
		return swap(current, current.getNext());
	}
	
	public static Node makeHighLow(Node current){
		if(current == null || current.getNext() == null || current.getValue() > current.getNext().getValue()){
			return current;
		}
		return swap(current, current.getNext());
	}
	
	public static void arrangeNodes(Node linkedList){
		Node head = makeLowHigh(linkedList);
		
		Node prev = head;
		int counter = 1;
		
		
		while(prev!= null && prev.getNext()!=null){
			System.out.print(prev.value+" ");
			if(counter%2 == 0){
				prev.setNext(makeLowHigh(prev).getNext());
			}else{
				prev.setNext(makeHighLow(prev.getNext()));
			}
			
			counter+=1;
			prev = prev.getNext();
		}
		System.out.println();
		System.out.println(head);
	}
}
