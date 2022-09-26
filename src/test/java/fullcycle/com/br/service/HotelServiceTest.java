package fullcycle.com.br.service;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import fullcycle.com.br.model.service.HotelService;

public class HotelServiceTest {
	
	
	HotelService hotelService = new HotelService();

	@Test
	@Order(1)
	@DisplayName("Deve retornar status ok")
	void getCidade() {
		

		assertEquals(ResponseEntity.ok(), hotelService.getCidade(1032));
		assertEquals(ResponseEntity.ok(), hotelService.getCidade(7110));
		assertEquals(ResponseEntity.ok(), hotelService.getCidade(9626));
	
	}
	

}
