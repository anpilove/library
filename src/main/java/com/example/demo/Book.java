package com.example.demo;


import jakarta.persistence.Entity; // анотация что класс является сущностбю и относиться к ORM JPA
import jakarta.persistence.GeneratedValue; // автозаполнение айди
import jakarta.persistence.GenerationType; // indentitry
import jakarta.persistence.Id;

//«машина»: ID, Вид техники (например, мультиварка), Группа техники (например, бытовые
//приборы), Дата ввоза на склад, Дата вывоза со склада, ФИО водителя, увозящего технику со склада.
//CREATE TABLE Library (
//        ID int (15) NOT NULL AUTO_INCREMENT,
//        name varchar (255) NOT NULL,
//        publish_house varchar (255) NOT NULL,
//        data_input datetime NOT NULL,
//        FIO datetime NOT NULL,
//        data_output varchar (255),
//        PRIMARY KEY (ID)
//        ) ENGINE=InnODB DEFAULT CHARSET=UTF8
// сущность которую нужно сохранять в базе данных
@Entity
public class Book {
    private Long ID;
    private String name;
    private String publish_house;
    private String data_input;
    private String FIO;
    private String data_output;

    protected Book(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublish_house() {
        return publish_house;
    }

    public void setPublish_house(String publish_house) {
        this.publish_house = publish_house;
    }

    public String getData_input() {
        return data_input;
    }

    public void setData_input(String data_input) {
        this.data_input = data_input;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getData_output() {
        return data_output;
    }

    public void setData_output(String data_output) {
        this.data_output = data_output;
    }
}
