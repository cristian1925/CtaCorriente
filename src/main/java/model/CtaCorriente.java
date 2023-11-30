package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CtaCorriente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuenta;
    private Double monto;
    private String ejecutivo;

    @ManyToOne
    private Persona rutCliente;

  
    public CtaCorriente() {
    }

  
    public CtaCorriente(Long idCuenta, Double monto, String ejecutivo, Persona rutCliente) {
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.ejecutivo = ejecutivo;
        this.rutCliente = rutCliente;
    }

   
    public Long getIdCuenta() {
        return idCuenta;
    }

    public Double getMonto() {
        return monto;
    }

    public String getEjecutivo() {
        return ejecutivo;
    }

    public Persona getRutCliente() {
        return rutCliente;
    }


    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setEjecutivo(String ejecutivo) {
        this.ejecutivo = ejecutivo;
    }

    public void setRutCliente(Persona rutCliente) {
        this.rutCliente = rutCliente;
    }

  
    @Override
    public String toString() {
        return "CtaCorriente{" +
               "idCuenta=" + idCuenta +
               ", monto=" + monto +
               ", ejecutivo='" + ejecutivo + '\'' +
               ", rutCliente=" + (rutCliente != null ? rutCliente.getRut() : "null") +
               '}';
    }
}
