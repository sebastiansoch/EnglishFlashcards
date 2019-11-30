/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.soch.sebastian.englishflashcards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ssoch
 */
@Controller
public class QAController {

    @Autowired
    private LessonManager lessonManager;
    private FlashCard flashCard;
            
    @RequestMapping("showQuestion")
    public String showQuestion(Model model) {
        model.addAttribute("question", flashCard.getQuestion());
        model.addAttribute("answer", "................");
        return "questionandanswer";
    }

    @RequestMapping("showAnswer")
    public String showAnswer(Model model) {
        model.addAttribute("question", flashCard.getQuestion());
        model.addAttribute("answer", flashCard.getAnswer());
        return "questionandanswer";
    }

    @RequestMapping("nextFlashCard")
    public String nextFlashCard(Model model) {
        flashCard = lessonManager.getNextFlashCard();
        //TODO - co to ma wlasciwie robic
        return "questionandanswer";
    }
}
