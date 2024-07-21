package org.ojl3g.lessonsspringcore;

import org.ojl3g.lessonsspringcore.springCreateBean.AppConfig;
import org.ojl3g.lessonsspringcore.springCreateBean.School;
import org.ojl3g.lessonsspringcore.springCreateBean.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Основной класс:
//Создает контекст Spring, используя класс конфигурации AppConfig.
//Получает бины Student из контекста по именам методов, определенным в AppConfig.
@SpringBootApplication
public class LessonsSpringCoreApplication {

    public static void main(String[] args) {
        // Создание контекста Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получение бинов из контекста
        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student3", Student.class);
        Student student4 = context.getBean("student4", Student.class);
        Student student5 = context.getBean("student5", Student.class);

        School school = context.getBean("school", School.class);
        School school1 = context.getBean("school", School.class);

        school.setNameSchool("newSchool");

        System.out.println(school);
        System.out.println(school1);
    }
}
