package Inlämningsuppgift.FunctionalUppgift1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class RewriteMe {

    public Database database = new Database();
    public List<Question> questions = database.getQuestions();

    //Skriv en funktioner som returnerar hur många frågor det finns i databasen?
    public int getAmountOfQuestionsInDatabase() {
        return (int) questions.stream().count();
    }

    //Hur många frågor finns i databasen för en viss, given kategori (som ges som inparameter)
    public int getAmountOfQuestionsForACertainCategory(Category category) {
        return (int) questions.stream().filter(cat -> cat.getCategory().equals(category)).count();
    }

    //Skapa en lista innehållandes samtliga frågesträngar i databasen
    public List<String> getListOfAllQuestions() {
        return questions.stream().map(Question::getQuestionString).collect(Collectors.toList());
    }

    //Skapa en lista innehållandes samtliga frågesträngar där frågan tillhör en viss kategori
    //Kategorin ges som inparameter
    public List<String> getAllQuestionStringsBelongingACategory(Category category) {
        return questions.stream().filter(cat -> cat.getCategory().equals(category)).map(Question::getQuestionString).collect(Collectors.toList());

    }

    //Skapa en lista av alla svarsalternativ, där varje svarsalternativ får förekomma
    // en och endast en gång i den lista som du ska returnera
    public List<String> getAllAnswerOptionsDistinct() {
        return questions.stream().flatMap(answers -> answers.getAllAnswers().stream()).distinct().sorted().collect(Collectors.toList());

    }


    //Finns en viss sträng, given som inparameter, som svarsalternativ till någon fråga i vår databas?
    public boolean isThisAnAnswerOption(String answerCandidate) {
        return questions.stream().flatMap(answers -> answers.getAllAnswers().stream()).anyMatch(p -> p.equalsIgnoreCase(answerCandidate));

    }

    //Hur ofta förekommer ett visst svarsalternativ, givet som inparameter, i databasen
    public int getAnswerCandidateFrequncy(String answerCandidate) {
        return (int) questions.stream().flatMap(answers -> answers.getAllAnswers().stream()).filter(p -> p.equalsIgnoreCase(answerCandidate)).count();

    }

    //Skapa en Map där kategorierna är nycklar och värdena är en lista
    //av de frågesträngar som tillhör varje kategori
    public Map<Category, List<String>> getQuestionGroupedByCategory() {
        Map<Category, List<String>> questionMappedByCategory = questions.stream().collect(groupingBy(Question::getCategory, mapping(q -> {
            if (q.getCategory().equals(Category.FOOD))
                return q.getQuestionString();
            else if (q.getCategory().equals(Category.CHEMISTRY))
                return q.getQuestionString();
            else
                return q.getQuestionString();
        }, toList())));
        return questionMappedByCategory;
    }

    //Skapa en funktion som hittar det svarsalternativ som har flest bokstäver, i en kategori, given som inparameter
    // OBS: Du måste använda Reduce!
    public String getLongestLettercountAnwerInAGivenCategory(Category c) {
        return String.valueOf(questions.stream().filter(cat -> cat.getCategory().equals(c)).flatMap(answers -> answers.getAllAnswers().stream()).reduce("",(a, b) -> {
            if (a.length() > b.length()) return a;
            return b;
        }));
    }


    public static void main(String[] args) {
        RewriteMe uppg4 = new RewriteMe();
    }

}
