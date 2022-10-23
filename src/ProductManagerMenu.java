import java.util.Scanner;

public class ProductManagerMenu {
    public void displayMenu() {
        System.out.println("======== Menu =======");
        System.out.println("1. Add new data");
        System.out.println("2. Update data");
        System.out.println("3. Delete data");
        System.out.println("4. Search by id");
        System.out.println("5. Sort decrease with price");
        System.out.println("6. Sort ascending with price");
        System.out.println("7. Display all");
        System.out.println("0. Exit");
    }

    public void menu() {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.println("choice number");
            int choose = scanner.nextInt();
            scanner.hasNextLine();

            switch (choose) {
                case 1:
                    productManager.add(scannerProduct(scanner));
                    break;
                case 2:
                    Product productUpdate = scannerProduct(scanner);
                    productManager.update(productUpdate.getId(), productUpdate);
                    break;
                case 3:
                    System.out.println("Input id wanna remove");
                    int idRemove = scanner.nextInt();
                    productManager.remove(idRemove);
                    break;
                case 4:
                    System.out.println("Input id wanna search");
                    int idSearch = scanner.nextInt();
                    System.out.println(productManager.searchById(idSearch));
                    break;
                case 5:
                    productManager.sortDecrease();
                    System.out.println(productManager);
                    break;
                case 6:
                    productManager.sortAscending();
                    System.out.println(productManager);
                    break;
                case 7:
                    System.out.println(productManager);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public static Product scannerProduct(Scanner scanner) {
        System.out.println("Input id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input name");
        String name = scanner.nextLine();


        System.out.println("Input price");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Product product = new Product(name, id, price);
        return product;
    }
}