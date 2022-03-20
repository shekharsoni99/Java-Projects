import com.masai.Employee;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<ProductBean> ts = new TreeSet<>(new SortByProductId());

        System.out.println("Press 1 for sorting the product according to the Product Price");
        System.out.println("Press 2 for sorting the product according to the Product Name");
        System.out.println("Press 3 for sorting the product according to the Product Id");

        int choice = sc.nextInt();

        if (choice == 1) {
            ts = new TreeSet<>(new SortByProductPrice());

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter Product Id: " + (i+1));
                int productId = sc.nextInt();

                System.out.println("Enter Product name: " + (i+1));
                String productName = sc.next();

                System.out.println("Enter Product price: " + (i+1));
                double productPrice = sc.nextInt();

                ts.add(new ProductBean(productId, productName, productPrice));
            }
        }
        if (choice == 2) {
            ts = new TreeSet<>(new SortByProductName());

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter Product Id: " + (i+1));
                int productId = sc.nextInt();

                System.out.println("Enter Product name: " + (i+1));
                String productName = sc.next();

                System.out.println("Enter Product price: " + (i+1));
                double productPrice = sc.nextInt();

                ts.add(new ProductBean(productId, productName, productPrice));
            }
        }
        if (choice == 3) {
            ts = new TreeSet<>(new SortByProductId());

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter Product Id: " + (i+1));
                int productId = sc.nextInt();

                System.out.println("Enter Product name: " + (i+1));
                String productName = sc.next();

                System.out.println("Enter Product price: " + (i+1));
                double productPrice = sc.nextInt();

                ts.add(new ProductBean(productId, productName, productPrice));
            }
        }

        for (ProductBean pb:ts) {
            System.out.println(pb);
        }
    }
}
