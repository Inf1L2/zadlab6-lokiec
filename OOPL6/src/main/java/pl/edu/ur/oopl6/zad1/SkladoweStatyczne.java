package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        System.out.println(Figury.PoleKwadratu(0.5));
        System.out.println(Figury.ObwodKwadratu(0.5, 0.5));
        System.out.println(Figury.PoleProstokata(0.5, 0.5));
        System.out.println(Figury.ObwodProstokata(0.5, 0.5));
        System.out.println(Figury.PoleStozka(0.5, 1));
        System.out.println(Figury.PoleWalca(0.5, 1));
    }
    
}
