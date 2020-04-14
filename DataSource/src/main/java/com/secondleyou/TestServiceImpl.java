package com.secondleyou;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl {

	@Resource
    private TestMapper testMapper;
	

	public List<Map<String, Object>> test(){
		return testMapper.test();
	}

	@DataSource(value = DataSourceType.SLAVE)

	public String str() {
		return testMapper.str();
	}
	
	@DataSource(value = DataSourceType.BIGDATA)

	public List<Map<String, Object>> dsj(){
		return testMapper.dsj();
	}
}
