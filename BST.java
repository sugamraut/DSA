class Node {
    Integer data;
    Node left, right;

    public Node(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(Node left, Integer data, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}

public class BST {
    Node root;

    public void visit(Node p) {
        System.out.print(p.data + "->");
    }

    public void inorder(Node p) {
        if (p != null) {
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }

    public void insert(int key) {
        Node p = root, prev = null;
        while (p != null) {
            prev = p;
            if (p.data < key) {
                p = p.right;
            } else {
                p = p.left;
            }
        }
        if (root == null) {
            root = new Node(key);
        } else if (prev.data < key) {
            prev.right = new Node(key);
        } else {
            prev.left = new Node(key);
        }
    }
}

class BSTDemo {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(8);
        tree.insert(20);
        tree.insert(5);
        tree.insert(7);
        tree.insert(6);
        tree.insert(3);
        tree.insert(2);
        tree.insert(23);
        tree.insert(6);
        tree.insert(25);
        tree.insert(16);
        tree.insert(13);
        tree.insert(6);
        tree.insert(18);
        System.out.println("result of inorder traversal is:\n");
        tree.inorder(tree.root);

    }
}
