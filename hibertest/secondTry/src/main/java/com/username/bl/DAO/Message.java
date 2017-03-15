package com.username.bl.DAO;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "message")
public class Message implements Serializable{

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "message")
    private String message;

    public Message(Integer id, String data)
    {
        this.id = id;
        this.message = data;
    }

    public Message() {
    }


    public String getData() {
        return message;
    }

    public void setData(String value) {
        message = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
