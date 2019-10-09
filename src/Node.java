import java.util.LinkedList;
import java.util.Queue;

public class Node {

	Node left, right;
	int value;
	
	public Node(int k) {
		this.value=k;
		this.left = this.right = null;
	}

	public Node BFS(int k) {// this can save the callstack outOfMmeory ; non recursive solution not tested
							// yet (drawbacks : doesn't use the binary search on a sorted dataSet can be
							// enhanced to do so
		if (this == null)
			return null;
		Queue<Node> BFSQueue = new LinkedList<Node>();
		BFSQueue.offer(this);
		while (!BFSQueue.isEmpty()) {
			Node tmp = BFSQueue.poll();
			if (tmp.value == k)
				return tmp;
			if (tmp.left != null)
				BFSQueue.offer(tmp.left);
			if (tmp.right != null)
				BFSQueue.offer(tmp.right);
		}
		return null;
	}


	public Node find(int k) {// this recursive solution fails at the second example cause of recursion call
								// stack memory
		// System.out.println("entering node " + this.value);
		if (this.value == k) {
			// System.out.println("bingo");
			return this;
		} else if (this.value < k) {
			if (this.right == null)
				return null;
			// System.out.println("from value " + this.value + " going to right");
			return this.right.find(k);
		}
		else {
			if (this.left == null)
				return null;
			// System.out.println("from value " + this.value + " going to left");
			return this.left.find(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node tree = new Node(9);
		tree.left = new Node(7);
		tree.left.left = new Node(5);
		tree.left.left.left = new Node(2);
		tree.left.right = new Node(8);
		tree.left.left.right = new Node(6);
		tree.right = new Node(13);
		tree.right.right = new Node(17);
		tree.right.right.left = new Node(16);
		Node result = tree.BFS(16);
		System.out.println(result == null ? null : result.value);
	}

}
