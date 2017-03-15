package lab03;

import java.io.PrintStream;




public class BST{
	Node root;
	class Node{
		Comparable key;
		Object data;
		Node leftChild;
		Node rightChild;
		public Node(Object d,Comparable key) {
			this.key=key;
			data=d;
			leftChild=null;
			rightChild=null;
		}
	}  
	BST(){
		root=null;
	}
	public java.lang.Object get(java.lang.Comparable theKey){
	Node n=root;
		while(theKey.compareTo(n.key)==0 && n==null){
			if(theKey.compareTo(n.key)==1){
				n=n.rightChild;
			}
			else if(theKey.compareTo(n.key)==-1){
				n=n.leftChild;
			}
			else{
				return n.data;
			}
		}
		return n.data;
		}
	//}
	public void put(java.lang.Comparable theKey, java.lang.Object x){
		Node newChild=new Node(x,theKey);
		if(root==null){
			root=newChild;
			return;
		}
		else{
			Node curnt=root;
			Node parent=null;
			while(true){
				parent=curnt;
				if(theKey.compareTo(curnt.key)==1){
					curnt=curnt.rightChild;
					if(curnt==null){
						parent.rightChild=newChild;
						return;
					}
				}
			if(theKey.compareTo(curnt.key)==0){
				
			}
				else{
					curnt=curnt.leftChild;
					if(curnt==null){
						parent.leftChild=newChild;
						return;
					}
				}
				
			}
		}
	}
	public java.lang.Object remove(java.lang.Comparable theKey){
		return theKey;

	}
	public boolean isEmpty(){
		if(root == null) return true;
		else return false;
	}
	public void preOrderOutput(java.io.PrintStream out){
		preOrderOutput(root, out);
	}
	private void preOrderOutput(Node n,PrintStream out){
		if (n == null)
			return ;
			out.println(""+ n.data );
			preOrderOutput(n.leftChild, out);
			preOrderOutput(n.rightChild,out);

	}
	public void inOrderOutput(java.io.PrintStream out){
		inOrderOutput(root, out);
	}
	private void inOrderOutput(Node n, PrintStream out) {
		// TODO Auto-generated method stub
		if (n == null)
			return ;
			inOrderOutput(n.leftChild, out);
			out.println(""+ n.data );
			inOrderOutput(n.rightChild,out);

	}
	public void postOrderOutput(java.io.PrintStream out){
		postOrderOutput(root, out);
	}
	private void postOrderOutput(Node n, PrintStream out) {
		// TODO Auto-generated method stub
		if (n == null)
			return ;
			postOrderOutput(n.leftChild, out);
			postOrderOutput(n.rightChild,out);
			out.println(""+ n.data );

	}
}