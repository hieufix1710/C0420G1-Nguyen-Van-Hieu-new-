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

    public boolean insert(E e);

    public void inorder();

    public void postoder();

    public void preoder();

    public void breathlist();

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


    public static class BST<E extends Comparable<E>> extends AbstractTree<E> {
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

        public boolean search(E element) {
            TreeNode<E> current = root;

            while (current != null) {
                if (element.compareTo(current.element) < 0) {
                    current = current.left;
                } else if (element.compareTo(current.element) > 0) {
                    current = current.right;
                } else
                    return true;
            }
            return false;

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

        @Override
        public void breathlist() {
            breathlist(root);
        }

        private void breathlist(TreeNode<E> root) {
            if (root == null) return;


        }


        protected void preoder(TreeNode<E> root) {
            if (root != null) {
                System.out.print(root.element + " ");
            } else if (root == null) return;
            preoder(root.left);
            preoder(root.right);
        }

        protected void postoder(TreeNode<E> root) {
            if (root == null) return;
            postoder(root.left);
            postoder(root.right);
            System.out.print(root.element + " ");
        }

        protected void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            System.out.print(root.element + " ");
            inorder(root.right);
        }


        public void deleteKey(E element) {
            root = deleteRec(root, element);
            size--;
        }
        /* Hàm đệ qui để xóa phần tử khỏi mảng */
        public TreeNode<E> deleteRec(TreeNode<E> root, E element) {
            /* trường hợp gốc : nếu node root null */
            if (root == null) {
                return root;
            }
            /* ngược lại chúng ta sẽ duyệt dọc cây  */
            if (element.compareTo(root.element)<0)
                root.left = deleteRec(root.left, element);
            else if (element.compareTo(root.element)>0)
                root.right = deleteRec(root.right, element);
                // nếu key có cùng giá trị với node key thì chính là node cần xóa
            else {
                // node không có hoặc chỉ có 1 node con
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                // node có 2 node con.
                root.element = minValue(root.right);
                // Xóa phần từ nhỏ nhất bên phải
                root.right = deleteRec(root.right, root.element);
            }
            return root;
        }
        public E minValue(TreeNode<E> root) {
            E minv = root.element;
            while (root.left != null) {
                minv = root.left.element;
                root = root.left;
            }
            return (E) minv;
        }

        public static class TestBST {
            public static void main(String[] args) {
                //create a BST
                BST<Integer> tree = new BST<>();
                tree.insert(60);
                tree.insert(55);
                tree.insert(100);
                tree.insert(45);
                tree.insert(57);
                tree.insert(67);
                tree.insert(107);
                tree.insert(59);
                tree.insert(101);

                //traverse tree
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Choose method you need sort ?");
//            System.out.println("1.Use inorder" + "\n" + "2.Use post-orser" + "\n" + "3.Use pre-oder" + "\n"
//                    + "4.Use breath first");
//            int choose = scanner.nextInt();
//            switch (choose) {
//                case 1:
//                    System.out.println("Inorder (sorted): ");
//                    tree.inorder();
//                    break;
//                case 2:
//                    System.out.println("Post-oder (sorted): ");
//                    tree.postoder();
//                    break;
//                case 3:
//                    System.out.println("Pre-order (sorted): ");
//                    tree.preoder();
//                    break;
//                case 4:
//                    System.out.println("Breath list (sorted):");
//                    tree.breathlist();
//
//                default:
//                    System.out.println("Error ! Restart again !");
//
//            }
//
//
//            System.out.println("The number of nodes is: " + tree.getSize());
//                System.out.println("Enter element need find :");
//
//                System.out.println(tree.search(element));


            }
        }
    }
}


