/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.awt.List;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class CRUDOperation {
    
    public static void main(String[] args) throws ClassNotFoundException{
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MidTermPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        //add 1 district moi 
        
        /*District addDistrict = new District();
        addDistrict.setDistrictid("980");
        addDistrict.setName("Hoa Bin");
        addDistrict.setType("tien d");
        addDistrict.setLocation("Uknown");
        addDistrict.setProvinceid("0008");
        
        // delete 1 district 
        District removeDistrict = em.find(District.class, "975");
        em.remove(removeDistrict);*/
        
        //find 1 district
        District findDistrict = em.find(District.class, "678");
        System.out.println(findDistrict.getDistrictid());
        System.out.println(findDistrict.getLocation());
        
        
        
        //update 1 district 
        /*
        District updateDistrict = em.find(District.class, "976");
        updateDistrict.setDistrictid("977");
        updateDistrict.setProvinceid("36");
        em.merge(updateDistrict);*/
        
        //show tat ca district
        
        
        
        em.getTransaction().commit();
        
        em.close();          
        emf.close();
    }
    
}
