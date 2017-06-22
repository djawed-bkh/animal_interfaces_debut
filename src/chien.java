/**
 * Created by djawed on 22/06/17.
 */
public class chien extends canin {
    public chien(){
    /**constructeur**/
    }
    public chien(String couleur,int poid){
        this.couleur=couleur;
        this.poid=poid;

    }

    void crier(){
        System.out.println("J'aboie sans raison !");
    }
}
