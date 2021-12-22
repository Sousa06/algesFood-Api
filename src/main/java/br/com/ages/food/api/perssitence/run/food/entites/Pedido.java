package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@NoArgsConstructor
public class Pedido implements Serializable {

	@Setter(value = AccessLevel.NONE) 
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUtlimaAtualizacao;
	private LocalDateTime dataConclusao;
	private BigDecimal total;
	private Integer versao;
	private static final long serialVersionUID = 1L;
	
	public Pedido(LocalDateTime dataCriacao, LocalDateTime dataUtlimaAtualizacao, LocalDateTime dataConclusao,
			BigDecimal total, Integer versao) {
	
		this.dataCriacao = dataCriacao;
		this.dataUtlimaAtualizacao = dataUtlimaAtualizacao;
		this.dataConclusao = dataConclusao;
		this.total = total;
		this.versao = versao;
	}
	
	
	

	
   
}
