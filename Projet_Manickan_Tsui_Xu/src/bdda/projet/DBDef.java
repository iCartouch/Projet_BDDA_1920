package bdda.projet;

import java.util.ArrayList;

public class DBDef {
	//private RelDef[] relDefList = new RelDef[10];
	private ArrayList<RelDef> relDefList = new ArrayList<RelDef>();
	private int compteur = 0;
	
	public DBDef()
	{
		
	}
	
	public void Init()
	{
		
	}
	
	public void Finish()
	{
		
	}
	
	public void AddRelation(RelDef relDef)
	{
		//relDefList[compteur] = relDef;
		relDefList.add(relDef);
		for (int i = 0; i < relDefList.size(); i++) {
		      System.out.println(relDefList.get(i));
		}
		compteur++;
	}

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	
}
