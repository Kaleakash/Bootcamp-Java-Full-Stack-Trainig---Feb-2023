package ehealthcare.com.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ehealthcare.com.entity.Medicine;
import ehealthcare.com.service.MedicineService;

@RestController
@RequestMapping("medicine")
@CrossOrigin
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Medicine> findAllMedicine() {
		return medicineService.findAllMedicine();
	}
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeMedicine(@RequestBody Medicine medicine) {
		return medicineService.storeMedicine(medicine);
	}
}
