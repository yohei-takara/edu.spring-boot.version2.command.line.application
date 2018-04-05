package edu.spring.boot.mybatis.read.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SelectCountRepository {

    @Select("SELECT COUNT(*) FROM ${tableName} ")
    int count(@Param("tableName") String tableName);

}
