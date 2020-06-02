package mypractice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mypractice.mapper")
public class MypracticeApplication {

    public static void main(String[] args) {

        SpringApplication.run(MypracticeApplication.class, args);
        System.out.println("启动成功");

    }


}
