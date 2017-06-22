import javax.print.DocFlavor;

/**
 * Created by djawed on 22/06/17.
 */
abstract class animal {
    protected String couleur;
    protected int poid;

    protected void manger() {
        System.out.print("je suis");
    }

    protected void boire() {
        System.out.print("je bois de leau  ");
    }

    abstract void deplacement();

    abstract void crier();

    public String toString() {
        String str = "je suis un objet de la " + this.getClass() + "je suis " + this.couleur + "je pése" + this.poid;
        return str;
    }
}
