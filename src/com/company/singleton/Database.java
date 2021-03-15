package com.company.singleton;

public class Database {
    private Database() { }
    private static Database instance;
    public void query(String sql) {
        System.out.println(sql);
    }
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
