package com.test.mybatis;

import com.alibaba.fastjson.JSON;
import com.test.dao.NewTableMapper;
import com.test.model.NewTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lihui on 15-11-27.
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class JunitForMyBatis {

    @Autowired
    NewTableMapper newTableMapper;

    @Test
    public void test(){
        NewTable newTable = new NewTable();
        newTable.setName("dazui");
        newTable.setAge("18");
        newTable.setArea("china");
        /*newTableMapper.insertSelective(newTable);*/
        List<NewTable> tableList = newTableMapper.selectBySelective(newTable);
        System.out.println(JSON.toJSONString(tableList));
    }
}
