package modelo;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Produto {
	private static final long serialVersionUID = 8033528519516560755L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public Status status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public enum Status {
		ATIVO, INATIVO
	}
}