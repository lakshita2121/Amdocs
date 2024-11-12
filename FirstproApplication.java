package firstpro;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstproApplication {

    @GetMapping("/redirect")
    public String redirectToNewFile() {
        return "redirect:/login.html";
    }

  
    public static void main(String[] args) {
        SpringApplication.run(FirstproApplication.class, args);
    }
}
