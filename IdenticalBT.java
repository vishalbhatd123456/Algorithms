package PWC_Practices;
class Node{
	int key;
	Node left = null;
	Node right = null;
	Node(int key){
		this.key = key;
	}
}
public class IdenticalBinaryTrees {
	
	//recursive funtion to check if the 2 bt are equal or not
	public static boolean isIdentical(Node x, Node y){
		if(x == null && y == null){
			return true;
		}
		//if both the trees are non-empty and value of thier root node matches, then recur for their left and right sub-trees
		return (x!= null && y!= null) && (x.key == y.key) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right);
	}
	public static void main(String[] args) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
	}

}
