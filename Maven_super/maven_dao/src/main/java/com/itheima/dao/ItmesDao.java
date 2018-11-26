package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;


public interface ItmesDao {

    @Select("select * from items where id = #{id}")
    Items findById(Integer id);
}
