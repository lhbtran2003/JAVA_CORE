package ra.run;

import ra.businessImp.Product;
import ra.validate.IdValidator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ProductManager {
    public static final Product[] products = new Product[100];
    public static int size;

    static {
        products[0] = new Product();
        products[0].setProductId(1);
        products[0].setProductName("bánh");
        products[0].setDescription("ngon lắm");
        products[0].setProductSatus(false);
        products[0].setImportPrice(5.2f);
        products[0].setExportPrice(10f);
        products[0].setInterest(products[0].getExportPrice() - products[0].getImportPrice());
        size++;
    }

    private static void showMenu() {
        System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU****************");
        System.out.println("1. Nhập số sản phẩm và nhập thông tin sản phẩm");
        System.out.println("2. Hiển thị thông tin các sản phẩm");
        System.out.println("3. Sắp xếp sản phẩm theo lợi nhuận tăng dần");
        System.out.println("4. Xóa sản phẩm theo mã sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm");
        System.out.println("6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm");
        System.out.println("7. Thoát");
    }

    // nhập số lượng và thông tin sản phẩm
    public static void addProduct(Scanner sc) {
        System.out.print("Nhập số lượng sản pham muốn thêm");
        int quantity = Integer.parseInt(sc.nextLine());
        if (quantity + size <= products.length) {
            for (int i = 0; i < quantity; i++) {
                Product product = new Product();
                System.out.printf("Nhập thông tin cho sản phẩm thứ %d\n", i + 1);
                product.inputData();
                products[size++] = product;
            }
            return;
        }
        System.out.println("Số lượng muốn them vượt quá kích thước cho phép!");
    }

    // hiển thị thông tin sản phẩm
    public static void showInforProduct() {
        for (int i = 0; i < size; i++) {
            System.out.printf("Thông tin sản phẩm thứ %d\n", i + 1);
            products[i].displayData();
        }
    }

    // xóa sản phẩm theo mã
    public static void deleteProductById(Scanner sc) {
        System.out.print("Nhập mã spham cần xóa: ");
        int productId = Integer.parseInt(sc.nextLine());
        int index = findProductIndexById(productId);
        // tiến hành xóa và dịch chuyển các phần tử phía sau phần tử đãxoasa lên 1 đơn vị
        for (int i = index; i < size - 1 ; i++) {
            products[i] = products[i+1];
        }
        size--;
        System.out.println("Đã xóa sản phẩm có id = " + productId);
    }
    
    // tìm kiếm sản phẩm theo tên sản phẩm
    public static void searchProductByName(Scanner sc) {
        if (size == 0) {
            System.out.println("Danh sách sản phẩm troongs");
        }
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String searchName = sc.nextLine();
        for (int i = 0; i < size; i++) {
            if (products[i].getProductName().equalsIgnoreCase(searchName)) {
                products[i].displayData();
                return;
            }
        }
    }

    // sắp xếp sản phẩm theo lợi nhuận tăng dần
    public static void orderProductByInsert () {
        float[] list = extractInsertsFromObjs();
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < size; i++) {
            for(Product p : products) {
                if (p != null && p.getInterest() == list[i]) {
                    p.displayData();
                    break;
                }
            }
            System.out.println();
        }
    }

    public static float [] extractInsertsFromObjs () {
        float[] list = new float[size];
        for (int i = 0; i < size; i++) {
            list[i] = products[i].getInterest();
        }
        return list;
    }
    
    // thay đổi trạng thái sản phẩm theo mã sản phẩm
    public static void changeStatusProductById(Scanner sc) {
        if (size == 0) {
            System.out.println("Danh sách sản phẩm troongs");
            return;
        }
        System.out.print("Nhập mã spham cần thay đổi trạng thái: ");
        int productId = Integer.parseInt(sc.nextLine());
        int index = findProductIndexById(productId);

        if (index != -1) {
            System.out.println("Ko tìm thấy sản phẩm với mã: "+productId);
            return;
        }

        products[index].setProductSatus(!products[index].getProductSatus());

    }

    //ktra id muon xóa có tồn tại ko
    private static int findProductIndexById(int productId) {
        for (int i = 0; i < size; i++) {
            if (products[i].getProductId() == productId) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Chọn chức năng (1-7): ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    showInforProduct();
                    break;
                case 3:
                    orderProductByInsert();
                    break;
                case 4:
                    deleteProductById(sc);
                    break;
                case 5:
                    searchProductByName(sc);
                    break;
                case 6:
                    changeStatusProductById(sc);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
            }
        }

    }

}
