public class Bai8 {
    public static void main(String[] args) {
      String[] arr = {
              "0987-654-321",
              "0123.456.789",
              "+84987654321",
              "1234567"
      };
      for (String phone: arr){
          checkPhone(phone);
      }
    }

    public static void checkPhone (String phone){
        // kiểm tra tính hơợp lệ của số đt
        // có đúng 10 chữ số

        // Xóa các dấu phân tách (-, .)
        phone = phone.replaceAll("[-.]", "");

        String regex = "^(0\\d{9}|\\+84\\d{9})$";


        if(phone.matches(regex)){
            // chuẩn hóa số điện thoại
            if (phone.startsWith("0")){
               phone = "+84" + phone.substring(1);
                phone = phone.replaceAll("(\\+84)(\\d{3})(\\d{3})(\\d{3})", "$1 $2 $3 $4");
                System.out.printf("%s\n", phone);
            } else {
                System.out.println("Số dt ko hợp lệ");
            }
        }
    }
}
