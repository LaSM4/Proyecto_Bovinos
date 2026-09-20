package py.edu.bovino.dto.request;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CompraDetalleRequest {

    private Double pesoEntrada;
    private BigDecimal precioUnitario;
    private Long idCompra;
    private Long idAnimal;

}
