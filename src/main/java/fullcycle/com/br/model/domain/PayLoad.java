package fullcycle.com.br.model.domain;

import java.math.BigDecimal;

public class PayLoad {

	private String hotel;
	private String cidade;
	private BigDecimal valorTotal;
	
	
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	
	
	
}
