package py.edu.bovino.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "animal")
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 25)
    private String numeroCaravana;

    @Column(nullable = false)
    private LocalDate fechaNacimiento;

    public enum Sexo {
        MACHO, HEMBRA
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Sexo sexo;

    public enum Estado {
        ACTIVO, VENDIDO, MUERTO, EN_TRATAMIENTO, CON_SINTOMAS, ENFERMO, FAENADO
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_raza", nullable = false)
    private Raza raza;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

}
