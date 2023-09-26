/* Algorithms Questions*/
public class Node {
    public int key;
    public Node data;
    public Node left;
    public Node right;
    
    public Node(Node node){
        this.key= node.key;
        this.data = node.data;
        this.left = null;
        this.right = null;
    }

    
    
    // a. searchTree() method using iteration
    public static Objcet searchTree(Node root, int key) {
        while (root != null) {
            if(root.key == key){
                return root.object;
            }
            if(root.key > key ){
                root = root.left;
            } else {
                root= root.right;
            }
        }
         return null;
    }
    

    // b. mirror() method using recursion
    public static Node mirror(Node root) {
        if(root == null){
            return null;
        }
        Node mirrorNode = new Node(root);
        mirrorNode.left = mirror(root.right);
        mirrorNode.right = mirror(root.left);
        return mirrorNode;
    }
    
}

/* c .The time complexity of your mirror() method can be evaluated in Big-O notation as O(n), 
where "n" is the number of nodes in the tree. This is because each node is visited only once, 
and the recursive operation stops when root == null. */

/* d. I choose (a) because sorted array searches faster and takes up less computer memory