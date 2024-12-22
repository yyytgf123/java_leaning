package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : " );
        int count = sc.nextInt();
        sc.nextLine();

        ProductOrder[] productOrders = new ProductOrder[count];

        for(int i = 0; i < productOrders.length; i++) {
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");

            System.out.print("상품 명 : ");
            String productName = sc.nextLine();

            System.out.print("상품 가격 : ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("상품 갯 수 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }
        printOrders(productOrders);
        int all = getTotalAmount(productOrders);
        System.out.println("총 결제 금액 : " + all);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상픔명 : " + productOrders[i].productName + "," +
                    " 가격 : " + productOrders[i].price + "," +
                    " 수량 : " + productOrders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int all = 0;
        for(int i = 0; i < productOrders.length; i++) {
            all += productOrders[i].price * productOrders[i].quantity;
        }
        return all;
    }
}
