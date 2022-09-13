import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerr {
	
	@RequestMapping("/start")
	public String home() {
		System.out.println("home page");
		return "start";
	}
}
