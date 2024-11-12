package dbFactory;

public class DataFactory {
	
	public static void readData(DBType type) {
		
		switch(type) {
		case excel:
			 new Excel().dataProvider();
			 break;
	
		case Faker:
			 new Faker().dataProvider();
			 break;
		case db:
			 new DataBase().dataProvider();
			 break;
		case API:
			 new API().dataProvider();
			 break;
		case hardcoded:
			 new Hardcode().dataProvider();
			 break;
			 default:
				throw new IllegalArgumentException("No option available");
		
		}
		
		
	}

}
