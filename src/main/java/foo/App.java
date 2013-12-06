package foo;

import java.sql.PreparedStatement;
import java.util.*;

/**
 * Hello world!
 */
public class App {


    public static final int COUNT = 2;

    static void init() {
        List<Person> list = getPersons();

        System.out.printf(getStringBandwidthMap(list).toString());
    }

    private static List<Person> getPersons() {
        Person p = new Person("song", 12);
        Person p1 = new Person("song", 14);
        Person p2 = new Person("wang", 13);
        Person p3 = new Person("wang", 15);
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p);
        return list;
    }

    private static Collection<Bandwidth> getStringBandwidthMap(List<Person> list) {
        Map<String, Bandwidth> map = new HashMap<String, Bandwidth>();
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getName();
            if (map.get(key) == null) {
                map.put(key, new Bandwidth());
            }
            map.get(key).add(list.get(i).getAge());
        }
        return map.values();
    }


    static void insertData() {

        PreparedStatement ps = null;


        Person p = new Person("hu", 10);


        int index = 4;
        for (int i = 0; i < p.getInData().length; i++) {

            System.out.println("indata" + index++);
            System.out.println("data" + index++);


        }


    }

    public static void main(String[] args) {

        System.out.printf(getSqlPrepare());
        System.out.println("");
        getSqlPrepareData();
//        insertData();
    }

    static String getSqlPrepare() {
        StringBuilder sql = new StringBuilder(
                "insert INTO BANDWIDTH_ISP(CHANNEL_ID,ISP_ID,DAY");

        return getSqlPrepare(sql);
    }

    private static String getSqlPrepare(StringBuilder sql) {
        int index = 1;
        for (int i = 0; i < COUNT; i++) {
            sql.append(",DATA" + index);
            sql.append(",INDATA" + index++);
        }
        sql.append(") values(?,?,?");
        for (int i = 0; i < COUNT; i++) {
            sql.append(",?");
            sql.append(",?");
        }
        sql.append(")");
        return sql.toString();
    }

    private static void getSqlPrepareData() {
        int index = 4;
        for (int i = 0; i < COUNT; i++) {
            System.out.println("indata" + index++);
            System.out.println("data" + index++);
        }
    }

}
