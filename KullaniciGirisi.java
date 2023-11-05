import java.util.Scanner;

//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
// unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi, kullaniciSifre, yeniSifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Sifrenizi Giriniz:");
        kullaniciSifre = input.nextLine();

        if(kullaniciAdi.equals("patika") && kullaniciSifre.equals("java123") ) {
            System.out.println("Giriş başarılı.");
        }else{
                if(!kullaniciAdi.equals("patika")) {
                    System.out.println("Kullanıcı adınız yanlıs.");
                }else if(!kullaniciSifre.equals("java123")){
                    System.out.println("Sifreniz yanlış, şifrenizi sıfırlayınız.");
                        System.out.println("Yeni şifrenizi giriniz:");
                        yeniSifre = input.nextLine();
                        if(yeniSifre.equals("java123")){
                            System.out.println("Sifre oluşturulamadı, lütfen başka şifre giriniz.");
                               
                        }
                            else{
                                System.out.println("Sifre oluşturuldu.");

                            }
                        }

                }



        }










    }


