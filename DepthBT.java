package PWC_Practices;
class Node1{
	int data;
	Node1 left = null;
	Node1 right = null;
	
	Node1(int data){
		this.data = data;
	}
}

public class DepthBT {
	
	//recursive function to calculate the height o a given bt
	public static int height(Node1 root){
		if(root == null){
			return 0;
		}
		
		return 1+ Math.max(height(root.left), height(root.right));
	}
	
	public static void main(String[] args) {
		Node1 root = null;
		root = new Node1(15);
		root = new Node1(10);
		
	}

}
