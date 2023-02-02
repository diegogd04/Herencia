package com.dgd.herencia;

public class Operario extends Persona{
    private String especializacion;
    private Integer ageNacimiento;

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public Integer getAgeNacimiento() {
        return ageNacimiento;
    }

    public void setAgeNacimiento(Integer ageNacimiento) {
        this.ageNacimiento = ageNacimiento;
    }
}
