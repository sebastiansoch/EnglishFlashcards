/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.soch.sebastian.englishflashcards;

import com.gmail.soch.sebastian.englishflashcards.data.FlashCardDTO;
import com.gmail.soch.sebastian.englishflashcards.data.LessonsDAOFake;
import com.gmail.soch.sebastian.englishflashcards.data.LessonsDAOIntf;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author ssoch
 */

@Component
public class LessonManager {

    private List<FlashCard> flashCards;
    private static int flashCardIdx = 0;
    
    @Autowired
    @Qualifier ("fake")
    private LessonsDAOIntf lessonsDAO;

    FlashCard getNextFlashCard() {
        if (flashCards == null) {
            prepareLesson();
        }

        return flashCards.get(flashCardIdx++);
    }

    private void prepareLesson() {
        flashCards = new ArrayList<>();
        List<FlashCardDTO> flashCardsDAO = lessonsDAO.getLesson();

        for (FlashCardDTO flashCardDTO : flashCardsDAO) {
            flashCards.add(new FlashCard(flashCardDTO.getQuestion(), flashCardDTO.getAnswer()));
        }
    }

}
