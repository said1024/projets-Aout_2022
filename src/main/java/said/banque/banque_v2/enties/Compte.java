package said.banque.banque_v2.enties;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CMPTE",discriminatorType=DiscriminatorType.STRING,length=2)
public class Compte {
    @Id
    private String codeCompte;
    private Date dateCreation;

    public Compte(String codeCompte, Date dateCreation, double solde) {
        this.codeCompte = codeCompte;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    private double solde;
    @ManyToOne
    @JoinColumn(name="CODE_CLNT")
    private Client client;
    @ManyToOne
    @JoinColumn(name="CODE_EMPL")
    private Employe employe;
    @OneToMany(mappedBy="compte")
    private Collection<Operation> operation;
    


}
