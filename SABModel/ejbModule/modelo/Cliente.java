package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cliente implements Serializable {

	private static final long serialVersionUID = 8033528519516560755L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Embedded
	private Endereco endereco;

		
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}
}
