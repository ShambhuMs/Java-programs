package com.xworkz.flight.runner;

import com.xworkz.flight.dto.StudentDTO;
import com.xworkz.flight.service.StudentService;
import com.xworkz.flight.service.StudentServiceImplementation;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        StudentDTO studentDTO=new StudentDTO(2,"shambhu","BCA",3);
        StudentService studentService=new StudentServiceImplementation();
  //      studentService.save(studentDTO);
        StudentDTO studentDTO1=new StudentDTO(3,"Asis","Msc",4);
        StudentDTO studentDTO2=new StudentDTO(4,"Nitin","B.com",2);
        List<StudentDTO> list=new ArrayList<>();
        list.add(studentDTO1);
        list.add(studentDTO2);
        studentService.saveall(list);
            }
}
