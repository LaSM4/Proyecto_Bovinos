package py.edu.bovino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tercero")
@Data
public class Tercero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 25)
    private String ruc;

    @Column(nullable = false, unique = true, length = 50)
    private String razonSocial;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false, length = 25)
    private String telefono;

    @Column(length = 40, unique = true)
    private String mail;

    @Column(length = 50)
    private String nombrePersonaContacto;

    @Column(length = 50)
    private String apellidoPersonaContacto;

    @Column(length = 15)
    private String cargoPersonaContacto;

    @Column(nullable = false, length = 25)
    private String banco;

    @Column(length = 100)
    private String numeroCuentaBancaria;

    @Column(length = 25)
    private String tipoCuenta;

    public enum CondicionPago {
        CONTADO, CREDITO
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 25)
    private CondicionPago condicionPago;

    @Column
    private Integer diasCredito;

    @Column(nullable = false)
    private Boolean esProveedor;

    @Column(nullable = false)
    private Boolean esCliente;

}
