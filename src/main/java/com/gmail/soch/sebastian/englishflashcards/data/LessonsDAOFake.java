/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.soch.sebastian.englishflashcards.data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author ssoch
 */
@Component (value = "fake")
public class LessonsDAOFake implements LessonsDAOIntf{

    @Override
    public List<FlashCardDTO> getLesson() {
        List<FlashCardDTO> flashCardsDTO = new ArrayList<>();
        flashCardsDTO.add(new FlashCardDTO(0, "Drzwi", "Door"));
        flashCardsDTO.add(new FlashCardDTO(0, "Okno", "Window"));
        flashCardsDTO.add(new FlashCardDTO(0, "Jabłko", "Apple"));
        flashCardsDTO.add(new FlashCardDTO(0, "Biec", "Run"));
        
        return flashCardsDTO;
    }
    
}
