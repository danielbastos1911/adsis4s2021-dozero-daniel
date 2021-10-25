package com.unicesumar.adsis4s2021.doZero.carro;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carro {
	@Id
	private String id;
	
	private String modelo;
	private int anoDeFabricacao;
	private String placa;
	private String CodigoRenavam;
	private int quilometragem;
	
	public Carro() {
		id = UUID.randomUUID().toString();
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

	public void setAnoDeFabricacao(int anoDeFabricacao) {
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

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		//final int prime = 31;
		//int result = 1;
		//result = prime * result + ((id == null) ? 0 : id.hashCode());
		//return result;
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
		//if (id == null) {
		//	if (other.id != null)
		//		return false;
		//} else if (!id.equals(other.id))
		//	return false;
		//return true;
		
	}
	
	
	
	
}
