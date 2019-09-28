package bdda.projet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DBManager bdd = new DBManager();
		bdd.Init();
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("Commande : ");
			bdd.setCmd(sc.nextLine());
			
			if (DBManager.scmd[0].equals("exit"))
			{
				bdd.Finish();
			}
			else 
			{
				DBManager.ProcessCommand(DBManager.scmd[0]);
			}
			
		}
		while(!DBManager.scmd[0].equals("exit"));
		
		sc.close();
	}

}
