package tree;

public class TreeMain {

	public static void main(String[] args) {

		Node nj = new Node("J");
		Node ni = new Node("I");
		Node nh = new Node("H");
		Node ng = new Node("G");
		Node nf = new Node("F");
		Node ne = new Node("E", nj, null);
		Node nd = new Node("D", nh, ni);
		Node nc = new Node("C", nf, ng);
		Node nb = new Node("B", nd, ne);
		Node na = new Node("A", nb, nc);
		
		BinaryTree bt = new BinaryTree();
		bt.setRoot(na);
		
		// 모든 데이터값 조회
		System.out.println("===중위 순회===");
		bt.inorder(na);
		System.out.println();
		System.out.println("===전위 순회===");
		bt.preorder(na);
		System.out.println();
		System.out.println("===후위 순회===");
		bt.postorder(na);
		System.out.println();
		System.out.println("===레벨 순회(BFS)===");
		bt.levelorder(na);
		System.out.println();

		bt.find("h");
		// 트리 대소문자 구분없이 H h 이름 트리만 출력 / 못찾았으면 '없다'
		
	}

}
