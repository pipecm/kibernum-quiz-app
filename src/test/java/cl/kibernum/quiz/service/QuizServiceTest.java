package cl.kibernum.quiz.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuizServiceTest {

    private QuizService quizService;

    @BeforeEach
    public void setUp() {
        quizService = new QuizService();
    }

    @Test
    void whenGettingQuizInfoThenReturnQuizInfo() {
        assertThat(quizService.getQuizInfo()).contains("DevOps skills");
    }

    @Test
    void whenGettingAuthorThenReturnAuthor() {
        assertThat(quizService.getAuthor()).contains("Felipe Cardenas");
    }

    @Test
    void whenGettingVendorThenReturnVendor() {
        assertThat(quizService.getVendor()).contains("Kibernum");
    }
}