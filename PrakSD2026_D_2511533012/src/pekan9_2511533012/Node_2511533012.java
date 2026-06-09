package pekan9_2511533012;

public class Node_2511533012 {
    int data_3012;
    Node_2511533012 left_3012;
    Node_2511533012 right_3012;
    public Node_2511533012(int data_3012) {
        this.data_3012 = data_3012;
        left_3012 = null;
        right_3012 = null;
    }
    public void setLeft_2511533012(Node_2511533012 node_3012) {
        if (left_3012 == null)
            left_3012 = node_3012;
    }
    public void setRight_2511533012(Node_2511533012 node_3012) {
        if (right_3012 == null)
            right_3012 = node_3012;
    }
    public Node_2511533012 getLeft_2511533012() {
        return left_3012;
    }
    public Node_2511533012 getRight_2511533012() {
        return right_3012;
    }
    public int getData_2511533012() {
        return data_3012;
    }
    public void setData_2511533012(int data_3012) {
        this.data_3012 = data_3012;
    }

    void printPreorder_2511533012(Node_2511533012 node_3012) {
        if (node_3012 == null)
            return;
        System.out.print(node_3012.data_3012 + " ");
        printPreorder_2511533012(node_3012.left_3012);
        printPreorder_2511533012(node_3012.right_3012);
    }
    void printPostorder_2511533012(Node_2511533012 node_3012) {
        if (node_3012 == null)
            return;
        printPostorder_2511533012(node_3012.left_3012);
        printPostorder_2511533012(node_3012.right_3012);
        System.out.print(node_3012.data_3012 + " ");
    }
    void printInorder_2511533012(Node_2511533012 node_3012) {
        if (node_3012 == null)
            return;
        printInorder_2511533012(node_3012.left_3012);
        System.out.print(node_3012.data_3012 + " ");
        printInorder_2511533012(node_3012.right_3012);
    }
    public String print_2511533012() {
        return this.print_2511533012("" ,true ,"");
    }
    public String print_2511533012(String prefix, boolean isTail, String sb) {
        if (right_3012 != null) {
            right_3012.print_2511533012(prefix + (isTail ? "|  " : "   "), false, sb);
        }
        System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data_3012);
        if (left_3012 != null) {
            left_3012.print_2511533012(prefix + (isTail ? "   " : "|  "), true, sb);
        }
        return sb;
    }
}

