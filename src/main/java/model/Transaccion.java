package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double montoTransferencia;
    private String cuentaTransferencia;
    private String tipoCuenta;

    @ManyToOne
    private Persona rutCliente;

   
    public Transaccion() {
    }

  
    public Transaccion(Long id, Double montoTransferencia, String cuentaTransferencia, String tipoCuenta, Persona rutCliente) {
        this.id = id;
        this.montoTransferencia = montoTransferencia;
        this.cuentaTransferencia = cuentaTransferencia;
        this.tipoCuenta = tipoCuenta;
        this.rutCliente = rutCliente;
    }

    
    public Long getId() {
        return id;
    }

    public Double getMontoTransferencia() {
        return montoTransferencia;
    }

    public String getCuentaTransferencia() {
        return cuentaTransferencia;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public Persona getRutCliente() {
        return rutCliente;
    }

   
    public void setId(Long id) {
        this.id = id;
    }

    public void setMontoTransferencia(Double montoTransferencia) {
        this.montoTransferencia = montoTransferencia;
    }

    public void setCuentaTransferencia(String cuentaTransferencia) {
        this.cuentaTransferencia = cuentaTransferencia;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setRutCliente(Persona rutCliente) {
        this.rutCliente = rutCliente;
    }

 
    @Override
    public String toString() {
        return "Transaccion{" +
               "id=" + id +
               ", montoTransferencia=" + montoTransferencia +
               ", cuentaTransferencia='" + cuentaTransferencia + '\'' +
               ", tipoCuenta='" + tipoCuenta + '\'' +
               ", rutCliente=" + (rutCliente != null ? rutCliente.getRut() : "null") +
               '}';
    }
}
