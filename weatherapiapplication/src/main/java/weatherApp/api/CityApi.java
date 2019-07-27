package weatherApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.querydsl.core.types.Predicate;
import weatherApp.dao.CityDao;
import weatherApp.domain.City;
import weatherApp.service.CityService;


@RestController
@RequestMapping(value="/city")
public class CityApi {
	
	@Autowired
	private CityService cityService;
	

//---------- FIND BY NAME ----------//
	@RequestMapping(value="/findByName")
	public City findByName(String name) {
		return cityService.findByName(name);
	}
//---------- END FIND BY NAME ----------//
	

//---------- SAVE CITY ----------//	
	@RequestMapping(value="/save",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public City saveCity(String name) {
		return cityService.save(name);
	}
//---------- END SAVE CITY ----------//	
	

//---------- LIST ----------//	
	@RequestMapping(value="/findAll",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<City> findAll(@QuerydslPredicate(root = City.class, bindings = CityDao.class) Predicate predicate, Pageable pageable){
		return cityService.findAll(predicate, pageable);
	}
//---------- END LIST ----------//	
	
	
	
	
}
