package PWC_Practices;
import java.util.*;
class TreeNode{
	int data;
	TreeNode left = null;
	TreeNode right = null;
	TreeNode(int data){
		this.data = data;
	}
}
public class InorderTree {
	public static void inorderIterative(TreeNode root){
		//create an empty stack
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode curr = root;
		
		//if the current node is null and the satck is also empty then were done
		while(!stack.isEmpty() || curr!=null){
			//if the current node is not null, push it into the stack (defer it)
			//and move to its left chile
			if(curr!=null){
				stack.push(curr);
				curr = curr.left;
			}
			else{
				//else if current node is null, pop an element from the stack, print it and finally set current node to itd right
				curr = stack.pop();
				System.out.println(curr.data+" ");
				curr = curr.right;
			}
		}
	}
	
	public static void inorderRecursive(TreeNode root){
		if(root == null){
			return;
		}
		inorderIterative(root.left);
		
		System.out.println(root.data +" ");
		
		inorderIterative(root.right);
	}

}
