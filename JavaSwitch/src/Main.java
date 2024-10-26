
public class Main {

	public static void main(String[] args) {
		//switch ci permette di comparare una variabile con un elenco di valori
		String giorno="Ciao";
		//dentro lo switch mettiamo la nostra variabile che vogliamo comparare
		switch(giorno) {
		//nel case metto un valore il quale verrà comparato alla nostra variabile e 
		//se sarà vero allora stamperà è lunedi
		case "Lunedi":System.out.println("E' Lunedi");
		//è importante usare il break per uscire dallo switch una volta che la condizione si è verificata
		break;
		case "Martedi": System.out.println("E' Martedi");
		break;
		case "Mercoledi": System.out.println("E' Mercoledi");
		break;
		case "Giovedi": System.out.println("E' Giovedi");
		break;
		case "Venerdi": System.out.println("E' Venerdi");
		break;
		case "Sabato": System.out.println("E' Sabato");
		break;
		case "Domenica": System.out.println("E' Domenica");
		break;
		//se nessuno dei casi risulta vero allora imposto un default
		default:System.out.println("Non hai inserito un giorno della settimana");
		}
	}

}
