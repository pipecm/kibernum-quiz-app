package cl.kibernum.quiz.service;

import org.springframework.stereotype.Service;

@Service
public class QuizService {

    public String getQuizInfo() {
        return "This is a quiz intended for evaluating DevOps skills";
    }

    public String getAuthor() {
        return "I am Felipe Cardenas";
    }

    public String getVendor() {
        return "Powered by Kibernum";
    }
}
