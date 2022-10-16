package co.backend.servidor.dto;

import javax.persistence.*;


@Entity
@Table(name="ruta")
public class rutaDTO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String namecom;
    private Integer numruta;
    private String iduser;
    private String description;

    public rutaDTO(Integer id, String namecom, Integer numruta, String iduser, String description) {
        this.id = id;
        this.namecom = namecom;
        this.numruta = numruta;
        this.iduser = iduser;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamecom() {
        return namecom;
    }

    public void setNamecom(String namecom) {
        this.namecom = namecom;
    }

    public Integer getNumruta() {
        return numruta;
    }

    public void setNumruta(Integer numruta) {
        this.numruta = numruta;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public rutaDTO() {
    }




}
