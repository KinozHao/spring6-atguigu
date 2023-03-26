package a_osu.entity;

import org.junit.Test;

/**
 * @author kinoz
 * @Date 2022/7/19 - 14:29
 * @apiNote 自动装配
 */
public class Staff {
    //注入部门类
    private Department dep;
    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    //在STAFF中调用返回部门类信息
    public String toString() {
        return "Staff{" +
                "dep=" + dep +
                '}';
    }
}
