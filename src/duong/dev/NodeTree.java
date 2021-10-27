package duong.dev;

public class NodeTree {
	int nd;
	NodeTree left, right;
	public NodeTree(int n) {
		nd = n;
		left = right = null;
	}
	public void InNut() {
		System.out.println(nd + " ");
	}
}	