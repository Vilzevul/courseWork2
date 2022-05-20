package pro.sky.courseWork2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    List<Question> questions = new ArrayList<>(List.of(
            new Question("Учитывается ли в Java регистр букв в названиях переменных и классов, командах и т.п.?", "Да"),
            new Question("Чем является ключевое слово «public»?", "модификатором доступа"),
            new Question("Как называется метод, с выполнения которого виртуальная машина Java начинает свою работу? ?", "main"),
            new Question("Как по другому называют параметры методов? ", "Аргументы"),
            new Question("Какой язык программирования лежит в основе Java?", "С++"),
            new Question("Для чего изначально разрабатывался язык программирования Java? ", "Для программирования бытовых устройств"),
            new Question("Скольки битовым типом является short?", "16"),
            new Question("Сколько займет памяти переменная, если в качестве типа ей указать Integer?", "16 байт"),
            new Question("Какое ключевое слово используется для объявления константы в языке Java?", "final"),
            new Question("Инкремент — это ...", "Инкремент — это ...")));


    @Override
    public Question add(String question, String answer) {
        Question quest = new Question(question, answer);
        questions.add(quest);
        return quest;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> gelAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random rand = new Random();
        int collect = questions.size();
        int randomIndex = rand.nextInt(collect);
        return questions.get(randomIndex);
    }
}
