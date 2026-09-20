package py.edu.bovino.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MovimientoLoteRequest {

    private LocalDate fechaMovimiento;
    private String razonMovimiento;
    private Long idAnimal;
    private Long idLote;

}
