package fullcycle.com.br.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fullcycle.com.br.model.domain.Hotel;

@FeignClient(url = "https://cvcbackendhotel.herokuapp.com/hotels/avail/", name = "cvcbackendhotel")
public interface IHotel {
	
	@GetMapping("{ID_da_Cidade}")
	public List<Hotel> obterIdCidade(@PathVariable("ID_da_Cidade") Integer ID_da_Cidade);
}
