import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Menu obj=new Menu();
		
		Pizza a = new Pizza("Margherita",5,new String[] {"pomodoro","oregano"});
		
		Pizza b = new Pizza("Marinara",5.5,new String[] {"farina","olivo"});
		
		Pizza c = new Pizza("Quattro Stagioni",6.7,new String[] {"pomodoro","wurstel"});
	
		Pizza d= new Pizza("Diabolo",9,new String[] {"pomodoro","cipolla"});
		
		Pizza e = new Pizza("Hawaiann",3,new String[] {"pomodoro","ananas"});
		int finale = 0;
		int y=0;
		int user=0;
		double prezzo;
		String pizza;
		String ingred;
		obj.inserisciPizza(a,b,c,d,e);
		while(finale==0) {
		System.out.println("0)Exit");
		System.out.println("1)Trova pizze senza ingredienti");
		System.out.println("2)Pizze Costose");
		System.out.println("3)Pizza economica");
		System.out.println("4)Trova pizza");
		System.out.println("Scegli dal menu");
		System.out.println("Eha");
		user=input.nextInt();
		switch(user) {
		case 1:
			ingred=input.next();
			obj.trovaPizzeSenza(ingred);
	
			break;
			
		case 2:
			System.out.println("inserisci prezzo");
			prezzo=input.nextInt();
			obj.pizzeCostose(prezzo);
			break;
		case 4:
			System.out.println("inserisci nome pizza");
			pizza=input.next();
			obj.trovaPizza(pizza);
			break;
		case 3:
			obj.pizzaEco();
		break;
		}

	}
	}

}
