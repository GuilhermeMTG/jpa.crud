package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario implements Serializable {
	/**
	 * 
	 */
	//estudar serialVersuiUID
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	
	
	//na criação de objetos, é preciso inicialos com valores nulos
	public Funcionario() {}
	
	//constructor das variaveis
	public Funcionario(Integer id, String nome, String email){
		super();//chamando a classe super
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	
	//getters e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override// sobrepoem o objeto quando ele for chamado na classe programa
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

	

	
	
	
}
