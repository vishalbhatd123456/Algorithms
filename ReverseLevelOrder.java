package PWC_Practices;

import java.util.*;

class Node4{
	int data;
	Node4 left = null;
	Node4 right = null;
	
	public Node4(int data){
		this.data = data;
	}
}

public class ReverseLevelOrder {
	
	public static void reverseLevelOrderTracersal(Node4 root){
		if(root == null){
			return;
		}
		
		Queue<Node4> queue = new LinkedList<Node4>();
		queue.add(root);
		
		Deque<Integer> stack = new ArrayDeque<>();
		
		//pointer to store the currnet nodr
		Node4 curr;
		
		//loop till queue is epty
		while(!queue.isEmpty()){
			curr = queue.poll();
			
			//push the current node into the stack
			stack.push(curr.data);
			
			//process the right first and then only the left
			if(curr.right!=null){
				queue.add(curr.right);
			}
			if(curr.left!=null){
				queue.add(curr.left);
			}
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.poll()+" ");
		}
	}
	public static void main(String[] args) {
		Node4 root = new Node4(15);
		root.left = new Node4(10);
		root.right = new Node4(20);
		root.left.left = new Node4(8);
		root.left.right = new Node4(12);
		root.right.left = new Node4(16);
		root.right.right = new Node4(25);
		
		reverseLevelOrderTracersal(root);
	}

}
