package duong.dev;

import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST NodeTree = new BST();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 1 để tiếp tục, nhập 0 để dừng việc nhập");
 		int tam = sc.nextInt();
		System.out.println("Nhập root");
		int rut = sc.nextInt();
		NodeTree root = new NodeTree(rut);
		while(tam == 1) {
			System.out.println("Nhập phần tử: ");
			int rt = sc.nextInt();
			NodeTree.insertBST(root, rt);
			System.out.println("Nhập 1 để tiếp tục, nhập 0 để dừng việc nhập");
			tam  = sc.nextInt();
		}
		NodeTree.printLNR(root);
		NodeTree.printRNL(root);
		NodeTree.printNRL(root);
		NodeTree.inRaNut(root);
		NodeTree.demLa(root);
	}

}
