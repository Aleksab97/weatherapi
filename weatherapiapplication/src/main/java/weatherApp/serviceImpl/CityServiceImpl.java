package weatherApp.serviceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.querydsl.core.types.Predicate;
import weatherApp.dao.CityDao;
import weatherApp.domain.City;
import weatherApp.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CityService cityService;
	


	@Autowired
	private CityDao cityDao;

	@Value("${URLKEY}")
	public String URLKEY;
	@Value("${URL}")
	public String URL;

	@Override
	public City findByName(String name) {
		City city = restTemplate.getForObject(URL + name + URLKEY, City.class);
		return city;
	}

	@Override
	public City save(String name) {

		City city = cityService.findByName(name);

		city.setDate(formatDate());

		return cityDao.save(city);
	}

	// --- DATE FORMAT ---//
	public String formatDate() {

		Date date = new Date();
		String strDateFormat = "hh:mm:ss a";
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
		String formattedDate = dateFormat.format(date);

		return formattedDate;
	}
	// --- END DATE FORMAT ---//

	@Override
	public Page<City> findAll(Predicate predicate, Pageable pageable) {
		Page<City> cities = cityDao.findAll(predicate, pageable);
		
		return cities;
	}

	@Override
	public List<City> findAll() {
		return cityDao.findAll();
	}

}
