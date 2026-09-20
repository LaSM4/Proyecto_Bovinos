package py.edu.bovino.dto.response;

import lombok.Data;

@Data
public class TerceroResponse {

    private Long id;
    private String ruc;
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String mail;
    private String nombrePersonaContacto;
    private String apellidoPersonaContacto;
    private String cargoPersonaContacto;
    private String banco;
    private String numeroCuentaBancaria;
    private String tipoCuenta;
    private String condicionPago;
    private Integer diasCredito;
    private Boolean esProveedor;
    private Boolean esCliente;

}
