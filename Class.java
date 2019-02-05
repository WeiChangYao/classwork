import java.util.ArrayList;

public class Class{



public static void makeAllWordsH(int k, int maxLetter, String word, ArrayList<String> list){
  if ( k < 0){
    list.add(word);
  }
  else{
    for (int count = 0; count < maxLetter; count++){
      makeAllWordsH(k-1, maxLetter, word+((char)(97+count)), list);
    }
  }
}



public static ArrayList<String> makeAllWords(int k, int maxLetter){
  ArrayList<String> l = new ArrayList<String>();
  makeAllWordsH(k, maxLetter,"", l);
  return l;
}



}
