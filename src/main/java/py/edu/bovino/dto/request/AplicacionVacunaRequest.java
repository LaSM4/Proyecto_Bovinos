package py.edu.bovino.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AplicacionVacunaRequest {

    private LocalDate fechaAplicacion;
    private Long idAnimal;
    private Long idVacuna;

}
