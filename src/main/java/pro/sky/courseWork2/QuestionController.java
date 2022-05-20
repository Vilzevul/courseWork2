package pro.sky.courseWork2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping(path = "/exam")
@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/java/add")
    Question addQuestion(String question, String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping(path = "/adds")
    Question addQuestions(Question question) {
        return questionService.add(question);
    }

    @GetMapping(path = "/java/remove")
    Question removeQuestion(Question question) {
        return questionService.remove(question);
    }

    @GetMapping(path = "/java")
    Collection<Question> getAllQuestion() {
        return questionService.gelAll();
    }

    @GetMapping(path = "/getRandomQuetion")
    Question getRandomQuestion() {
        return questionService.getRandomQuestion();
    }


}
