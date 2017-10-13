package net.wangzhen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.wangzhen.mapper")
public class HeadquarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadquarterApplication.class, args);
	}
}
