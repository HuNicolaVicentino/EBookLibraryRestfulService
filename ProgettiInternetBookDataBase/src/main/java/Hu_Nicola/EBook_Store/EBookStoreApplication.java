package Hu_Nicola.EBook_Store;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class EBookStoreApplication {	
	@Autowired
	private usertableRepository usertablerepo;
	@Autowired
	private testotableRepository testotablerepo;
	@Autowired
	private recensionetableRepository recensionetablerepo;	


	public static void main(String[] args) {
		SpringApplication.run(EBookStoreApplication.class, args);

	}
	
	
	@RequestMapping("/")
	public String starter () {


		return "CIAO";
	}
	
	
	
	@PostMapping("Register")
	public String RegisterHandler(
			@RequestParam("userName") String userName,
            @RequestParam("Password") String password,
            @RequestParam("Password2") String password2,
            @RequestParam("nome") String nome,
            @RequestParam("cognome") String cognome,
            @RequestParam("email") String email,
            @RequestParam("numeroTelefono") Long numeroTelefono            
            ){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(password2);	
		System.out.println(nome);		
		System.out.println(cognome);		
		System.out.println(email);		
		System.out.println(numeroTelefono);	
		int codiceerrore=0;
		
		if(!(password.equals(password2))) {		
			codiceerrore=codiceerrore+1;
		}		
		usertable utente2 = usertablerepo.findByuserName(userName).orElse(null);
		System.out.println("La password rispetta i paramentri");

		if (!(utente2==null)) {
		    codiceerrore += 2;
		}
		System.out.println("l'utente non è mai stato registrato");

		switch(codiceerrore) {
		case 1 :   //Password non corrispondente
			System.out.println("Password non corrispondente");
			return"redirect:/LogInPage.html";
		
		case 2 :  //Nome account già registrato
			System.out.println("Nome account già registrato e Password non corrispondente");
			return"redirect:/LogInPage.html";
		
		case 3 :  //Nome account già registrato e Password non corrispondente
			System.out.println("Nome account già registrato e Password non corrispondente");
			return"redirect:/LogInPage.html";
		
		}
		usertable utente = new usertable();
		utente.setCognome(cognome);
		utente.setEmail(email);
		utente.setNome(nome);
		utente.setNumeroTelefono(numeroTelefono);
		utente.setPassword(password);
		utente.setUserName(userName);
		usertablerepo.saveAndFlush(utente);
		return "redirect:/Library.html";

	} 

	@PostMapping("Commenta")
	public String Commenta(
	        @RequestParam("idutente") String utente,
	        @RequestParam("commento") String commento
	) {
	    System.out.println("Utente: " + utente);
	    System.out.println("Commento: " + commento);
	    usertable utente2 = usertablerepo.findByuserName(utente).orElse(null);
	    if (utente2 == null) {
	        System.out.println("Errore: utente non esistente");
	        return "ERRORE"; 
	    }
	    recensionetable recensioneUWU = recensionetablerepo.findTop1BycodicerecensioneIgnoreCaseOrderByIdtestoDesc();
	    int codicerecensione = 0;

	    if (recensioneUWU != null) {
	        codicerecensione = recensioneUWU.getcodicerecensione();
	        System.out.println("Ho ottenuto il codice del commento precedente: " + codicerecensione);
	    } else {
	        System.out.println("Nessun commento precedente trovato");
	    }

	    codicerecensione++; 
	    recensionetable nuovaRecensione = new recensionetable(codicerecensione, utente, commento);
	    recensionetablerepo.saveAndFlush(nuovaRecensione);

	    System.out.println("Recensione salvata con codice: " + codicerecensione);

	    return "OP andat a bun fin"; 
	}

			}









	
	


	
	
	
	


