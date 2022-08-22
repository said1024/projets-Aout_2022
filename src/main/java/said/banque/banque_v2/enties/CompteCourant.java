package said.banque.banque_v2.enties;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("CC")
@NoArgsConstructor
@Getter
@Setter
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(String codeCompte, Date dateCreation, double solde, double decouvert) {
        super(codeCompte, dateCreation, solde);
        this.decouvert = decouvert;
    }

    public CompteCourant(double decouvert) {
        this.decouvert = decouvert;
    }


}
