package com.xworkz.repository;

import com.xworkz.dto.DamDTO;

public interface DamRepository {
    public void insert(DamDTO damDTO);
    public void update(String name,String place,String state);
    public DamDTO select(String name);
}
