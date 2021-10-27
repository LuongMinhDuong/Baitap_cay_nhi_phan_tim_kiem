package duong.dev;

import java.util.Iterator;

public class BST {
	NodeTree Root;
	public BST(){
		NodeTree left  = null;
		NodeTree right = null;
	}
	public void insert(int x) {
		Root = insertBST(Root, x);
	}
	public NodeTree insertBST(NodeTree Root, int x) {
		if(Root == null) {
			NodeTree p = new NodeTree(x);
			p.left = p.right = null;
			Root = p;
		}
		if(x < Root.nd)
			insertBST(Root.left, x);
		else
			if(x > Root.nd)
				insertBST(Root.right, x);
			else
				System.out.println("Nút này không tồn tại!");
		return Root;
	}
	public void printRNL(NodeTree Root) {
		if(Root!= null)
			printRNL(Root.right);
			Root.InNut();
			printRNL(Root.left);
	}	
	
	public void printLNR(NodeTree Root) {
		if(Root!= null)
			printLNR(Root.left);
			Root.InNut();
			printLNR(Root.right);
	}
	
	public void printNRL(NodeTree Root) {
		if(Root!= null)
			printNRL(Root.left);
			Root.InNut();
			printNRL(Root.right);
	}
	public int soPtLe(NodeTree Root) {
		if(Root!= null) {
			if(Root.nd%3==0)
				return 1 + soPtLe(Root.left)  + soPtLe(Root.right);
			else
				return soPtLe(Root.left) + soPtLe(Root.right);
		}
		else
			return 0; 
	}
	public int sum(NodeTree Root) {
		if (Root != null) 
			return Root.nd + sum(Root.left) + sum(Root.right);
		return 0;
	}
	public void inRaNut(NodeTree Root) {
		if (Root != null) {
			if((Root.nd %2 != 1) && (Root.nd %5 == 0)) 
				Root.InNut();
			printLNR(Root.right);
			printLNR(Root.left);
		}
	}
	public int demLa(NodeTree Root) {
		if(Root != null) {
			if(Root.left == null && Root.right == null) {
				return 1 + demLa(Root.left) + demLa(Root.right);
			}
			else
				return demLa(Root.left) + demLa(Root.right);
		}
		return 0;
	}
}