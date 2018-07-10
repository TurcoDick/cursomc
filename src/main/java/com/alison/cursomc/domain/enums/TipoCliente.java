package com.alison.cursomc.domain.enums;

//Essa parte é avançada preciso estuda-la

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa física"),
	PESSOAJURIDICA(2,"Pessoa jurídica");
	
	private int cod;
	private String descricao;
	
	// o construtor de um Enum é private 
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	// lembrando objeto estático pode ser rodado mesmo sem ter um objeto instanciado
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		// for que percorre todos os valores possiveis do objeto TipoCliente
		for(TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: "+ cod);
	}

}
