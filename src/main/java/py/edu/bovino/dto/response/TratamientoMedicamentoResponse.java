package py.edu.bovino.dto.response;

import lombok.Data;

@Data
public class TratamientoMedicamentoResponse {

    private Long id;
    private String dosis;
    private String frecuencia;
    private Integer duracionDias;
    private String nombreMedicamento;
    private Long idTratamiento;

}
