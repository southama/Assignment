package dbFactory;

import java.util.logging.Logger;

public class Hardcode implements TestData {

	private static final Logger logger = Logger.getLogger(Hardcode.class.getName());
	@Override
	public void dataProvider() {
	 logger.info("Reading data from hardcode");
		
	}

}
