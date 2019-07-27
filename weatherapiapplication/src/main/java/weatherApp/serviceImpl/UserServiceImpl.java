package weatherApp.serviceImpl;

import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.querydsl.core.types.Predicate;
import weatherApp.dao.UserDao;
import weatherApp.domain.User;
import weatherApp.domain.dto.UserReqDto;
import weatherApp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private JavaMailService javaMailService;

	@Override
	public Boolean saveUser(UserReqDto userReqDto) {
		User user = new User();

		user.setIme(userReqDto.getIme());
		user.setEmail(userReqDto.getEmail());
		user.setPrezime(userReqDto.getPrezime());
		user.setPretplata(userReqDto.getPretplata());
		user.setGrad(userReqDto.getGrad());

		// SEND EMAIL //
		try {
			javaMailService.sendEmailToUsers(user);

		} catch (MessagingException e) {
			e.printStackTrace();
		}

		// END EMAIL //

		userDao.save(user);
		return true;

	}

	@Override
	public Page<User> findAll(Predicate predicate, Pageable pageable) {
		Page<User> user = userDao.findAll(predicate, pageable);
		return user;
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
