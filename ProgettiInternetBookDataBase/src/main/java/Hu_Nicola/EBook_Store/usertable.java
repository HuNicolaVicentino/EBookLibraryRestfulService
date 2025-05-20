package Hu_Nicola.EBook_Store;

import jakarta.persistence.*;

@Entity
@Table(name = "usertable")
public class usertable {
	@Id
    @Column(name = "userName")
    private String userName;

    @Column(name = "Password")
    private String password;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

   
    @Column(name = "email")
    private String email;

    @Column(name = "numeroTelefono")
    private long numeroTelefono;

    // Getter & Setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
