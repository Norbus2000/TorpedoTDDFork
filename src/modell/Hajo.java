package modell;

public class Hajo {

    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }

    public String talalat(int poz) {
        //eldöntés tétele
        int i = 0;
        while (i < 3 && !(pozicio[i] == poz)) {
            i++;
        }

        return i < 3 ? "talált" : "mellé";
    }

    public int[] getPozicio() {
        return pozicio;
    }

    public boolean isElsullyedt() {
        boolean talalt = false;
        for (int i = 0; i < pozicio.length; i++) {
            if (talalat(i).equals("talált")) {
                talalt= true;
            } 
        }
        return false;

    }
}
