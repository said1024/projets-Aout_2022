package said.banque.banque_v2.enties;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)
public class Operation {
    public Operation(Date dateOperation, double moutant) {
        this.dateOperation = dateOperation;
        this.moutant = moutant;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numeroOperation;
    private Date dateOperation;
    private double moutant;
    @ManyToOne
    @JoinColumn(name = "CODE_CMPT")
    private Compte compte;
    @ManyToOne
    @JoinColumn(name = "CODE_EMPL")
    private Employe employe;

}
