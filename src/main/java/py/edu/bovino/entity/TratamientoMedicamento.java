package py.edu.bovino.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tratamiento_medicamento")
@Data
public class TratamientoMedicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String dosis;

    @Column(nullable = false, length = 45)
    private String frecuencia;

    @Column(nullable = false)
    private Integer duracionDias;

    @ManyToOne
    @JoinColumn(name = "id_tratamiento")
    private Tratamiento tratamiento;

    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    private Medicamento medicamento;

}
