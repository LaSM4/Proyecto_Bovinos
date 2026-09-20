package py.edu.bovino.dto.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TratamientoResponse {

    private Long id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcionTratamiento;
    private String numeroCaravana;
    private String nombreEnfermedad;

}
