package org.example;

import org.example.binary_tree.BalancedBinaryTree;
import org.example.lab0.Measure;
import org.example.lab0.Product;
import org.example.queue.MyQueue;
import org.example.queue.MyQueueImpl;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //List<Product> list = Product.readFromFile("MOCK_DATA.json");
        //Product.shuffle(list);
        //Product.writeProductsToNewFile("src/main/java/org/example/lab2/mylib/UNSORTED.json", list);

        List<Product> products = Product.readFromFile("MOCK_DATA.json");

        BalancedBinaryTree binTree = new BalancedBinaryTree();
        int middle = 25;
        binTree.setRoot(binTree.makeBinaryTree(products, 0, products.size()-1));

        System.out.println(binTree.binaryTreeSearch(25));

        binTree.delete(51);

        Product tmp = new Product(52, "Pineapple", "Best pineapple in the world", 500.10f, 5, Measure.L);
        binTree.insert(tmp);

        System.out.println("_______________BINARY TREE____________________");

        BalancedBinaryTree.preorderTraversal(binTree.getRoot());

        BalancedBinaryTree.postorderTraversal(binTree.getRoot());

        BalancedBinaryTree.inorderTraversal(binTree.getRoot());


        System.out.println("\n_______________QUEUE____________________");

        MyQueue<Integer> queue = new MyQueueImpl<>();

        queue.put(1);
        queue.put(2);
        queue.put(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.get());
        }
        int i = 0;
        while (!queue.isFull()) {
            queue.put(i++);
        }
        System.out.println("Queue is full -> " + queue.isFull() + ", size -> " + queue.getSize());






    }

}