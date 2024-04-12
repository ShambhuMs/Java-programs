package com.xworkz.service;

import com.xworkz.dto.DamDTO;
import com.xworkz.repository.DamRepository;
import com.xworkz.repository.DamRepositoryImplementation;

public class DamServiceImplementation implements DamService{
    DamRepository damRepository=new DamRepositoryImplementation();

    @Override
    public DamDTO select(String name) {
        if (name==null){
            System.out.println("Please enter name");
        }
        else{
          DamDTO damDTO=  damRepository.select(name);
          return damDTO;
        }
        return null;
    }

    @Override
    public void update(String name, String place, String state) {
        if(name==null || place==null || state==null){
            System.out.println("Please enter valid data..");
        }
        else{
            damRepository.update(name, place, state);
        }
    }

    @Override
    public void insert(DamDTO damDTO) {
        if (damDTO.getName()==null){
            System.out.println("Please enter Name...");
        }
        else{
            damRepository.insert(damDTO);
        }
    }
}
