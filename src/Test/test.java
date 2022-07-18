package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<book> list = new ArrayList<>();
        list.add(new book(1,"图", 1.0, 11));
        list.add(new book(2,"图书", 2.0, 10));
        list.add(new book(3,"图书书", 3.0, 9));

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"a");
        map.put(10,"b");
        map.put(9,"c");
        //   book --> bookVo
        List<bookVo> collect = list.stream().map(a -> {
            bookVo bookVo = new bookVo();
            bookVo.setId(a.getId());
            bookVo.setMoney(a.getMoney());
            bookVo.setName(a.getName());
            bookVo.setN(a.getN());
            bookVo.setBookvo(map.get(a.getN()));
            return bookVo;
        }).collect(Collectors.toList());
        System.out.println(collect);
    }

}