package PWC_Practices;

import java.util.Stack;

public class PreOrderImplementation {
	
	public static void preorder(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.data+" ");
		//traverse the left st
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void preOrderIterative(TreeNode root){
		if(root == null){
			return;
		}
		
		//create an empty stack
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode curr = stack.pop();
			
			System.out.println(curr.data+" ");
			//important to note that the right child is pushed first before the left child
			if(curr.right!=null){
				stack.push(curr.right);
			}
			
			if(curr.left!=null){
				stack.push(curr.left);
			}
		}
	}

}
