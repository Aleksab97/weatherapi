package weatherApp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.querydsl.core.types.Predicate;
import weatherApp.domain.User;
import weatherApp.domain.dto.UserReqDto;

public interface UserService {

	Boolean saveUser(UserReqDto userReqDto);

	Page<User> findAll(Predicate predicate, Pageable pageable);

	List<User> findAll();

}
