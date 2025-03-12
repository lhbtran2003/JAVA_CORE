
public class Bai4 {
    public static void main(String[] args) {
        String [] fullname = {
                "Nguyen Van An",
                "Tran Thi Bich",
                "Le Hoang Nam",
                "Pham Minh Duc",
                "Hoang Lan Chi",
                "Do Thuy Duong",
                "Bui Thanh Tung",
                "Vu Hai Yen"
        };
        int [] age = {20,22,19,25,21,23,24,26};
        String [] country = {
                "Vietnam",
                "Nhat Ban",
                "Han Quoc",
                "My",
                "Anh",
                "Duc",
                "Phap",
                "Canada"
        };

        System.out.printf(" %-15s | %-5s | %-5s\n","Ho ten", "Tuoi", "Quoc gia");

        for(int i=0; i<fullname.length; i++) {
            System.out.printf("%-15s | %-5d | %-5s \n",fullname[i], age[i],country[i]);
        }


    }
}
