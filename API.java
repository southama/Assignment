package dbFactory;

import java.util.logging.Logger;

public class API implements TestData {

	private static final Logger logger = Logger.getLogger(API.class.getName());

	@Override
	public void dataProvider() {
		logger.info("Reading data from API");
		
	}
	
	
}
