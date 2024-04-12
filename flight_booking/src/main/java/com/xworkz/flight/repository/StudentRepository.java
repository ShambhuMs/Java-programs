package com.xworkz.flight.repository;

import com.xworkz.flight.dto.StudentDTO;

import java.util.List;

public interface StudentRepository {
    public void save(StudentDTO studentDTO);

    public void saveAll(List<StudentDTO> list);
}
