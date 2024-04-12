package com.xworkz.flight.service;

import com.xworkz.flight.dto.StudentDTO;
import com.xworkz.flight.repository.StudentRepImplementation;
import com.xworkz.flight.repository.StudentRepository;

import java.util.List;

public class StudentServiceImplementation implements StudentService{
    StudentRepository studentRepository=new StudentRepImplementation();

    @Override
    public void saveall(List<StudentDTO> student) {
        boolean validBookig=true;
        for (StudentDTO studentDTO:student) {
            if (studentDTO.getName().isEmpty()){
                System.out.println("please enter name");
                validBookig=false;
            }
        }
        if (!validBookig){
            return;
        }
        studentRepository.saveAll(student);
    }

    @Override
    public void save(StudentDTO studentDTO) {
      StudentService studentService=new StudentServiceImplementation();
        if(studentDTO.getName().isEmpty()){
            System.out.println("Please enter name..");
        }
        else {
            studentRepository.save(studentDTO);
        }
    }
}
