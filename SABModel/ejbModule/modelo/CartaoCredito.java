package modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CartaoCredito extends Produto {
	@NotNull
	public String limiteCredito;
	@NotNull
	public String limiteSaque;
	@NotNull
	public String numero;
}
