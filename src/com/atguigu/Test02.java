package com.atguigu;


class Node {
	private String key;
	private Node nextNode;
	
	public Node(String key){
		this.key=key;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}

public class Test02 {
	
	public static Node reverse(Node newNode) {
		
		return newNode;
	}
	
	public static void main(String[] args) {
		Node head=new Node("A");
		Node node1=new Node("B");
		Node node2=new Node("C");
		Node node3=new Node("D");
		Node node4=new Node("E");
		head.setNextNode(node1);
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		
		Node tmpNode=head;
		while(tmpNode!=null){
			System.out.println(tmpNode.getKey());
			tmpNode=tmpNode.getNextNode();
		}
		
		Node newHead=reverse(head);
	    tmpNode=newHead;
		while(tmpNode!=null){
			System.out.println(tmpNode.getKey());
			tmpNode=tmpNode.getNextNode();
		}
	}

}
