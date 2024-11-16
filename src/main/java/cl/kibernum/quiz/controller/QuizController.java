package cl.kibernum.quiz.controller;

import cl.kibernum.quiz.service.QuizService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@AllArgsConstructor
public class QuizController {

    private final QuizService quizService;

    @GetMapping("/info")
    public ResponseEntity<String> getQuizInfo() {
        return ResponseEntity.ok(quizService.getQuizInfo());
    }

    @GetMapping("/author")
    public ResponseEntity<String> getAuthor() {
        return ResponseEntity.ok(quizService.getAuthor());
    }

    @GetMapping("/vendor")
    public ResponseEntity<String> getVendor() {
        return ResponseEntity.ok(quizService.getVendor());
    }
}

