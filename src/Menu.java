
public class Menu {
	
	private Pizza [] arrayP=new Pizza[5];
	private Pizza [] arrayPc=new Pizza[5];
	private Pizza []pizz = new Pizza[5];
	private Pizza meno;
	private Pizza[] arrayNo= new Pizza[5];
	private int k=0;
	private int g=0;
	private int costose=0;
	private int trov;
	private int[]num = new int[5];
	private String[] name= new String[5];
	private String[] name1= new String[5];
	
	public void inserisciPizza(Pizza a,Pizza b,Pizza c,Pizza d,Pizza e) {
		
	
		arrayP[0]=a;
		arrayP[1]=b;
		arrayP[2]=c;
		arrayP[3]=d;
		arrayP[4]=e;
		
		System.out.println(arrayP[0].getPrezzo());
		
		/*if (i>arrayP.length) {
			System.out.println("hai superato il max");
		} else {
				arrayP[i]=p;
			i++;
			

		}*/
		
		
	}
	public void trovaPizzeSenza(String s) {
		
		for (int y=0;y<arrayP.length;y++) {	
			/*if(k==1) {
				arrayNo[g]=arrayP[y];
				g++;
			}*/
			
		
		for (int x=0;x<2;x++) {
			if (s.equalsIgnoreCase(arrayP[y].getIngredienti()[x])) {
				
				name[k] =arrayP[y].getNome();
				k++;
				
			}
			
			
		}
		
		}
		System.out.println(arrayP[0].getIngredienti()[0]);
		System.out.println("Queste sono le pizze");
		for (int j=0;j<arrayP.length;j++) {
			name1[j]=arrayP[j].getNome();
		}
		for (int pp=0;pp<arrayP.length;pp++) {
			for (int yy=0;yy<k;yy++) {
				
			
			if (name1[pp].equalsIgnoreCase(name[yy])) {
				name1[pp]=" ";
			}
			}
			}
		
		for (int xx=0;xx<arrayP.length;xx++) {
			System.out.println(name1[xx]);
			name[xx]=" ";
		}
		for (int xx=0;xx<arrayP.length;xx++) {
			name1[xx]=" ";
		}
		k=0;
	}
	public void pizzeCostose(double p) {
		for (int a=0;a<arrayP.length;a++) {
			if (arrayP[a].getPrezzo()>p) {
				arrayPc[costose]=arrayP[a];
				costose++;
			}
		}
		System.out.println("queste sono le pizze");
		for (int b=0;b<costose;b++) {
			
			System.out.println(arrayPc[b].getNome()+" "+ arrayPc[b].getPrezzo());
		}
		costose=0;
	}
	public void trovaPizza(String piz) {
		for (int d=0;d<arrayP.length;d++) {
			if (piz.equalsIgnoreCase(arrayP[d].getNome())) {
				trov=d;
				System.out.println("questi sono gli ingredienti");
				for(int e=0;e<2;e++) {
					System.out.println(arrayP[trov].getIngredienti()[e]);
				}
			}
		}
		//System.out.println("questi sono gli ingredienti");
	}
	
	public void pizzaEco() {
		meno=arrayP[0];
		for (int f=0;f<arrayP.length-1;f++) {
			if (meno.getPrezzo()>arrayP[f].getPrezzo()) {
				meno=arrayP[f];
			}
	}
	System.out.println("pizza meno costoso è "+meno.getNome());
}
}