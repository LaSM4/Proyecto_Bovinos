package py.edu.bovino.dto.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MovimientoLoteResponse {

    private Long id;
    private LocalDate fechaMovimiento;
    private String razonMovimiento;
    private String numeroCaravana;
    private String nombreLote;

}
