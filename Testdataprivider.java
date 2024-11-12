package dbFactory;

public class Testdataprivider {
	
	public static void main(String[] args) {
		DataFactory.readData(DBType.excel);
		DataFactory.readData(DBType.API);
		DataFactory.readData(DBType.db);
		DataFactory.readData(DBType.Faker);
		DataFactory.readData(DBType.hardcoded);
	}

}
