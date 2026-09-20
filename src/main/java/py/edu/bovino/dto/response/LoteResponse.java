package py.edu.bovino.dto.response;

import lombok.Data;

@Data
public class LoteResponse {

    private Long id;
    private String nombreLote;
    private Integer capacidadLote;
    private String tipoLote;

}
