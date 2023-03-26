package book_manage.dao;

import book_manage.entity.book_info;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:12
 * @apiNote Book DML功能
 */
public interface BookDao {
    //增
    void addBook(book_info book);
    //删
    void delBook(String id);
    //改
    void updateBook(book_info book);

    //批量添加
    void batchAdd(List<Object[]> args);
    //批量删除
    void batchDel(List<Object[]> args);
    //批量修改
    void batchUpdate(List<Object[]> args);

}
