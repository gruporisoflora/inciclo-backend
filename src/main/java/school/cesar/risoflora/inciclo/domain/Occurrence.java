package school.cesar.risoflora.inciclo.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="occurrences")
public class Occurrence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="occurrence_id")
    private Long id;

    private String alimentador;

    private String inspectorComment;

    private OccurrenceSegment segment;

    private OccurrenceType type;

    private String usuario;

    private Date executionDate;

    @OneToOne
    @JoinColumn(name = "post_id")
    private Post occurrence_id;

    private enum OccurrenceType{
        VEGETACAO
    }

    private enum OccurrenceSegment{
        URBANO,
        RURAL,
        TRONCO
    }

}
