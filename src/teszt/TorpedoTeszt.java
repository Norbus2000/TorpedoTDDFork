package teszt;

import modell.Hajo;

public class TorpedoTeszt {
    
    private Hajo hajo;

    public TorpedoTeszt() {
         hajo = new Hajo(new int[]{2,3,4}); 
         
         
         tesztLovesTalalt(4);
         tesztLovesNemTalalt(5);
         tesztLovesSullyedt(4);
    }
    
    public static void main(String[] args) {
        System.out.println("Teszt");
        
        new TorpedoTeszt();
    }
    
    public String tesztLovesTalalt(int poz){
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        return "";
    }
    
    public String tesztLovesNemTalalt(int poz){
        String t = hajo.talalat(poz);
        assert t.equals("mellé") : "nem jó a találat ellenőrzése";
        return "";
    }
        
    public String tesztLovesSullyedt(int poz){
        String t = hajo.talalat(poz);
        
        hajo.talalat(2);
        hajo.talalat(3);
        hajo.talalat(4);
        
        boolean s = hajo.isElsullyedt();
        
        assert s == false  : "nem jó a süllyedt ellenőrzése";
        return "";
    }
}
