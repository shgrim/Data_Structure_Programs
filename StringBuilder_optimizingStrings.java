package Programs;

public class StringBuilder_optimizingStrings {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();//not creating new objects unlike normal string and so it saves memory.
        for(int i=0;i<26;i++)
        {
            char a=(char)('a'+i);
            s.append(a);
        }
        System.out.println(s);
 /*       s.append();
        s.compareTo();
        s.delete();
        s.deleteCharAt();
        s.indexOf();
        s.insert();
        s.lastIndexOf();
        s.reverse();
        s.getClass();
        s.capacity();
        s.toString();
        s.charAt();
        s.isEmpty();
        s.substring();
        s.hashCode();
        s.equals();
        s.length();
        s.setLength();
        s.trimToSize();
        s.chars();
        s.trimToSize();
        */
    }
}