package myController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import myEntity.IEntity;
import myRepo.IRepo;

@RestController
public class IController {
	@Autowired
	IRepo iRepo;
	
	@PostMapping("savetest")
	public IEntity savetest(@RequestBody IEntity value) {
		return  iRepo.save(value);
	}
	@GetMapping("/gettest")
	public List<IEntity> findAll(){
		return iRepo.findAll();
		
	}
	@GetMapping("/getById/{id}")
	public Optional<IEntity> getById(@PathVariable Integer id){
		return iRepo.findById(id);
		
	}
	@PutMapping("/updatetest")
	public IEntity updatetest(@PathVariable IEntity id) {
		return iRepo.save(id);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		iRepo.deleteById(id);
		return "sucess fully"+id;
	}
	
	
	
	

	
		

	

}
