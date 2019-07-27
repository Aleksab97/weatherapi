package weatherApp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import weatherApp.domain.City;
import weatherApp.domain.QCity;
public interface CityDao extends MongoRepository<City, String>, QuerydslPredicateExecutor<City>, QuerydslBinderCustomizer<QCity> {
	
	@Override
	default void customize(QuerydslBindings bindings, QCity root) {
		bindings.bind(String.class)
				.first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
	}
	
	City findByName(String grad);
}
