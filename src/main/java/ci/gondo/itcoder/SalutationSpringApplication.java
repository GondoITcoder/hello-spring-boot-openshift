package ci.gondo.itcoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class SalutationSpringApplication {
	
	@GetMapping("/")
	public String presentation(){
		return "Salut les Geek. Bienvenue sur le futur de la blockchain";
	}
	
	@GetMapping("/{input}")
	public String felicitation(@PathVariable String input){
		return "Youpi "+ input +" Votre applicatio à debal a été dployé avec succès...";
	}

	public static void main(String[] args) {
		SpringApplication.run(SalutationSpringApplication.class, args);
	}

}
