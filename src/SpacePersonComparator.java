import java.util.Comparator;

public class SpacePersonComparator implements Comparator<Person> {
    @Override
    public  int compare(Person o1, Person o2){
        if (o1.getExperience() > o2.getExperience()){
            return -1;
        } else  if (o1.getExperience() < o2.getExperience()) {
            return 1;
        }
//        if(o1.getName().length() - o1.getName().toLowerCase().replaceAll("[Ss]", "").length() >
//                o2.getName().length() - o2.getName().toLowerCase().replaceAll("[Ss]", "").length()){
//            return -1;
//        } else  if(o1.getName().length() - o1.getName().toLowerCase().replaceAll("[Ss]", "").length() <
//                o2.getName().length() - o2.getName().toLowerCase().replaceAll("[Ss]", "").length()) {
//            return 1;
//        }
        // УПРОЩАЕМ методом
        if (countOccurrences( o1)   > countOccurrences(o2) ){
            return -1;
        }else if(countOccurrences(o1) < countOccurrences(o2)){
            return 1;
        }
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }

    public int countOccurrences(Person o){
        return o.getName().length() - o.getName().replaceAll("[Ss]", "").length();
    }
}
