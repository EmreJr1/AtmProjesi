import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        //değişken tanımlama
        String userName,password;
        Scanner input=new Scanner(System.in);
        int price;
        int right=3;
        int balance= 1500;
        int select;

        while (right>0){
            System.out.print("Kullanıcı adınızı giriniz :");
            userName=input.nextLine();
            System.out.print("Parolanız :");
            password=input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                while (true) {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    input.nextLine(); // Boş satırı oku


                    switch (select){

                        case 1 :
                             System.out.print("Para miktarı :");
                             price=input.nextInt();
                             balance+=price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                           break;

                        case 2 :
                             System.out.print("Para miktarı :");
                             price=input.nextInt();


                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersiz");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz :"+balance);
                           break;

                        case 4 :
                            System.out.println("Tekrar görüşmek üzere");
                            System.exit(0); // Programdan çıkış yap
                            break;

                        default :
                            System.out.println("Lütfen geçerli bir işlem seçiniz");
                    }
                }



            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız ="+right);
                }




            }

        }
    }
}
