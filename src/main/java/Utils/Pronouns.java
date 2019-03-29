package Utils;

import java.util.Random;

public class Pronouns {
    Verbs verbs = new Verbs();

    public String randomPronounEanglish() {
        String[] arrayPronouns = {"I", "You", "We", "They", "He", "She"};

        return arrayPronouns[new Random().nextInt(6)];
    }
    public String randomPronounRussian() {
        String [] arrayPronouns = {"Я", "Ты", "Мы", "Они", "Он", "Она"};



        int pronoun = new Random().nextInt(6);
        int questionOrNot = new Random().nextInt(3);
        String s = null;
        String dont = " не ";
        String question = "";

        if(questionOrNot != 0){
            dont = " ";
        }
        if (questionOrNot == 1){
            question = "?";
        }


        switch (pronoun) {
            case 0:
            s = arrayPronouns[0] + dont + verbs.takeOneVerb(verbs.getArrayVerbsI(), new Random().nextInt(71));
            break;
            case 1:
                s = arrayPronouns[1] + dont + verbs.takeOneVerb(verbs.getArrayVerbsYou(), new Random().nextInt(71));
                break;
            case 2:
                s = arrayPronouns[2] + dont + verbs.takeOneVerb(verbs.getArrayVerbsWe(), new Random().nextInt(71));
                break;
            case 3:
                s = arrayPronouns[3] + dont + verbs.takeOneVerb(verbs.getArrayVerbsThey(), new Random().nextInt(71));
                break;
            case 4:
                s = arrayPronouns[4] + dont + verbs.takeOneVerb(verbs.getArrayVerbsHe(), new Random().nextInt(71));
                break;
            case 5:
                s = arrayPronouns[5] + dont + verbs.takeOneVerb(verbs.getArrayVerbsShe(), new Random().nextInt(71));
                break;
        }
        return s + question;
    }
}
