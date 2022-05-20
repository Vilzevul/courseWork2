package pro.sky.courseWork2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    final String QUESTION1 = "Как можно сравнивать объекты?";
    final String QUESTION2 = "Для чего используется оператор NEW";
    final String ANSWER1 = "С помощью метода equals";
    final String ANSWER2 = "Для создания экземпляра класса";

    QuestionService out = new JavaQuestionService();

    List<Question> questions = List.of(
            new Question(QUESTION1, ANSWER1),
            new Question(QUESTION2, ANSWER2)
    );

    @Test
    void testAdd1() {

        Question actual = out.add(questions.get(1));
        Question Expected = questions.get(1);
        assertEquals(Expected, actual);
    }

    @Test
    void testAdd2() {
        Question Expected = questions.get(1);
        assertEquals(Expected, out.add(Expected));
    }

    @Test
    void remove() {
        Question Expected = questions.get(1);
        Question actual = out.remove(questions.get(1));
        assertEquals(Expected, actual);
    }

    @Test
    void gelAll() {
        List<Question> Expected = questions;
        List<Question> actual = (List<Question>) out.gelAll();
        assertFalse(Expected.equals(actual));
        assertNotEquals(Expected, actual);
    }

    @Test
    void getRandomQuestion() {
        Question Expected = questions.get(1);
        Question actual = out.getRandomQuestion();
        if (Expected.equals(actual))
            assertTrue(Expected.equals(actual));
        else
            assertFalse(Expected.equals(actual));
    }
}