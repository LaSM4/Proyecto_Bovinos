package py.edu.bovino.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class TratamientoRequest {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcionTratamiento;
    private Long idAnimal;
    private Long idEnfermedad;

}
