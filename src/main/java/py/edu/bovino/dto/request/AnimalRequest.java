package py.edu.bovino.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AnimalRequest {

    private String numeroCaravana;
    private LocalDate fechaNacimiento;
    private String sexo;
    private Long idRaza;
    private Long idCategoria;

}
