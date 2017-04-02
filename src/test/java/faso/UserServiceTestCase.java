package faso;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import sn.faso.fall.config.MainConfig;
import sn.faso.fall.config.MongoConfig;
import sn.faso.fall.dao.UserDao;
import sn.faso.fall.entities.User;
import sn.faso.fall.services.InitDbService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy(

{ @ContextConfiguration(classes = MainConfig.class),
		@ContextConfiguration(classes = MongoConfig.class),
// @ContextConfiguration(classes = RepositoryConfig.class),
// @ContextConfiguration(classes = ServiceConfig.class),
// @ContextConfiguration(classes = InfrastructureConfig.class),
// @ContextConfiguration(classes = WebMvcConfig.class)

})
// @ActiveProfiles("localdevelopment")
public class UserServiceTestCase {
	private static final Logger logger = LoggerFactory
			.getLogger(UserServiceTestCase.class);
	@Inject
	private UserDao userService;

	@Before
	public void init() {
		User user = new User();
		user.setName("tototo");
		try {
			userService.save(user);
			logger.info("creating new user ", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("error test creating user", user);
		}

	}

	@Test
	public void test() {

		assertTrue(userService.findAll().size() >= 1);

	}

}
