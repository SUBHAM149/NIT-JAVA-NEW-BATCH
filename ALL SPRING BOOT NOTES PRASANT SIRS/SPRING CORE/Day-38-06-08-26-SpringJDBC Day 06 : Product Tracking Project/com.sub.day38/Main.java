package com.sub.day38;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("Container started...");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        OperationConfig.class
                );

        OperationDao bean =
                context.getBean(
                        "operation",
                        OperationDao.class
                );

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {

            System.out.println();
            System.out.println("======================================");
            System.out.println("        PRODUCT TRACKING SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Get Product Price");
            System.out.println("2. Get All Product Details");
            System.out.println("3. Add New Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Find and Count Product by Name");
            System.out.println("7. Group Products by Shipping Address");
            System.out.println("8. Exit");

            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            // =================================================
            // CASE 1 - GET PRODUCT PRICE
            // =================================================

            case 1:

                System.out.print(
                        "Enter the product name: "
                );

                String priceProductName =
                        sc.nextLine();

                Float productPrice =
                        bean.getProductPrice(
                                priceProductName
                        );

                if (productPrice != null) {

                    System.out.println(
                            "Price of "
                            + priceProductName
                            + " is Rs. "
                            + productPrice
                    );

                } else {

                    System.out.println(
                            "No product found with name: "
                            + priceProductName
                    );
                }

                break;

            // =================================================
            // CASE 2 - GET ALL PRODUCTS
            // =================================================

            case 2:

                List<ProductDelivery> allProducts =
                        bean.getAllProduct();

                if (allProducts.isEmpty()) {

                    System.out.println(
                            "No products available."
                    );

                } else {

                    System.out.println();
                    System.out.println(
                            "---------- ALL PRODUCTS ----------"
                    );

                    allProducts.forEach(
                            System.out::println
                    );
                }

                break;

            // =================================================
            // CASE 3 - INSERT PRODUCT
            // =================================================

            case 3:

                System.out.print(
                        "Enter product name: "
                );

                String productName =
                        sc.nextLine();

                System.out.print(
                        "Enter shipping address: "
                );

                String shippingAddress =
                        sc.nextLine();

                System.out.print(
                        "Enter product price: "
                );

                float price =
                        sc.nextFloat();

                System.out.print(
                        "Enter product quantity: "
                );

                int quantity =
                        sc.nextInt();

                sc.nextLine();

                System.out.print(
                        "Enter placing date "
                        + "(dd-MM-yyyy): "
                );

                String dateInput =
                        sc.nextLine();

                LocalDate localDate =
                        LocalDate.parse(
                                dateInput,
                                formatter
                        );

                Date sqlDate =
                        Date.valueOf(localDate);

                ProductDelivery product =
                        new ProductDelivery();

                product.setProductName(
                        productName
                );

                product.setProductShippingAddress(
                        shippingAddress
                );

                product.setProductPrice(
                        price
                );

                product.setProductQuantity(
                        quantity
                );

                product.setProductPlaceDate(
                        sqlDate
                );

                int insertResult =
                        bean.insertProduct(
                                product
                        );

                if (insertResult > 0) {

                    System.out.println(
                            "Product inserted successfully!"
                    );

                } else {

                    System.out.println(
                            "Product insertion failed."
                    );
                }

                break;

            // =================================================
            // CASE 4 - DELETE PRODUCT
            // =================================================

            case 4:

                System.out.print(
                        "Enter product name to delete: "
                );

                String deleteName =
                        sc.nextLine();

                int deleteResult =
                        bean.deleteProduct(
                                deleteName
                        );

                if (deleteResult > 0) {

                    System.out.println(
                            "Product deleted successfully!"
                    );

                } else {

                    System.out.println(
                            "Product not found."
                    );
                }

                break;

            // =================================================
            // CASE 5 - UPDATE PRODUCT
            // =================================================

            case 5:

                System.out.print(
                        "Enter product name to update: "
                );

                String updateName =
                        sc.nextLine();

                System.out.print(
                        "Enter new shipping address: "
                );

                String newAddress =
                        sc.nextLine();

                System.out.print(
                        "Enter new date "
                        + "(dd-MM-yyyy): "
                );

                String newDateInput =
                        sc.nextLine();

                LocalDate newLocalDate =
                        LocalDate.parse(
                                newDateInput,
                                formatter
                        );

                Date newSqlDate =
                        Date.valueOf(
                                newLocalDate
                        );

                int updateResult =
                        bean.updateProduct(
                                newAddress,
                                newSqlDate,
                                updateName
                        );

                if (updateResult > 0) {

                    System.out.println(
                            "Product updated successfully!"
                    );

                } else {

                    System.out.println(
                            "Product not found."
                    );
                }

                break;

            // =================================================
            // CASE 6 - FIND AND COUNT BY NAME
            // =================================================

            case 6:

                System.out.print("Enter product name: ");

                String findName = sc.nextLine();

                List<ProductDelivery> products =
                        bean.getAllProduct();

                long count = products.stream()
                        .filter(p ->
                                p.getProductName()
                                        .equalsIgnoreCase(findName))
                        .count();

                System.out.println(
                        "Product name: "
                        + findName
                        + " | Count: "
                        + count
                );

                break;

            // =================================================
            // CASE 7 - GROUP BY SHIPPING ADDRESS
            // =================================================

            case 7:

                List<ProductDelivery> productList =
                        bean.getAllProduct();

                if (productList.isEmpty()) {

                    System.out.println(
                            "No products available."
                    );

                } else {

                    Map<String,
                            List<ProductDelivery>>
                            groupedProducts =
                            productList.stream()
                                    .collect(
                                            Collectors.groupingBy(
                                                    ProductDelivery::
                                                    getProductShippingAddress
                                            )
                                    );

                    System.out.println();
                    System.out.println(
                            "----- PRODUCTS BY ADDRESS -----"
                    );

                    groupedProducts.forEach(
                            (address,
                             productsByAddress) -> {

                                System.out.println();
                                System.out.println(
                                        "Address: "
                                        + address
                                );

                                productsByAddress.forEach(
                                        System.out::println
                                );
                            }
                    );
                }

                break;

            // =================================================
            // CASE 8 - EXIT
            // =================================================

            case 8:

                System.out.println(
                        "Thank you for using "
                        + "Product Tracking System!"
                );

                sc.close();
                context.close();

                return;

            // =================================================
            // INVALID CHOICE
            // =================================================

            default:

                System.out.println(
                        "Invalid choice!"
                );

                System.out.println(
                        "Please enter a number "
                        + "between 1 and 8."
                );
            }
        }
    }
}
