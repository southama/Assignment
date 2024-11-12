package dbFactory;

import java.util.logging.Logger;

public class Faker implements TestData{

	private static final Logger logger = Logger.getLogger(Faker.class.getName());
	@Override
	public void dataProvider() {
		logger.info("Reading data from Faker");
		
	}

}
