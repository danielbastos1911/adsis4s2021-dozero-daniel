package com.unicesumar.adsis4s2021.doZero.carro;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Carro {
	@Id
	private String id;

	@Column(nullable = false)
	private String modelo;

	@Column(nullable = false)
	private Integer anoDeFabricacao;

	@Column(unique = true, nullable = false)
	private String placa;

	@Column(unique = true, nullable = false)
	private String CodigoRenavam;

	@Column(nullable = false)
	private Integer quilometragem;

	public Carro() {
		id = UUID.randomUUID().toString();
		System.out.println("Criando um carro com id: " + id);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCodigoRenavam() {
		return CodigoRenavam;
	}

	public void setCodigoRenavam(String codigoRenavam) {
		CodigoRenavam = codigoRenavam;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		// final int prime = 31;
		// int result = 1;
		// result = prime * result + ((id == null) ? 0 : id.hashCode());
		// return result;
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
		// if (id == null) {
		// if (other.id != null)
		// return false;
		// } else if (!id.equals(other.id))
		// return false;
		// return true;

	}

}
