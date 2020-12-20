package com.ustensiles.models;

import com.ustensiles.config.ConnectDB;
import java.sql.SQLException;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Assiette extends Ustensile {

	public Assiette() {
		
	}
	
	public Assiette(int annneFabrication) {
		super(annneFabrication);
		
	}
	
	
	
	public double SommeSurfaceAssiettes(double sommeSurfacesAssiettesRondes, double sommeSurfacesAssiettesCarrees ) {

        return  sommeSurfacesAssiettesRondes + sommeSurfacesAssiettesCarrees;

    }
}
