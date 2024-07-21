package org.ojl3g.lessonsspringcore.springCreateBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


 //Класс конфигурации Spring AppConfig:
 //Аннотирован как @Configuration, что указывает на то, что это класс конфигурации Spring.
 //Использует аннотацию @Bean для определения методов, которые создают и возвращают объекты Student.
@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Student student1() {
        return new Student(1, 101, "John", "Doe");
    }

    @Bean
    public Student student2() {
        return new Student(2, 102, "Jane", "Doe");
    }

    @Bean
    public Student student3() {
        return new Student(3, 101, "Alice", "Smith");
    }

    @Bean
    public Student student4() {
        return new Student(4, 103, "Bob", "Johnson");
    }

    @Bean
    public Student student5() {
        return new Student(5, 104, "Charlie", "Brown");
    }

//    @Bean
//     public School School() {
//        return new School("name of the Mihaylov", "Kosmonavtov str");
//    }
//

}
