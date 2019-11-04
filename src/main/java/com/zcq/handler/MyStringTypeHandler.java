package com.zcq.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;


/**
 * @Author: chaoqun
 * @Date: 2019/11/4 23:58
 */
@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
@Slf4j
public class MyStringTypeHandler implements TypeHandler<String> {


    @Override
    public void setParameter(PreparedStatement ps, int index, String value, JdbcType jdbcType) throws SQLException {
        log.info("使用我的TypeHandler");
        ps.setString(index, value);
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        log.info("使用我的TypeHandler，ResultSet列名获取字符串");
        return rs.getString(columnName);
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        log.info("使用我的TypeHandler，ResultSet下标获取字符串");
        return null;
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        log.info("使用我的TypeHandler，CallableStatement列名获取字符串");
        return null;
    }
}
