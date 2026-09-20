package py.edu.bovino.dto.request;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class VentaDetalleRequest {

    private Double pesoSalida;
    private BigDecimal precioUnitario;
    private Long idVenta;
    private Long idAnimal;

}
