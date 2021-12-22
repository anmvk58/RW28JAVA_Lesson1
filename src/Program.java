import java.util.Date;

public class Program {
    public static void main(String[] args) {
        // Khoi tao Department
        Department department = new Department();
        department.departmentId = 1;
        department.departmentName = "Marketing";

        // Khoi tao Position
        Position position = new Position();
        position.positionId = 1;
        position.positionName = PositionName.DEV;

        // Khoi tao Account
        Account account = new Account();
        account.accountId = 1;
        account.email = "anmv1@vpbank.com.vn";
        account.username = "Anmv1";
        account.fullname = "Anmv";
        account.department = department;
        account.position = position;
        account.createDate = new Date();


        // Khoi tao Group
        Group group = new Group();
        group.groupId = 1;
        group.groupName = "CLB Basketball";
        group.creatorAccount = account;
        group.createDate = new Date();

        Account[] listAccount = {account};
        group.listMember = listAccount;

        Group[] listGroup = {group};
        account.listGroup = listGroup;

        // Khoi tao Type Question
        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.typeId = 1;
        typeQuestion.typeQuestionName = TypeQuestionName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeId = 2;
        typeQuestion2.typeQuestionName = TypeQuestionName.MULTIPLE_CHOICE;

        // Khoi tao Category Question
        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.categoryId = 1;
        categoryQuestion.categoryName = "SQL";

        // Khoi tao Question
        Question question = new Question();
        question.questionId = 1;
        question.content = "How to learn Java better ?";
        question.creatorAccount = account;
        question.categoryQuestion = categoryQuestion;
        question.typeQuestion = typeQuestion2;
        question.createDate = new Date();

        // Khoi tao Answer
        Answer answer = new Answer();
        answer.answerId = 1;
        answer.content = "This is an answer for question 1";
        answer.question = question;
        answer.isCorrect = true;

        // Khoi tao Exam
        Exam exam = new Exam();
        exam.examId = 1;
        exam.code = "A123";
        exam.title = "Mid Exam";
        exam.categoryExam = categoryQuestion;
        exam.duration = 90;
        exam.creatorAccount = account;
        exam.createDate = new Date();

        Question[] questions = {question};
        exam.listQuestion = questions;

        Exam[] exams = {exam};
        question.listExam = exams;

        //
    }
}
