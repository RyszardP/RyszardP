package homework8;

public class Main {
    public static void main(String[] args) {

        String txt = "He didn’t say any more, but we’ve always been unusually communicative in a reserved way, and I understood" +
                " (* that he meant a great deal more than that. 2 In consequence, I’m inclined to reserve all judgments, a *) " +
                "habit that has opened up many curious natures to me and also made me the victim of not a few veteran 3 " +
                "bores?";

        //Task1
        System.out.println("Task 1");
        System.out.println(Tasks.bigLetters(txt));


        //Task2
        System.out.println("Task 2");
        Tasks.CountSymbol(txt);

        //Task3
        System.out.println("Task 3");
        Tasks.numberOfSum(txt);

        //Task4
        System.out.println("Task 4");
        Tasks.replaceSymbol(txt, 2, "3");

        //Task 5
        System.out.println("Task 5");
        System.out.println(Tasks.deletePart(txt, "(*", "*)"));


        //Task 6
        System.out.println("Task 6");


        //Task 7
        System.out.println("Task 7");
        Tasks.lettersCount(txt);

        //Task 8
        System.out.println("Task 8");
        Tasks.questionMethod(txt,6);

    }
}








