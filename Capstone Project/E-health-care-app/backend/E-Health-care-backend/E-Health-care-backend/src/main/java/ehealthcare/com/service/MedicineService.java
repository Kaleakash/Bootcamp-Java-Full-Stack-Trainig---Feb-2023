package ehealthcare.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ehealthcare.com.entity.Medicine;
import ehealthcare.com.repository.MedicineRepository;

@Service
public class MedicineService {

	@Autowired
	MedicineRepository medicineRepository;
	
	public String storeMedicine(Medicine mm) {
		medicineRepository.save(mm);
		return "Medicine Details stored successfully";
	}
	
	public List<Medicine> findAllMedicine() {
		return medicineRepository.findAll();
	}
}
