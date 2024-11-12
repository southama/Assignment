package dbFactory;

import java.util.logging.Logger;

public class DataBase implements TestData {
	
	private static final Logger logger = Logger.getLogger(DataBase.class.getName());

	@Override
	public void dataProvider() {
		logger.info("Reading data from Database");
		
	}

}
