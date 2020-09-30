package PWC_Practices;
import java.util.*;

class Node2{
	int key;
	Node2 left = null;
	Node2 right = null;
	
	Node2(int data){
		this.key = key;
	}
}
public class LevelOrderTraversal {
	
	public static void levelOrderTraversal(Node2 root){
		Queue<Node2> queue = new LinkedList<Node2>();
		queue.add(root);
		
		Node2 curr;
		
		while(!queue.isEmpty()){
			
			//process each node in queue and enqueue their non-empty left and right child to the queeu
			
			curr = queue.poll();
			
			System.out.println(curr.key+" ");
			if(curr.left != null){
				queue.add(curr.left);
			}
			
			if(curr.right != null){
				queue.add(curr.right);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Node2 root = new Node2(15);
		root.left = new Node2(10);
		root.right = new Node2(20);
		root.left.left = new Node2(8);
	
	}
	
	

}
