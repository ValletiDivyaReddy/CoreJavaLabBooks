package com.cg.jhlb6.ui;
import java.util.HashMap;
import java.util.Set;
public class GetStudents
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              GetStudents p = new GetStudents();
              stu.put("Div",75);
              stu.put("Navya",76);
              stu.put("Sasi",69);
              stu.put("Cherry",89);
              stu.put("Jaya",98);
              System.out.println(p.getStudent(stu));
       }
}
