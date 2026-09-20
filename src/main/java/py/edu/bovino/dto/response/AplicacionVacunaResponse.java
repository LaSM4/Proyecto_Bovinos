package py.edu.bovino.dto.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AplicacionVacunaResponse {

    private Long id;
    private LocalDate fechaAplicacion;
    private String numeroCaravana;
    private String nombreVacuna;

}
