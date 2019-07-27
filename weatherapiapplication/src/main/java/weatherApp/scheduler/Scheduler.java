package weatherApp.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import weatherApp.domain.City;
import weatherApp.domain.User;
import weatherApp.service.CityService;
import weatherApp.service.UserService;
import weatherApp.serviceImpl.JavaMailService;

@Component
public class Scheduler {

	public int counter = 1;

	@Autowired
	private CityService cityService;

	@Autowired
	private JavaMailService javaMailService;

	@Autowired
	private UserService userService;

	// --- DATE FORMAT ---//
	Date date = new Date();
	String strDateFormat = "hh:mm:ss a";
	DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
	String formattedDate = dateFormat.format(date);

	// --- END DATE FORMAT ---//

	// --- SEND EMAIL ---//
	@Scheduled(fixedDelay = 3600000)
	public void sendEmailToUsersFor1h() {

		List<User> user = userService.findAll();

		for (User users : user) {
			
			if ((counter % users.getPretplata()) == 0) {
				try {
					if (counter == 24) {
						counter = 1;
					}
					javaMailService.sendEmailToUsers(users);
					counter += 1;

				} catch (MessagingException e) {
					e.printStackTrace();
				}

			}

		}
	}
	// --- END SEND EMAIL ---//

	@Scheduled(fixedDelay = 3600)
	public Page<City> findAll() {

		List<City> cities = cityService.findAll();
		Page<City> page = new PageImpl<City>(cities);

		for (City city : cities) {

			cityService.save(city.getName());

		}
		return page;

	}

}
