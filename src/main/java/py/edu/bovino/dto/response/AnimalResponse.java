package py.edu.bovino.dto.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AnimalResponse {

    private Long id;
    private String numeroCaravana;
    private LocalDate fechaNacimiento;
    private String sexo;
    private String nombreRaza;
    private String estado;
    private String tipoAnimal;

}
