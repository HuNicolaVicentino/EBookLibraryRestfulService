package Hu_Nicola.EBook_Store;

import jakarta.persistence.*;

@Entity
@Table(name = "autore")
public class autoretable {
	@Id
    @Column(name = "id")
    private int idautore;

    @Column(name = "nome")
    private String nomeautore;

    @Column(name = "cognome")
    private String cognomeautore;

    public void setIdautore(int idautore) {
        this.idautore = idautore;
    }

    public String getNomeautore() {
        return nomeautore;
    }

    public void setNomeautore(String nomeautore) {
        this.nomeautore = nomeautore;
    }

    public String getCognomeautore() {
        return cognomeautore;
    }

    public void setCognomeautore(String cognomeautore) {
        this.cognomeautore = cognomeautore;
    }


}