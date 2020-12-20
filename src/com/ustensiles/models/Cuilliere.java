package com.ustensiles.models;
import com.ustensiles.config.ConnectDB;
import java.sql.SQLException;

public class Cuilliere extends Ustensile {

	private double longueur;
	
	public Cuilliere() {
		
	}
	
	public Cuilliere(int anneFabrication, double longueur) {
		super(anneFabrication);
		this.longueur = longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return "Cuilliere [longueur=" + longueur + "]";
	}

	public  int afficherCuillières(ConnectDB con) {
		int nombre=0;
        try {
        	   String request = "SELECT COUNT(*) as total FROM cuilliere";
        	   con.statement = con.connection.createStatement();
        	   con.resultSet = con.statement.executeQuery(request);
        	   con.resultSet.next();
               nombre=  con.resultSet.getInt("total");
               
            } 
        catch (SQLException e) {
               e.printStackTrace();
            }
        return nombre;
    }
	
	
	public int PrixCuillieres(ConnectDB conn) {
        int val=0;
        try {
             String request = "SELECT annee as a FROM cuilliere";
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
