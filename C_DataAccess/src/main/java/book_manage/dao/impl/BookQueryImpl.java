package book_manage.dao.impl;

import book_manage.dao.BookQuery;
import book_manage.entity.book_info;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:26
 * @apiNote
 */
@Component
public class BookQueryImpl implements BookQuery {

    //注入jdbc template
    @Resource
    private JdbcTemplate jdbcTemplate;
    //查询表记录数
    @Override
    public int queryCount() {
        String sql = "select count(*) from book_info";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    //根据id查详情
    @Override
    public book_info findBookInfo(String id) {
        String sql = "select * from book_info where id=?";
        //RowMapper接口 根据返回值类型 实现类完成数据封装
        final book_info book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<book_info>(book_info.class), id);
        return book;
    }

    //查询所有数据信息
    @Override
    public List<book_info> findAll() {
        String sql = "select * from book_info;";
        final List<book_info> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(book_info.class));
        return query;
    }
}
