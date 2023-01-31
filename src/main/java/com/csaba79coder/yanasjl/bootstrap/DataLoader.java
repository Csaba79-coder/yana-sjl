package com.csaba79coder.yanasjl.bootstrap;

import com.csaba79coder.yanasjl.model.Student;
import com.csaba79coder.yanasjl.model.Teacher;
import com.csaba79coder.yanasjl.persistence.StudentRepository;
import com.csaba79coder.yanasjl.persistence.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

// @Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student student1 = new Student();
        student1.setFirstName("Ann");
        student1.setLastName("Samoylova");
        student1.setEmail("test@gmail.com");
        /*Student student2 = new Student("Artem", "Bazilev", "test@gmail.com");
        Student student3 = new Student("Artem", "SecondName2","test@gmail.com");
        Student student4 = new Student("Illia", "SecondName3","test@gmail.com");
        Student student5 = new Student("Daria", "SecondName4", "test@gmail.com");
        Student student6 = new Student("Daria", "SecondName5", "test@gmail.com");
        Student student7 = new Student("Maxim", "Petrenko", "test@gmail.com");
        Student student8 = new Student("Maxim", "SecondName7" , "test@gmail.com");
        Student student9 = new Student("New girl", "New girl", "test@gmail.com");
        Student student10 = new Student("Kate", "Tolmacheva", "test@gmail.com");
        Student student11 = new Student("Sonya", "SecondName8", "test@gmail.com");
        Student student12 = new Student("Eva", "SecondName9", "test@gmail.com");*/

        studentRepository.save(student1);
        /*studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);
        studentRepository.save(student9);
        studentRepository.save(student10);
        studentRepository.save(student11);
        studentRepository.save(student12);*/

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Yana");
        teacher1.setLastName("Tereshchenko");
        teacher1.setEmail("email");
        /*Teacher teacher2 = new Teacher("Alice", "Kuznetsova", "");
        Teacher teacher3 = new Teacher("SmbElse", "SoLazyToday", "");*/

        teacherRepository.save(teacher1);
        /*teacherRepository.save(teacher2);
        teacherRepository.save(teacher3);*/

        System.out.println("Tasks " + studentRepository.count());
        System.out.println("Teachers " + teacherRepository.count());
    }
}
