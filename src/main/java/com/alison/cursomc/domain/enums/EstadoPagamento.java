package com.alison.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3,"Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// lembrando objeto estático pode ser rodado mesmo sem ter um objeto instanciado
		public static EstadoPagamento toEnum(Integer cod) {
			
			if(cod == null) {
				return null;
			}
			
			// for que percorre todos os valores possiveis do objeto TipoCliente
			for(EstadoPagamento x : EstadoPagamento.values()) {
				if (cod.equals(x.getCod())) {
					return x;
				}
			}
			
			throw new IllegalArgumentException("Id inválido: "+ cod);
		}
}
