package py.edu.bovino.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class CompraRequest {

    private LocalDate fechaCompra;
    private BigDecimal montoTotal;
    private Integer cantidadBovinos;
    private Long idTercero;

}
