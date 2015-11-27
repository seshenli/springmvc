package com.test.dao;

import com.test.model.NewTable;

import java.util.List;

public interface NewTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewTable record);

    int insertSelective(NewTable record);

    NewTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewTable record);

    int updateByPrimaryKey(NewTable record);

    List<NewTable> selectBySelective(NewTable newTable);
}