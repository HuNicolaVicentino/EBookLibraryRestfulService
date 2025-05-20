package Hu_Nicola.EBook_Store;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestoControllore {
    @Autowired
    private testotableRepository testotablerepo;
    
    @GetMapping("/Library")
    public FormatoLibreriaTesto Library() {
    	 testotable[] Testi=testotablerepo.findTop10ByOrderByIdtestoDesc();
    	 for (int i=0;i!=10;i++) {
    		 Testi[i].toString();
    	 }
    	 FormatoLibreriaTesto ROba = new FormatoLibreriaTesto(Testi,Testi.length );//
    	 System.out.println("HO mandato il FIle JSON");
        return ROba;
    }
    
    
    @GetMapping("/cercaidlibro")
    public testotable[] getlibro(@RequestParam int idlibro) {
   	 testotable[] Testo =testotablerepo.findByIdtesto(idlibro);
	 System.out.println("HO mandato il FIle JSON per il libro corrispondente all'ID" );
	 System.out.print(Testo);
    	return Testo;
    }
    @GetMapping("/cercagenere")
    public FormatoLibreriaTesto getcercagenere(@RequestParam String genere) {
   	 testotable[] Testi=testotablerepo.findTop10ByGeneretestoIgnoreCaseOrderByIdtestoDesc(genere);
	 FormatoLibreriaTesto ROba = new FormatoLibreriaTesto(Testi,10);
	 System.out.println("HO mandato il FIle JSON per il genere" );
	 System.out.print(genere);
    	return ROba;
    }


	    @GetMapping("/cercatitolo")
    public testotable getcercatitolo(@RequestParam String titolotesto) {
   	 testotable Testi=testotablerepo.findBytitolotesto( titolotesto);
	 System.out.println("HO mandato il FIle JSON per i testi con nome corrispondente" );
	 System.out.print(titolotesto);
    	return Testi;
    }  
	    
}
