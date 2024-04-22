package gr.accenture.demo.models;

public class Student {
    private Integer id;
    private String name;
    private String lasName;

    public Student(Integer id, String name, String lasName) {
        this.id = id;
        this.name = name;
        this.lasName = lasName;
    }

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

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }
}
