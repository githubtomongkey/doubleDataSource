package com.leyou.item.controller;


import com.leyou.item.mapper.BaseMapper;
import com.leyou.item.mapper.second.SecondMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author WANGLAIKUAN
 */
@RestController
public class DemoController {

    @Autowired
    private BaseMapper baseMapper;

    @Autowired
    private SecondMapper secondMapper;

    @GetMapping("/base/dual")

    @Transactional("transactionManager")
    public int baseDual(){
        baseMapper.update();
//        int i=1/0;

        return baseMapper.dual();
    }


    @GetMapping("/dual")
    public int secondDual(){
        return secondMapper.dual();
    }

}
