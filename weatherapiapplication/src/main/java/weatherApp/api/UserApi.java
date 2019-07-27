package weatherApp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.querydsl.core.types.Predicate;
import weatherApp.domain.dto.UserReqDto;
import weatherApp.service.UserService;
import weatherApp.dao.UserDao;
import weatherApp.domain.User;

@RestController
@RequestMapping(value="/user")
public class UserApi {
	
	@Autowired
	private UserService userService;

	

//---------- SAVE USER ----------//
	@RequestMapping(value="/save",method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean save(@RequestBody UserReqDto userReqDto) {
		return userService.saveUser(userReqDto);
	}
//---------- END SAVE USER ----------//	

	
	
//---------- FIND ALL USER ----------//	
	@RequestMapping(value="/findAll",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<User> findAllUser(@QuerydslPredicate(root = User.class, bindings = UserDao.class) Predicate predicate, Pageable pageable){
		return userService.findAll(predicate,pageable);
	}
//---------- END FIND ALL USER ----------//	

	/*
	 * @RequestMapping(value="/findAllUser",method=RequestMethod.GET, produces =
	 * MediaType.APPLICATION_JSON_VALUE) public List<User>findAll(){ return
	 * userService.findAll(); }
	 */
	
}
