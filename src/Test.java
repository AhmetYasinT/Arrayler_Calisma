
import java.util.Scanner;

public class Test {
    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }
    
    public static void sarkici_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    
    public static void sarkici_ekle(){
        System.out.print("Eklemek İstediğiniz Şarkıcının Adı: " );
        String ad = scanner.nextLine();
        
        sarkicilar.sarkici_ekle(ad);
    }
    
    public static void sarkici_guncelle(){
        System.out.println("Güncellemek İstediğiniz Şarkıcının Pozisyonu(1,2,3) : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_ad = scanner.nextLine();
        
        sarkicilar.sarkici_guncelle(yeni_ad, pozisyon-1);
    }
    
    public static void sarkici_sil(){
        System.out.print("Silmek İstediğiniz Şarkıcının Pozisyonu(1,2,3) : ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    
    public static void sarkici_ara(){
        System.out.print("Aradığınız Şarkıcının Adı : ");
        String aranan_sarkici=scanner.nextLine();
        
        sarkicilar.sarkici_ara(aranan_sarkici);
    }
    
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz..");
        
        islemleri_bastir();
        
        boolean cikis = false;
        int islem;
        
        while (!cikis) {            
            System.out.print("Bir işlem seçiniz : ");
            
            islem = scanner.nextInt();
            scanner.nextLine(); // dummy
            
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                
                case 1:
                    sarkici_goruntule();
                    break;
                    
                case 2:
                    sarkici_ekle();
                    break;
                 
                case 3:
                    sarkici_guncelle();
                    break;
                    
                case 4:
                    sarkici_sil();
                    break;
                    
                case 5:
                    sarkici_ara();
                    break;
                    
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan çıkılıyor..");
                    break;
                    
            }
            
            
            
            
            

        }
        
    }
}
