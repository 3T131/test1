import com.yjs.entity.House;
import com.yjs.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class ShangJi2 {
    public static void main(String[] args) {
        Session session= HibernateUtil.openSession();
        String sql="from House where title like ? and floorage>?";
        Query query=session.createQuery(sql);
        query.setString(0,"%关%");
        query.setInteger(1,70);
        List<House> list=query.list();
        for(House u:list) {
            System.out.println(u);
        }

    }
}
