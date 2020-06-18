package collection_framework.thuc_hanh.bai1_itereator_binary_search_tree;


import java.util.Scanner;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }
}

interface Tree<E> {
    /**
     * Insert element e into the binary search tree.
     * Return true if the element is inserted successfully.
     */
    public boolean insert(E e);

    /**
     * Inorder traversal from the root
     */
    public void inorder();
    public void postoder();
    public void preoder();

    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}

abstract class AbstractTree<E> implements Tree<E> {
    @Override
    /** Inorder traversal from the root*/
    public void inorder() {
    }

    @Override
    public void postoder() {

    }

    @Override
    public void preoder() {

    }
}

class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }


    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e); /*create a new root*/
        else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    @Override
    public void postoder() {
        postoder(root);
    }

    @Override
    public void preoder() {
        preoder(root);
    }

    protected void preoder(TreeNode<E> root) {
        if (root == null) return;
        preoder(root);
        System.out.println(root.element + " ");
        preoder(root.left);
        System.out.println(root.element + " ");
        preoder(root.right);
    }

    protected void postoder(TreeNode<E> root) {
        if (root == null) return;
        postoder(root.left);
        System.out.println(root.element + " ");
        postoder(root.right);
        System.out.println(root.element + " ");
        postoder(root);
        System.out.println(root.element + " ");
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }


public static class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(100);
        tree.insert(107 );
        tree.insert(59   );
        tree.insert(101 );
        //traverse tree
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose method you need sort ?");
        System.out.println("1.Use inorder"+"\n"+"2.Use postorser"+"\n"+"3.Use preoder");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Inorder (sorted): ");
                tree.inorder();
                break;
            case 2:
                System.out.println("Postoder (sorted): ");
                tree.postoder();
                break;
            case 3:
                System.out.println("Preorder (sorted): ");
                tree.preoder();
                break;
            default:
                System.out.println("Error ! Restart again !");

        }




        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
}


