package bdda.projet;


public class DBManager {
	
	private String cmd;
	private static DBDef dbdef = new DBDef();
	public static String [] scmd;

	
	public DBManager()
	{
		
	}
	
	public void Init()
	{
		dbdef.Init();
	}
	
	public void Finish()
	{
		dbdef.Finish();
		System.out.println("Sortie de DBManager.");
	}
	
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
		SplitCmd(cmd);
	}
	
	public void SplitCmd(String cmd) {
		DBManager.scmd = cmd.split("\\s");
	}

	
	public static void ProcessCommand(String cmd)
	{
		
		System.out.println("Vous avez lance la commande : "+scmd[0]);
		switch(scmd[0]) 
		{
			case "create" : Create();break;
			default : System.out.println("Commande non reconnue !");
		}
	}
	
	public static void Create() 
	{
		int i,j;
		
		String nr = scmd[1];
		int nc = Integer.parseInt(scmd[2]);
		String[] tc = new String[nc];
				
		for(i=0,j=3;i<nc;i++,j++){
			tc[i] = scmd[j];
	    }
		
		CreateRelation(nr,nc,tc);
	    
	}

	public static void CreateRelation(String nomRelation, int nombreColonne, String[] typeColonne)
	{
		System.out.println("Creation de la relation : " +nomRelation);
		RelDef rd = new RelDef(nomRelation, nombreColonne, typeColonne);
		dbdef.AddRelation(rd);
	}
}
