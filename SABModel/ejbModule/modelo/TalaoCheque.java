package modelo;

import javax.persistence.*;


@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TalaoCheque extends Produto {
/*comentario*/
}
