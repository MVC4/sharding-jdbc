package sjdbc.db.sharding.table.springboot.entity;

/**
 * @author seven
 * @Description
 * @date 2020/4/27 4:18 下午
 */
public class User {
    private static final long serialVersionUID = -1205226416664488559L;

    private Long id;

    private String city = "";

    private String name = "";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
