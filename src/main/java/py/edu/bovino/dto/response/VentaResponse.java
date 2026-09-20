package py.edu.bovino.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class VentaResponse {

    private Long id;
    private LocalDate fechaVenta;
    private BigDecimal totalVenta;
    private String razonSocial;

}
