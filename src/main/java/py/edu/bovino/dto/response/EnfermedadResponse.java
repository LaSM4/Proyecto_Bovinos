package py.edu.bovino.dto.response;

import lombok.Data;

@Data
public class EnfermedadResponse {

    private Long id;
    private String nombreEnfermedad;
    private String sintomasEnfermedad;

}
