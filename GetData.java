package tech.alexandluz.evotingsystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class GetData {
    Connection connect;
    String ConnectionResult = "";
    Boolean isSuccess = false;

    public List<Map<String, String>> getdata () {
        List<Map<String, String>> data = null;
        data = new ArrayList<Map<String, String>> ();

        try {
            DBconnection connectionHelper = new DBconnection ();
            connect = connectionHelper.connections ();
            if (connect == null) {
                ConnectionResult = "check your internet access";
            } else {
                String query = "select * from : ";
                Statement stmt = connect.createStatement ();
                ResultSet rs = stmt.executeQuery (query);

                while (rs.next ()) {
                    Map<String, String> datanum = new HashMap<String, String> ();
                    datanum.put ("ID", rs.getString ("id"));
                    data.add (datanum);
                }
                ConnectionResult = "successful";
                isSuccess = true;
                connect.close ();
            }
        } catch (Exception ex) {
            isSuccess = false;
            ConnectionResult = ex.getMessage ();
        }
        return data;
    }
}
