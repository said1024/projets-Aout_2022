package said.banque.banque_v2.enties;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Groupee {
    private String nomGroup;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeGroup;
    @ManyToMany(mappedBy = "groupes")
    private Collection <Employe> employe;
    public Groupee(String nomGroup) {
        this.nomGroup = nomGroup;
    }


}
