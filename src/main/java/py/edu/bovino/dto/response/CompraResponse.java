package py.edu.bovino.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class CompraResponse {

    private Long id;
    private LocalDate fechaCompra;
    private BigDecimal montoTotal;
    private Integer cantidadBovinos;
    private String razonSocial;

}
