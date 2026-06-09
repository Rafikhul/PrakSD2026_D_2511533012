package pekan9_2511533012;

public class BtreeDriver_2511533012 {
    public static void main(String[] args) {
        BTree_2511533012 tree = new BTree_2511533012();
        System.out.print("Jumlah Simpul awal pohon: ");
        System.out.println(tree.countNode_2511533012());
        
        Node_2511533012 root_3012 = new Node_2511533012(1);

        tree.setRoot_2511533012(root_3012);
        System.out.println("Jumlah simpul jika hanya ada root: ");
        System.out.println(tree.countNode_2511533012());
        Node_2511533012 node2_3012 = new Node_2511533012(2);
        Node_2511533012 node3_3012 = new Node_2511533012(3);
        Node_2511533012 node4_3012 = new Node_2511533012(4);
        Node_2511533012 node5_3012 = new Node_2511533012(5);
        Node_2511533012 node6_3012 = new Node_2511533012(6);
        Node_2511533012 node7_3012 = new Node_2511533012(7);
        Node_2511533012 node8_3012 = new Node_2511533012(8);
        Node_2511533012 node9_3012 = new Node_2511533012(9);
        root_3012.setLeft_2511533012(node2_3012);
        node2_3012.setLeft_2511533012(node4_3012);
        node2_3012.setRight_2511533012(node5_3012);
        node4_3012.setRight_2511533012(node8_3012);
        root_3012.setRight_2511533012(node3_3012);
        node3_3012.setLeft_2511533012(node6_3012);
        node3_3012.setRight_2511533012(node7_3012);
        node6_3012.setLeft_2511533012(node9_3012);
        
        tree.setCurrent_2511533012(tree.getRoot_2511533012());
        System.out.println("menampilkan simpul terakhir: ");
        System.out.println(tree.getCurrent_2511533012().getData_2511533012());
        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
        System.out.println(tree.countNode_2511533012());
        System.out.println("InOrder: ");
        tree.printInorder_2511533012();
        System.out.println("\nPreOrder: ");
        tree.printPreorder_2511533012();
        System.out.println("\nPostOrder: ");
        tree.printPostorder_2511533012();
        System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
        tree.print_2511533012();
    }
}
