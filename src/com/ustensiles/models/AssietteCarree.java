package com.ustensiles.models;

import java.sql.SQLException;

import com.ustensiles.config.ConnectDB;

public class AssietteCarree extends Assiette {
	
	private double cote;
	
	public AssietteCarree(){
		
	}
	
	public AssietteCarree(int anneFabrication, double cote) {
		super(anneFabrication);
		this.cote = cote;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	@Override
	public String toString() {
		return "AssietteCarree [cote=" + cote + "]";
	}
	
	
	
	public double calculSurfaceAssiettesCarree(ConnectDB conn) {
        double surface=0;
        try {
             String request = "SELECT cote as r FROM assietecarree";
             conn.statement = conn.connection.createStatement();
             conn.resultSet = conn.statement.executeQuery(request);
           while (conn.resultSet.next())
           {
               surface +=  conn.resultSet.getDouble("r") * conn.resultSet.getDouble("r") ;
           }

        }
         catch (SQLException e) {
                e.printStackTrace();
         }

        return surface;
    }
	
	public int PrixAssietteCarree(ConnectDB conn) {
        int val=0;
        try {
             String request = "SELECT annee as a FROM assietecarree";
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

        val = val*5;
        return val;
    }

}
