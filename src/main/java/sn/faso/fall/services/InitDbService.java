package sn.faso.fall.services;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sn.faso.fall.dao.UserDao;
import sn.faso.fall.entities.User;

@Service
@Transactional
public class InitDbService {
	private static final Logger logger = LoggerFactory
			.getLogger(InitDbService.class);
	@Autowired
	private UserDao userDao;

	@PostConstruct
	public void intit() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName("hoochie coochie man");

		try {
			logger.info("success saving user  "+user.getName());
			userDao.save(user);
			logger.info("success saving "+userDao.findAll().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("error initdbservice ",e);
		}

	}

}
