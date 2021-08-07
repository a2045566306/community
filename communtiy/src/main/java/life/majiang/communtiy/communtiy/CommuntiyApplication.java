package life.majiang.communtiy.communtiy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("life.majiang.communtiy.communtiy.mapper")
public class CommuntiyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommuntiyApplication.class, args);
	}

}
