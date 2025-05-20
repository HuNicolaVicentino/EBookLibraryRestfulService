package Hu_Nicola.EBook_Store;

public class FormatoLibreriaTesto {

    private int[] idlibri = new int[10];
    private String[] linklibri = new String[10];

    public FormatoLibreriaTesto(testotable[] listaTesti, int n) {
        for (int i = 0; i != n; i++) {
            System.out.println("HO fatto il trasferimento di un elemento");
            idlibri[i] = listaTesti[i].getIdtesto();
            linklibri[i] = listaTesti[i].getPath();
        }
    }

    public int[] getIdlibri() {
        return idlibri;
    }

    public String[] getLinklibri() {
        return linklibri;
    }
}
