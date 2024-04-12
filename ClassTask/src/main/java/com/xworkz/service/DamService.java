package com.xworkz.service;

import com.xworkz.dto.DamDTO;

public interface DamService {
    public void insert(DamDTO damDTO);
    public void update(String name, String place,String state);
    public DamDTO select(String name);
}
