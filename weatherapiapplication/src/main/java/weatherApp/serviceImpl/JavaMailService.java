package weatherApp.serviceImpl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import weatherApp.dao.CityDao;
import weatherApp.domain.City;
import weatherApp.domain.User;

@Service
public class JavaMailService {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private CityDao cityDao;

	public void sendEmailToUsers(User user) throws MessagingException {

		MimeMessage message = mailSender.createMimeMessage();
		StringBuilder sb = new StringBuilder("<body style='border:2px solid black'>");
		MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");

		sb.append("<div>");

		if (!user.getGrad().isEmpty()) {

			sb.append(user.getGrad().toString() + "<br>");
			sb.append("Vasa pretplata je na" + user.getPretplata() + "sat");

			City c = cityDao.findByName(user.getGrad());

			sb.append(c);

		} else {
			sb.append("Nema nista od poruke");
		}

		sb.append("</div>");
		sb.append("</body>");

		message.setContent(sb.toString(), "text/html");
		helper.setTo("bajricaleksa4@gmail.com");
		helper.setSubject("Proba");

		mailSender.send(message);

	}

}
