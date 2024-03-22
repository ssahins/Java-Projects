// Using Interface
interface IDatabase {

    public void add();
    public void insert();
    public void delete();
    public void update();

}
class DataBaseManager {
    public void addDatabase(IDatabase database) {
        database.add();

    }
    public void insertDatabase(IDatabase database){
        database.insert();;

    }
    public void deleteDatabase(IDatabase database){
        database.delete();

    }
    public void updateDatabase(IDatabase database){
        database.update();

    }

}
class MySqlDatabase implements IDatabase {
    @Override
    public void add() {
        System.out.println("Data was added to Sql database");

    }

    @Override
    public void insert() {
        System.out.println("Data was showed the data from sql");

    }

    @Override
    public void delete() {
        System.out.println("Data was deleted from Sql database");

    }
    @Override
    public void update() {
        System.out.println("Data was updated the Sql database");

    }
}
class MsSql implements IDatabase {

    @Override
    public void add() {
        System.out.println("Data was added to Sql database");
    }

    @Override
    public void insert() {
        System.out.println("Data was showed the data from sql");

    }

    @Override
    public void delete() {
        System.out.println("Data was deleted from Sql database");

    }

    @Override
    public void update() {
        System.out.println("Data was updated the Sql database");

    }
}

public class ClassInterface {
    public static void main(String[] args) {

//        MySqlDatabase mySql = new MySqlDatabase();
//        mySql.add();
//        mySql.delete();

        DataBaseManager dataBaseManager = new DataBaseManager();

        dataBaseManager.addDatabase(new MySqlDatabase());
        dataBaseManager.deleteDatabase(new MySqlDatabase());

    }
}
