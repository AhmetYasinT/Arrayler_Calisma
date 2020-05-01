
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<>();
    
    public void sarkicilari_bastir(){
        
        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + " adet şarkıcı var ");
        
        for(int i = 0; i < sarkici_listesi.size(); i++){
            System.out.println((i+1) + ". Şarkıcı : " + sarkici_listesi.get(i));
        }
    }
    
    public void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);
        
        System.out.println("Yeni Şarkıcı Listeye Eklendi..");
    
    }
    
    public void sarkici_guncelle(String yeni_sarkici, int pozisyon){
        sarkici_listesi.set(pozisyon, yeni_sarkici);
        
        System.out.println("Şarkıcı Listesi Güncellendi");
    }
    
    public void sarkici_sil(int pozisyon){
        
        String isim = sarkici_listesi.get(pozisyon);
        
        sarkici_listesi.remove(pozisyon);   
        
        System.out.println(isim + " isimli şarkıcı Listeden çıkarıldı..");
        
    }
    
    public void sarkici_ara(String sarkici_isim){
        int pozisyon = sarkici_listesi.indexOf(sarkici_isim);
        
        if (pozisyon >=  0) {
            System.out.println("Şarkıcı Bulundu..");
            System.out.println(sarkici_isim + " şarkıcı " + (pozisyon+1) + ". pozisyonda");
        }
        else{
            System.out.println("Aradığınız şarkıcı listeden bulunmamaktadır.");
        }
        
    }
}
