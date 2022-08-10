package org.DouifiAbdellah.EmployeeManager;

public class PlayWithMain {

    public static void main(String[] args) {
       /* String s = "https:/j/www.bootdey.com/img/Content/avatar/avatar2.png";

        String ele[]=s.split("/");
        String employeeImg  = ele[0].substring(0, ele[0].lastIndexOf("g")).trim();
        System.out.print("imgFile name:"+ employeeImg);*/
        String str = "https://www.bootdey.com/img/Content/avatar/avatar2.png";
        String[] Allwords = str.split("//");
        String[] words = Allwords[1].split("/");
        String employeeImg  = words[4].substring(0, words[4].lastIndexOf(".")+4).trim();
        System.out.println(" last one is "+employeeImg);
        for (String word : words) {
            System.out.println(word );


        }
    }
}
