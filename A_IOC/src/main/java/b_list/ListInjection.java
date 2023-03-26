package b_list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author kinoz
 * @Date 2022/7/17 - 18:21
 * @apiNote 注入集合与数组类型属性
 */
public class ListInjection {
    private String[] data;

    private List<String> list;

    private Map<String,String> map;

    //引用数据类型集合
    private List<Course> courseList;

    public void setData(String[] data) {
        this.data = data;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //输出从bean文件设置的属性值
    public void listData(){
        System.out.println("数组注入"+Arrays.toString(data));
        System.out.println("集合注入"+list);
        System.out.println("Map注入"+map);
        System.out.println("引用数据类型注入"+courseList);
    }


}
