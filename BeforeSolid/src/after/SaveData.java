package after;

public class SaveData {
    //Single Responsibility
	public void save(){
		try {
			FileDB file = new FileDB();
            file.dbStorage();
		} catch (Exception e){
            e.printStackTrace();
        }
	}
}
