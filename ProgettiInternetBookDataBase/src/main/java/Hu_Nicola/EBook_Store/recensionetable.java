package Hu_Nicola.EBook_Store;

import jakarta.persistence.*;

@Entity
@Table(name = "recensione")
public class recensionetable {
	@Id
    @Column(name = "codice")
    private int codicerecensione;

    @Column(name = "idutente")
    private String idutenterecensione;

    @Column(name = "testorecensione")
    private String testorecensionerecensione;

    public recensionetable (int numero, String utente,String recensione   ){
        this.codicerecensione=numero;
        this.idutenterecensione=utente;
        this.testorecensionerecensione=recensione;
    }
    

    public void setcodicerecensione(int codicerecensione) {
        this.codicerecensione = codicerecensione;
    }
    public int getcodicerecensione() {
        return codicerecensione;
    }
    

    public void setidutenterecensione(String idutenterecensione) {
        this.idutenterecensione = idutenterecensione;
    }
    public String getidutenterecensione() {
        return idutenterecensione;
    }

    
    public void settestorecensionerecensione(String testorecensionerecensione) {
        this.testorecensionerecensione = testorecensionerecensione;
    }
    public String gettestorecensionerecensione() {
        return testorecensionerecensione;
    }


}