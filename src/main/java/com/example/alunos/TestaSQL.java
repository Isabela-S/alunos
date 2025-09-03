package com.example.alunos;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestaSQL {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:sqlserver://DESKTOP-KOT2I5L\\ISABELASERVER:1433;databaseName=AlunosDB";
        String user = "sa";
        String pass = "galeria12345";

        Connection con = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexão funcionando!");
        con.close();
    }
}
