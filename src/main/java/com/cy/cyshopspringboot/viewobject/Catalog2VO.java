package com.cy.cyshopspringboot.viewobject;


import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.0
 * @ClassName Catalog2VO
 * @Description TODO
 * @Author 吴桐
 * @date 2019/11/716:23
 */
public class Catalog2VO {

    private Integer id;

    private Integer pid;

    private String name;

    private String level = "二级分类";

    private List<Catalog3VO> children = new ArrayList<>();

    public Catalog2VO(Integer id, Integer pid, String name, String level, List<Catalog3VO> children) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.level = level;
        this.children = children;
    }

    public Catalog2VO() {
    }

    @Override
    public String toString() {
        return "Catalog2VO{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", children=" + children +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Catalog3VO> getChildren() {
        return children;
    }

    public void setChildren(List<Catalog3VO> children) {
        this.children = children;
    }
}
