package PWC_Practices;

import java.util.ArrayDeque;
import java.util.Deque;

class Node3{
	int key;
	Node3 left = null;
	Node3 right = null;
	
	Node3(int key){
		this.key = key;
	}
}

public class SpiralOrderTraversal {
	
	public static void spiralOrderTraversal(Node3 root){
		if(root == null){
			return;
		}
		
		//create an empty double ended qeue and enque the root
		Deque<Node3> deque = new ArrayDeque<>();
		deque.addFirst(root);
		
		//flag used to diff between odd or even levels
		
		boolean flag = false;
		
		while(!deque.isEmpty()){
			
			//calc the number of nodes in the current level
			int nodeCount = deque.size();
			
			if(flag){
				//process each node of the current level and enqueue their non-empty left abd right child to deque
				while(nodeCount > 0){
					Node3 curr = deque.pollFirst();
					System.out.print(curr.key+" ");
					
					//push the left child to the end followed by the right child if the flag is true
					if(curr.left!=null)
						deque.addLast(curr.left);
					
					if(curr.right!=null)
						deque.addLast(curr.right);
				}
				nodeCount--;
			}else{
				//process each node of the current level and enqueue their non-empty right and left child into the queue
				while(nodeCount > 0){
					Node3 curr = deque.pollLast();
					System.out.print(curr.key+" ");
					
					if(curr.right!=null){
						deque.addFirst(curr.right);
					}
					
					if(curr.left!=null){
						deque.addFirst(curr.left);
					}
					nodeCount--;
				}
			}
			
			flag = !flag;
			System.out.println();
			
			
		}
	}

}
