package com.ustensiles.app;

import java.util.Scanner;

import com.ustensiles.config.ConnectDB;
import com.ustensiles.models.Assiette;
import com.ustensiles.models.AssietteCarree;
import com.ustensiles.models.AssietteRonde;
import com.ustensiles.models.Cuilliere;
import com.ustensiles.models.Ustensile;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectDB conn = new ConnectDB();
		Scanner reader = new Scanner(System.in);
			
		conn.Connect("jdbc:mysql://localhost/gestion des ustensiles","root", "phpmysami");
		
		
		Cuilliere cuil = new Cuilliere();
		AssietteRonde assietteronde = new AssietteRonde();
		AssietteCarree assiettecarree = new AssietteCarree();
		Assiette assiette = new Assiette();
		Ustensile ustensile = new Ustensile();
		
		while(true) {
		System.out.println("AssietteCarre :\n");
		conn.Affichage("assietecarree");
		
		System.out.println("\n \n AssietteRonde :\n");
		conn.Affichage("assieteronde");
		
		System.out.println("\n \n Cuilliere :\n");
		conn.Affichage("cuilliere");
		System.out.println("\n");
		
		
		
		System.out.println("nombre des cuillères :" + cuil.afficherCuillières(conn));
		
				
		System.out.println("\nla somme des surfaces :" + assiette.SommeSurfaceAssiettes(assietteronde.calculSurfaceAssiettesRondes(conn), assiettecarree.calculSurfaceAssiettesCarree(conn)));
		
		
		
		System.out.println("\nla somme des valeurs :" + ustensile.afficherValeurTotale(cuil.PrixCuillieres(conn), assietteronde.PrixAssietteRonde(conn), assiettecarree.PrixAssietteCarree(conn)));
		
	
		
		System.out.println("\nAdd or Update (a/u) :");
		String choix = reader.next();
		
		switch(choix) {
			case"a":
				System.out.println("\nAssietteCarre , AssietteRonde ou Cuilliere : (ac/ar/c)");
				String Assiette = reader.next();
				
				switch(Assiette) {
					case"ac":
						try {
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							System.out.println("\ncote :");
							double cote = reader.nextDouble();
							
							conn.InsertReq("INSERT INTO assietecarree (annee,cote) VALUES ('"+annee+"','"+cote+"')");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						break;
					
					case"ar":
						try {
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							System.out.println("\nrayon :");
							double rayon = reader.nextDouble();
							
							conn.InsertReq("INSERT INTO assieteronde (annee,rayon) VALUES ('"+annee+"','"+rayon+"')");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						
						break;
						
						
					case"c":
						
						try {
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							System.out.println("\nlongueur :");
							double longueur = reader.nextDouble();
							
							conn.InsertReq("INSERT INTO cuilliere (annee,longueur) VALUES ('"+annee+"','"+longueur+"')");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						break;
						
					default:
						System.out.println("Error\n");
						break;
				}
				break;
			case"u":
				System.out.println("\nAssietteCarre , AssietteRonde ou Cuilliere : (ac/ar/c)");
				Assiette = reader.next();
				
				switch(Assiette){
					case"ac":
						try {
							System.out.println("id ?");
							int id = reader.nextInt();
							
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							conn.UpdateReq("UPDATE assietecarree SET annee='"+annee+"' WHERE id="+id+"");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						break;
						
						
					case"ar":
						
						try {
							System.out.println("id ?");
							int id = reader.nextInt();
							
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							conn.UpdateReq("UPDATE assieteronde SET annee='"+annee+"' WHERE id="+id+"");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						break;
						
						
					case"c":
						try {
							System.out.println("id ?");
							int id = reader.nextInt();
							
							System.out.println("\nannee :");
							int annee = reader.nextInt();
							
							conn.UpdateReq("UPDATE cuilliere SET annee='"+annee+"' WHERE id="+id+"");
							
							
		                    }

		                    catch (Exception e) {
		                        System.out.println("EROOOOOOOOOR !");
		                        reader.next();
		                    }
						break;
						
						
					default:
						System.out.println("Error\n");
						break;
						
						
				}
				break;
				
			default:
				System.out.println("Error\n");
				break;
				
				
			
		}
		
		
		}
	}

}
