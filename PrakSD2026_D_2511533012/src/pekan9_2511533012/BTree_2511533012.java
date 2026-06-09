package pekan9_2511533012;

public class BTree_2511533012 {
    private Node_2511533012 root_3012;
    private Node_2511533012 currentNode_3012;
    public BTree_2511533012() {
        root_3012 = null;
    }
    public boolean search_2511533012(int data_3012) {
        return search_2511533012(root_3012, data_3012);
    }
    private boolean search_2511533012(Node_2511533012 node_3012, int data_3012) {
        if (node_3012.getData_2511533012() == data_3012)
            return true;
        if (node_3012.getLeft_2511533012() != null)
            if (search_2511533012(node_3012.getLeft_2511533012(), data_3012))
                return true;
        if (node_3012.getRight_2511533012() != null)
            if (search_2511533012(node_3012.getRight_2511533012(), data_3012))
                return true;
        return false; 
    }
    public void printInorder_2511533012() {
        root_3012.printInorder_2511533012(root_3012);
    }
    public void printPreorder_2511533012() {
        root_3012.printPreorder_2511533012(root_3012);
    }
    public void printPostorder_2511533012() {
        root_3012.printPostorder_2511533012(root_3012);
    }

    public Node_2511533012 getRoot_2511533012() {
        return root_3012;
    }
    public boolean isEmpty_2511533012() {
        return root_3012 == null;
    }
    public int countNode_2511533012() {
        return countNode_2511533012(root_3012);
    }
    private int countNode_2511533012(Node_2511533012 node_3012) {
        int count_3012 = 1;
        if (node_3012 == null) {
            return 0;
        } else {
            count_3012 += countNode_2511533012(node_3012.getLeft_2511533012());
            count_3012 += countNode_2511533012(node_3012.getRight_2511533012());
            return count_3012;
        }
    }
    public void print_2511533012() {
        root_3012.print_2511533012();
    }
    public Node_2511533012 getCurrent_2511533012() {
        return currentNode_3012;
    }
    public void setCurrent_2511533012(Node_2511533012 node_3012) {
        currentNode_3012 = node_3012;
    }
    public void setRoot_2511533012(Node_2511533012 root_3012) {
        this.root_3012 = root_3012;
    }
}

