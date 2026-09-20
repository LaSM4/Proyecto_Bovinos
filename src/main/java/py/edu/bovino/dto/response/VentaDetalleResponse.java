package py.edu.bovino.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class VentaDetalleResponse {

    private Long id;
    private Double pesoSalida;
    private BigDecimal precioUnitario;
    private String numeroCaravana;
    private Long idVenta;

}
