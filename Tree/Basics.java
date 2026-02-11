package Tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree {

    Node root;

    // Insert Method
    public void insert(int data) {

        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {

        // If tree is empty
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Inorder Traversal (prints sorted order)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public int sum() {
        return sumRec(root);
    }

    private int sumRec(Node root) {

        // Base case
        if (root == null) {
            return 0;
        }

        return root.data + sumRec(root.left) + sumRec(root.right);
    }
}

public class Basics {

    private static int maxVal(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int leftMax = maxVal(root.left);
        int rightMax = maxVal(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Tree bst = new Tree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        bst.inorder(bst.root);
        System.out.println();
        System.out.println(bst.sum());

        System.out.println(maxVal(bst.root));
    }
}
