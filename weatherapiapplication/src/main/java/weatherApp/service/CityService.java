package weatherApp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.types.Predicate;

import weatherApp.domain.City;

public interface CityService {

	City findByName(String name);

	City save(String name);

	Page<City> findAll(Predicate predicate, Pageable pageable);

	List<City> findAll();

}
