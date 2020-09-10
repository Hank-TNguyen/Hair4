package puzzles.edmonton.Hair4;

import lombok.Builder;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hair4Application {

	public static void main(String[] args) {
		SpringApplication.run(Hair4Application.class, args);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/hello")
	public ResponseEntity<?> hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		Order order = Order.builder().name(name).build();
		return ResponseEntity.ok(order);
	}
}

@Builder
@Getter
class Order {
	String name;
}