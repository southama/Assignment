package dbFactory;

import java.util.logging.Logger;

public class Excel implements TestData{
	
	private static final Logger logger = Logger.getLogger(Excel.class.getName());

	@Override
	public void dataProvider() {
		logger.info("Reading data from Excel");
		
	}

}
