package cl.kibernum.quiz.controller;

import cl.kibernum.quiz.service.QuizService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


@WebMvcTest(controllers = QuizController.class)
@AutoConfigureMockMvc
class QuizControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private QuizService quizService;

    @Test
    void whenGettingQuizInfoThenReturnQuizInfo() throws Exception {
        when(quizService.getQuizInfo()).thenCallRealMethod();

        this.mockMvc
                .perform(get("/quiz/info")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("This is a quiz intended for evaluating DevOps skills"));

        verify(quizService).getQuizInfo();
    }

    @Test
    void whenGettingAuthorThenReturnAuthor() throws Exception {
        when(quizService.getAuthor()).thenCallRealMethod();

        this.mockMvc
                .perform(get("/quiz/author")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("I am Felipe Cardenas"));

        verify(quizService).getAuthor();
    }

    @Test
    void whenGettingVendorThenReturnVendor() throws Exception {
        when(quizService.getVendor()).thenCallRealMethod();

        this.mockMvc
                .perform(get("/quiz/vendor")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("Powered by Kibernum"));

        verify(quizService).getVendor();
    }
}