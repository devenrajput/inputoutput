package inputoutput;

import java.io.Serializable;

public class Emp implements Serializable {

    String name;
    int age;
    transient int id;// This keyword prevents serialization of data

    Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;

    }

}
