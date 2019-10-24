package tech.alexandluz.evotingsystem;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    String IP, DB, DBUserName, DBPassword;

    @SuppressLint("NewApi")
    public Connection connections() {
        //from local server
    IP="";
    DB="";
    DBUserName="";
    DBPassword="";

    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    java.sql.Connection connection = null;
    String ConnectionURL = null;
        try

    {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        ConnectionURL = "jdbc:jtds:sqlserver://" + IP + " :databaseName=" + DB + " :user=" + DBUserName + " :password=" + DBPassword + ";";
        connection = DriverManager.getConnection(ConnectionURL);
    } catch(SQLException se){
        Log.e("error for sql", se.getMessage());
    }
        catch(ClassNotFoundException e){
        Log.e("error from Class", e.getMessage());
    }
        catch(Exception ex){
        Log.e("Error from class", ex.getMessage());
    }
        return connection;
    }
}

