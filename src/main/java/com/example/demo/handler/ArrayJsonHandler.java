package com.example.demo.handler;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lixio on 2019/3/28 20:51
 * @description 用以mysql中json格式的字段，进行转换的自定义转换器，转换为实体类的JSONArray属性
 * MappedTypes注解中的类代表此转换器可以自动转换为的java对象
 * MappedJdbcTypes注解中设置的是对应的jdbctype
 */
@MappedTypes(JSON.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ArrayJsonHandler<T> extends BaseTypeHandler<List<T>> {
    Class<T> clazz;
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, List<T> ts, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, String.valueOf(ts.toString()));
    }
    //根据列名，获取可以为空的结果
    @Override
    public List<T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String sqlJson = rs.getString(columnName);
        if (null != sqlJson){
            return JSONArray.parseArray(sqlJson,clazz);
        }
        return null;
    }
    //根据列索引，获取可以为空的结果
    @Override
    public List<T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String sqlJson = rs.getString(columnIndex);
        if (null != sqlJson){
            return JSON.parseArray(sqlJson,clazz);
        }
        return null;
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String sqlJson = cs.getString(columnIndex);
        if (null != sqlJson){
            return JSONArray.parseArray(sqlJson,clazz);
        }
        return null;
    }

}