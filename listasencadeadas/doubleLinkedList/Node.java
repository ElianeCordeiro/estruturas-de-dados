package doubleLinkedList;

public class Node {
	
	private int info;
	private Node next;
	private Node before;
	
	public Node(int info) {
		super();
		this.info = info;
		this.before = null;
		this.next = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getBefore() {
		return before;
	}

	public void setBefore(Node before) {
		this.before = before;
	}
	
	
}
