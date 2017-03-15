package lab03;


public class BSTTester {
	public static void main(String[] args) {
		BST btree = new BST();
		Book b1 = new Book(121, "ABC", 250);
		btree.put( new Integer(121), b1);
		btree.put(new Integer(133),new Book(133,"XYZ", 330));
		Book x = (Book) btree.get(new Integer(121));
		btree.inOrderOutput(System.out);
	}
}