package Examples;

public class CheckAlphabetisVowelorConsonant {

    public static void main(String[] args) {

        char Ch = 'A';
        if(Ch=='a'||Ch=='e'||Ch=='i'||Ch=='o'||Ch=='u'||Ch=='A'||Ch=='E'||Ch=='I'||Ch=='O'||Ch=='U'){

            System.out.println("Character is Vowel");
        }
        else {
            System.out.println("Character is consonant");

        }
//        switch (Ch) {
//            case :'A';
//            case :'E';
//            case :'O';
//            case :'I';
//            case :'U'
//                System.out.println("Character is Vowel");
//                break;
//            default:
//                System.out.println("Character is Consonant");
//        }
    }

}
