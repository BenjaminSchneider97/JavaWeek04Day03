package Advanced_A6;

/**
 * You are hired by the Austrian government to help reduce tensions and smooth the operation of government.
 *
 * You will be paid 1 million € in taxpayer money to do the following:
 *
 * 1. Make a static method “calmString” that will take a String representing a speech, and remove all the exclamation
 * marks and all mention of the word “Ibiza” (IBIZA, ibiza, and Ibiza should disappear). If you pass in null,
 * the method should return null.
 *
 * 2. Use JUnit to test it.
 *
 * 3. Make a static method “calmAttendees” that will take a List of political parties members invited to social events.
 * It can contain “SPÖ”, “ÖVP”, “Grüne”, “FPÖ”, “NEOS” and “PILZ” elements.
 *
 * If the list contains both "FPÖ" and "Grün", it should remove one of the two, but do so at random (i.e., half the
 * time removing "FPÖ" and half the time removing "Grüne"). Otherwise it should leave the List unchanged. If you pass
 * in null, the method should do nothing.
 *
 * 4. Use JUnit to test it.
 *
 * Note: Use for instance this list:
 * https://en.wikipedia.org/wiki/List_of_members_of_the_European_Parliament_for_Austria,_2014%E2%80%9319
 */
public class Main {

    public static String calmString(String speech){
        String result = speech.replaceAll("(?i)ibiza", "");
        result = result.replaceAll("!", "");
        result = result.replaceAll("  ", " ");
        return result;
    }

    public static void main(String[] args) {
        String speech = "In IBIZA is es wunderschön! Den Namen kann man auch so (Ibiza) schreiben! Oder aber auch ibiza Sterne!";
        String newSpeech = calmString(speech);
        System.out.println(newSpeech);

    }
}
