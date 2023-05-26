package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
       String str = "";
       int i= 0;
       while(i< chars.length){
           str += chars[i];
           i++;
       }
        System.out.print(str);
    }
}
