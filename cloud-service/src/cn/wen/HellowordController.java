package cn.wen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@RequestMapping("helloword")
public class HellowordController {
	
	@ResponseBody
	@RequestMapping("/hi")
	public String Hi(){
		return "Hello World!";
	}
	   public static void main(String[] args) throws Exception {
	        SpringApplication.run(HellowordController.class, args);
	    }	
	
}
