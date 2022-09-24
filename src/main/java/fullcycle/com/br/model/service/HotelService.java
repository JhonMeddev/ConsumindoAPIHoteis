package fullcycle.com.br.model.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fullcycle.com.br.client.IHotel;
import fullcycle.com.br.model.domain.Hotel;
import fullcycle.com.br.model.domain.PayLoad;
import fullcycle.com.br.model.domain.Room;

@Service
public class HotelService {
	
	@Autowired
	private IHotel clienteHotel;
	

	public List<PayLoad> getCidade(Integer ID_da_Cidade){
		
		return payloadRetorno(clienteHotel.obterIdCidade(ID_da_Cidade));


	}
	
	//Método para adicionar informações na classe de payload
	public List<PayLoad> payloadRetorno(List<Hotel> hoteis){
		
		List<PayLoad> payloads = new ArrayList<PayLoad>();
		
		for(Hotel h : hoteis) {
			PayLoad p = new PayLoad();
			p.setHotel(h.getName());
			p.setCidade(h.getCityName());
			p.setValorTotal(valorTotal(h));
			payloads.add(p);
		}
		return payloads;
		
	}
	
	//Calculando valor total
	public BigDecimal valorTotal(Hotel hotel) {
		
		
		BigDecimal resultado = BigDecimal.ZERO;
		
		for(Room r : hotel.getRooms()) {
			resultado = resultado.add(new BigDecimal(r.getPrice().getAdult()*2+ r.getPrice().getChild())).setScale(2, RoundingMode.HALF_DOWN);
		}
		
		return resultado;
	}

}
