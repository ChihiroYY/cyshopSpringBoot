package com.cy.cyshopspringboot.domain;

import javax.persistence.*;

@Table(name = "`member_level`")
public class MemberLevel {
    /**
     * 编号
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 用户等级
     */
    @Column(name = "`level`")
    private Integer level;

    /**
     * 折扣
     */
    @Column(name = "`discount`")
    private Integer discount;

    /**
     * 用户姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 拥有的会员数量
     */
    @Column(name = "`member_number`")
    private Integer memberNumber;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户等级
     *
     * @return level - 用户等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置用户等级
     *
     * @param level 用户等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取折扣
     *
     * @return discount - 折扣
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 设置折扣
     *
     * @param discount 折扣
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 获取用户姓名
     *
     * @return name - 用户姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取拥有的会员数量
     *
     * @return member_number - 拥有的会员数量
     */
    public Integer getMemberNumber() {
        return memberNumber;
    }

    /**
     * 设置拥有的会员数量
     *
     * @param memberNumber 拥有的会员数量
     */
    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }
}