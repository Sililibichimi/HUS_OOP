package oop_hus.lab10.singleton.ex01;

public class Database {
    private static Database instance;

    private Database() {
        // Something

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println(sql);
    }
}