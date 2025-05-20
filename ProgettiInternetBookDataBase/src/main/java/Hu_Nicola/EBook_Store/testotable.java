// https://www.baeldung.com/spring-data-jpa-custom-naming
package Hu_Nicola.EBook_Store;

import jakarta.persistence.*;

@Entity
@Table(name = "testo")
public class testotable {
    
    @Id
    @Column(name = "id")
    private int idtesto;

    @Column(name = "titolo")
    private String titolotesto;

    @Column(name = "genere")
    private String generetesto;

    @Column(name = "datauscita")
    private String datauscitatesto;

    @Column(name = "idautore")
    private int idautoretesto;

    @Column(name = "idrecensione")
    private int idrecensionetesto;

    @Column(name = "pathimmagine")
    private String path;

    // Getter e Setter

    public int getIdtesto() {
        return idtesto;
    }

    public void setIdtesto(int idtesto) {
        this.idtesto = idtesto;
    }

    public String getTitolotesto() {
        return titolotesto;
    }

    public void setTitolotesto(String titolotesto) {
        this.titolotesto = titolotesto;
    }

    public String getGeneretesto() {
        return generetesto;
    }

    public void setGeneretesto(String generetesto) {
        this.generetesto = generetesto;
    }

    public String getDatauscitatesto() {
        return datauscitatesto;
    }

    public void setDatauscitatesto(String datauscitatesto) {
        this.datauscitatesto = datauscitatesto;
    }

    public int getIdautoretesto() {
        return idautoretesto;
    }

    public void setIdautoretesto(int idautoretesto) {
        this.idautoretesto = idautoretesto;
    }

    public int getIdrecensionetesto() {
        return idrecensionetesto;
    }

    public void setIdrecensionetesto(int idrecensionetesto) {
        this.idrecensionetesto = idrecensionetesto;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String toString() {
        return "testotable{" +
               "idtesto=" + idtesto +
               ", titolotesto='" + titolotesto + '\'' +
               ", generetesto='" + generetesto + '\'' +
               ", datauscitatesto='" + datauscitatesto + '\'' +
               ", idautoretesto=" + idautoretesto +
               ", idrecensionetesto=" + idrecensionetesto +
               ", path='" + path + '\'' +
               '}';
    }

}
