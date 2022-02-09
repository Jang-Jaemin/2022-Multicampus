package bst;

public class BSTMain {

	public static void main(String[] args) {

		Node n1 = new Node(1);
		Node n2 = new Node(8);
		Node n3 = new Node(30);
		Node n4 = new Node(11);
		Node n5 = new Node(80);
		Node n6 = new Node(300);
		Node n7 = new Node(200);
//		Node n8 = new Node(100);
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.setRoot(n3);
		n3.setLeft(n2);
		n3.setRight(n7);
		n2.setLeft(n1);
		n2.setRight(n4);
		n7.setLeft(n5);
		n7.setRight(n6);
		bst.display(n3);		// 부모 중간 조회 - 오름차순
		System.out.println();
		
		System.out.println(bst.find(300));
		System.out.println(bst.find(3000));
		System.out.println(bst.find(8));
		
		bst.insert(20);
		bst.insert(40);
		bst.insert(30);
		bst.insert(50);
		bst.insert(70);
		bst.display(bst.getRoot());
		System.out.println();
	}

}
