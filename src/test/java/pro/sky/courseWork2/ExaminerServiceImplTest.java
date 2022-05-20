package pro.sky.courseWork2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    final String QUESTION1 = "Как можно сравнивать объекты?";
    final String QUESTION2 = "Для чего используется оператор NEW";
    final String ANSWER1 = "С помощью метода equals";
    final String ANSWER2 = "Для создания экземпляра класса";


    final List<Question> QUESTIONS = List.of(
            new Question(QUESTION1, ANSWER1),
            new Question(QUESTION2, ANSWER2)
    );


    @Mock
    QuestionService questionService;
    @InjectMocks
    ExaminerServiceImpl out;


    @Test
    public void testGetQuestions() {
        when(questionService.gelAll()).thenReturn(QUESTIONS);
        assertEquals(1, out.getQuestions(1).size());

    }
}