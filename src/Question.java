import java.util.Date;

public class Question {
    int questionId;
    String content;
    CategoryQuestion categoryQuestion;
    TypeQuestion typeQuestion;
    Account creatorAccount;
    Date createDate;
    Exam[] listExam;
}
