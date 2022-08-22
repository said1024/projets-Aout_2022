package said.banque.banque_v2.enties;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmploye;
    private String nomEmploye;

    public Employe(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    @ManyToOne
    @JoinColumn(name = "CODE_EMPYSUP")
    private Employe elpoyeSup;
    @ManyToMany(mappedBy = "EMPLGROUP")
    private Collection<Groupee> groupes;

}
