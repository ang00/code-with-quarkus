package org.acme.daman;

import javax.persistence.*;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/9 10:36
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
//@Table(name = "t_book")
@Entity
public class Book {
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;
//    @Column(name = "name")
    private String name;
//    @Column(name = "title")
    private String title;
//    @Column(name = "author")
    private String author;
//    @Column(name = "desc")
    private String desc;

    public Book() {
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book(Long id, String name, String title, String author, String desc) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.author = author;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
