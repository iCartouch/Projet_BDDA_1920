package bdda.projet;
public class RelDef {
	
	private String nomRelation;
	private int nombreColonne;
	private String[] typeColonne;
	
	public RelDef(String nomRelation, int nombreColonne, String[] typeColonne)
	{
		this.nomRelation = nomRelation;
		this.nombreColonne = nombreColonne;
		this.typeColonne = typeColonne;
	}
	
}
