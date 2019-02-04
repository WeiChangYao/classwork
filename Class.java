public class Class{



public static void makeAllWordsH(int k, int maxLetter, String word, List<String> list){
  if ( k < 0){
    list.add(word);
  }
  else{
    for (int count = 0; count < maxLetter; count++){
      makeAllWordsH(k-1, maxLetter, word+((char)(97+count)), list);
    }
  }
}



public static List<String> makeAllWords(int k, int maxLetter){
  List<String> l = new List<String>;
  makeAllWordsH(int k, int maxLetter, String "", List<String> l);
  return l;
}



}
