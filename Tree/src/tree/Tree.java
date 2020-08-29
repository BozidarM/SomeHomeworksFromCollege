
package tree;


public class Tree {

    
    public static void main(String[] args) {
                BinaryTree b = new BinaryTree();
		b.insert(4);b.insert(8);
		b.insert(2);b.insert(5);b.insert(6);b.insert(2);b.insert(12);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);		
		System.out.println("");
		System.out.println("Provera da li element 5 postoji : " + b.find(5));
		System.out.println(" \n Brisanje cvora bez dece : " + b.delete(2));		
		b.display(b.root);
                System.out.println(" \n Brisanje cvora sa jednim detetom  (4) : " + b.delete(4));		
		b.display(b.root);
		System.out.println(" \n Brisanje cvora sa 2 deteta (12) : " + b.delete(12));		
		b.display(b.root);
                
    }
    
}
