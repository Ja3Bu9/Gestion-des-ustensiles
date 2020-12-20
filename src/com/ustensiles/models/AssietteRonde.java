package com.ustensiles.models;

import java.sql.SQLException;
import com.ustensiles.config.ConnectDB;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class AssietteRonde extends Assiette {

	private double rayon;

public AssietteRonde() {
		
	}
	
	public AssietteRonde(int anneFabrication, double rayon) {
		super(anneFabrication);
		this.rayon = rayon;
	}
	

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "AssietteRonde [rayon=" + rayon + "]";
	}
	
	
	public double calculSurfaceAssiettesRondes(ConnectDB conn) {
        double surface=0;
        try {
             String request = "SELECT rayon as r FROM assieteronde";
             conn.statement = conn.connection.createStatement();
             conn.resultSet = conn.statement.executeQuery(request);
           while (conn.resultSet.next())
           {
               surface +=  3.14 * conn.resultSet.getDouble("r") * conn.resultSet.getDouble("r") ;
           }

        }
         catch (SQLException e) {
                e.printStackTrace();
         }

        return surface;
    }
	
	public int PrixAssietteRonde(ConnectDB conn) {
        int val=0;
        try {
             String request = "SELECT annee as a FROM assieteronde";
             conn.statement = conn.connection.createStatement();
             conn.resultSet = conn.statement.executeQuery(request);
           while (conn.resultSet.next())
           {
               
               if(2020 - conn.resultSet.getInt("a") < 50) {
            	   val += 0;
               }else {
            	   val += 2020 - conn.resultSet.getInt("a") - 50;
               }
           }

        }
         catch (SQLException e) {
                e.printStackTrace();
         }

        return val;
    }
	
	
	
}
