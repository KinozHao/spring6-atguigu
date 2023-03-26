package book_manage.service;

import book_manage.entity.book_info;
import book_manage.dao.BookDao;
import book_manage.dao.BookQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:13
 * @apiNote
 */
@Service
public class BookService {
    @Resource    //注入DAO
    private BookDao bookDao;
    @Resource
    private BookQuery bookQuery;

    //增删改
    public void addBook(book_info book){
        bookDao.addBook(book);
    }
    public void delBook(String id){
        bookDao.delBook(id);
    }
    public void updateBook(book_info book){
        bookDao.updateBook(book);
    }

    //查询操作
    public void queryCount(){
        final int count = bookQuery.queryCount();
        System.out.println("数据库共存在"+count+"条数据");
    }
    public book_info findOne(String id){
        return bookQuery.findBookInfo(id);
    }
    public List<book_info> findAll(){
        return bookQuery.findAll();
    }

    //批量操作
    public void batchAdd(List<Object[]> args){
        bookDao.batchAdd(args);
    }
    public void batchUpdate(List<Object[]> args){
        bookDao.batchUpdate(args);
    }
    public void batchDel(List<Object[]> args){
        bookDao.batchDel(args);
    }
}
