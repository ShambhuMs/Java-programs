package com.xworkz.runner;

import com.xworkz.dto.DamDTO;
import com.xworkz.service.DamService;
import com.xworkz.service.DamServiceImplementation;

public class DamRunner {
    public static void main(String[] args) {
        DamDTO damDTO=new DamDTO("Dharma Dam","Dharma colony","Karnataka",2000);
        DamDTO damDTO1=new DamDTO("KRS","Mysore","Kar",10000);
        DamService damService=new DamServiceImplementation();
       // damService.insert(damDTO1);

      //  damService.update("Dharma ","Malgi","Karnataka");
        DamDTO damDTO2=damService.select("KRS");
        if(damDTO2==null){
            System.out.println("There are no dams");
        }else {
            System.out.println(" dame name is : "+damDTO2.getName());
        }
    }
}
