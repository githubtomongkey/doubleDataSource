package com.leyou.item.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author WANGLAIKUAN
 */
@Configuration
@MapperScan(basePackages = "com.leyou.item.mapper.second",sqlSessionFactoryRef = "secondSqlSessionFactory",sqlSessionTemplateRef = "secondSqlSessionTemplate")
public class SecondMapperConfig {
}
