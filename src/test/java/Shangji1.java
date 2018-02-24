import com.yjs.entity.Users;
import com.yjs.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shangji1 {
    public static void main(String[] args) {
        Session session= HibernateUtil.openSession();

        /*
        // 查询所有列表

        String sql="from Users";
        Query query=session.createQuery(sql);
        List<Users> list=query.list();
        for (Users u: list
             ) {
            System.out.println(u);
        }
        //*/

        //*
        // 按条件查询列表 对象查询方式
        List<Users> list=UsersByName(new Users(null));
        for (Users u: list) {
            System.out.println(u);
        }
        //*/

        /*
        // 按条件查询列表 map查询方式
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("name","%jbit%");
        List<Users> usersList=ShowList(map);
        for (Users u:usersList) {
            System.out.println(u);
        }

        //*/
    }
    /*
    * 根据MAP
    * */
    public static List<Users> ShowList(Map map){
        Session session=HibernateUtil.openSession();
        String sql="from Users where 1=1 and name like :name";
        Query query=session.createQuery(sql);
        query.setProperties(map);
        return  query.list();
    }
/*
* 根据对象 properties
* */
    public static List<Users> UsersByName(Users users){
        Session session= HibernateUtil.openSession();

        String sql="from Users where 1=1 ";
        if (null!=users){
            if (null!=users.getName()&&!"".equals(users.getName())){
                sql+="and name like :name";
            }
        }
        Query query=session.createQuery(sql);
        query.setProperties(users);
        return  query.list();
    }
}
