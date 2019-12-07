/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.soch.sebastian.englishflashcards.data;

import com.gmail.soch.sebastian.englishflashcards.entity.FlashCard;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Component;

/**
 *
 * @author ssoch
 */
@Component (value = "db")
public class LessonsRepo implements LessonsDAOIntf {

    @PersistenceUnit
    private EntityManagerFactory emf;
    
    public void addFlashCard(FlashCard flashCard) {
        emf.createEntityManager().persist(flashCard);
    }
    
    public FlashCard getFlashCardById(int id) {
        return emf.createEntityManager().find(FlashCard.class, id);
    }
    
    @Override
    public List<FlashCardDTO> getLesson() {
        List<FlashCardDTO> list =  new ArrayList<>();
        FlashCard fc = getFlashCardById(1);
        list.add(new FlashCardDTO(fc.getId(), fc.getQuestion(), fc.getAnswer()));
        return list;
    }
    
}
