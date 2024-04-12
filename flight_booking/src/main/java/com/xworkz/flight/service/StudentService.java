package com.xworkz.flight.service;

import com.xworkz.flight.dto.Flightbooking;
import com.xworkz.flight.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    public void save(StudentDTO studentDTO);
    public void saveall(List<StudentDTO> student);

}
