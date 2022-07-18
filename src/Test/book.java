package Test;

public class book {
    private Integer id;
    private String name;
    private Double money;
    private Integer n;
    // 控制new对象
    public book() {
    }
    // 创建对象
    public book(Integer id, String name, Double money, Integer n) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.n = n;
    }
    // 设置得到属性
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
    // 对象字符串
    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", n=" + n +
                '}';
    }
}
