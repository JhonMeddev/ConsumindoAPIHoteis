package fullcycle.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import fullcycle.com.br.model.domain.PayLoad;
import fullcycle.com.br.model.domain.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelservice;
	
	@GetMapping("/{ID_da_Cidade}")
	public ResponseEntity<List<PayLoad>> getCidade(@PathVariable Integer ID_da_Cidade){
		
		List<PayLoad> payloads = hotelservice.getCidade(ID_da_Cidade);

		
		if(payloads.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(payloads);
		}

	}
	
}
