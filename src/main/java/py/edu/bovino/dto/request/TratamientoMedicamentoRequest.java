package py.edu.bovino.dto.request;

import lombok.Data;

@Data
public class TratamientoMedicamentoRequest {

    private String dosis;
    private String frecuencia;
    private Integer duracionDias;
    private Long idTratamiento;
    private Long idMedicamento;

}
