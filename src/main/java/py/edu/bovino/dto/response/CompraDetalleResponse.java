package py.edu.bovino.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class CompraDetalleResponse {

    private Long id;
    private Double pesoEntrada;
    private BigDecimal precioUnitario;
    private String numeroCaravana;
    private Long idCompra;

}
