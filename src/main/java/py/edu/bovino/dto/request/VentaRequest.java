package py.edu.bovino.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class VentaRequest {

    private LocalDate fechaVenta;
    private BigDecimal totalVenta;
    private Long idTercero;

}
