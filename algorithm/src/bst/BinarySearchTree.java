package bst;

public class BinarySearchTree {

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	// 중위 순회 - inorder 오름차순 정렬
	public void display(Node n) {
		if(n != null) {		// 현재 전달받은 node가 null이 아니면
			display(n.getLeft());
			System.out.print(n.getKey() + "-");
			display(n.getRight());			
		}
	}
	
	// 특정값 트리 조회
	public boolean find(int key) {
		Node current = root;													// root 부터 조회 시작
		while(current != null) {
			System.out.println(current.getKey() + ": " + key + " 비교중");
			if(current.getKey() == key) return true;
			else if(current.getKey() > key) current = current.getLeft();		// 왼쪽으로 이동
			else if(current.getKey() < key) current = current.getRight();		// 오른쪽으로 이동			
		}
		return false;
	}
	
	public void insert(int key) {
		Node newNode = new Node(key);
		if(root == null) {		// 트리구성노드가 없다면
			root = newNode;
			return;
		}
		Node current = root;	// 트리구성노드 있다면 root 시작
		Node parent = null;
		// 새로운 노드 삽입 위치 지정, 부모와 자식 재연결
		while(current != null) {
			parent = current;
			// 현재 노드보다 작으면
			if(current.getKey() > key) {
				// 왼쪽 노드로 설정
				current = current.getLeft();
				if(current == null) {
					parent.setLeft(newNode);		// newNode가 왼쪽 노드로 설정
					return;
				}
			} 
			// 현재 노드보다 크면
			else {
				// 오른쪽 노드로 이동
				current = current.getRight();
				if(current == null) {
					parent.setRight(newNode);		// newNode가 오른쪽 노드로 설정
					return;
				}
			}
			System.out.println(parent.getKey());
			if(parent.getLeft() != null) System.out.println(parent.getLeft().getKey());
			if(parent.getRight() != null) System.out.println(parent.getRight().getKey());
		}
		
	}
	
	public booelan remove(int key) {
		current.getKey() == key;
		
	}
}
