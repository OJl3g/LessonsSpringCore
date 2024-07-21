package org.ojl3g.lessonsspringcore.springCreateBean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //при этом получаем разные объекты
public class School {
    private String nameSchool;
    private String address;

    public School(@Value("name of the Mihaylov") String nameSchool, @Value("Kosmonavtov str") String address) {
        this.nameSchool = nameSchool;
        this.address = address;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "nameSchool='" + nameSchool + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
