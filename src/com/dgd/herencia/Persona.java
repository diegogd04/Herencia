package com.dgd.herencia;

public class Persona {
    private Integer id;
    private String nif;
    private String nombre;
    private String revision;
    private String herramienta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    protected String getHerramienta() {
        return herramienta;
    }

    protected void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }
}
