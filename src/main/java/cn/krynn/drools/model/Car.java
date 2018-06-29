package cn.krynn.drools.model;

/**
 * Created by RaistlinD
 * 2018/6/28 下午11:45
 */
public class Car {

    private int discount = 100;

    private Person person;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
