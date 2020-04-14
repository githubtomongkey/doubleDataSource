package com.leyou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author WANGLAIKUAN
 */
@SpringBootApplication
@MapperScan("com.leyou.item.mapper")
public class DataSourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataSourceApplication.class,args);

    }
}
