package c_inoutbean.dao;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:53
 * @apiNote
 */
public class UdImpl implements UserDao{
    @Override
    public void updateAdd() {
        System.out.println("这个输出来自于DAO层");
    }
}
