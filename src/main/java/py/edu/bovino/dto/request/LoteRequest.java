package py.edu.bovino.dto.request;

import lombok.Data;

@Data
public class LoteRequest {

    private String nombreLote;
    private Integer capacidadLote;
    private Long idTipoLote;

}
