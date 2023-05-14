public class LessonThree {
    public static void main(String[] args) {

        //String methods 

        String name = "   Hello   World  !";
        
        System.out.println(name.equals(name));
        System.out.println(name.equals("Hello World!"));
        String[] split = name.split("o",2);
        
        for (String string : split) {
            System.out.println(string);
        }

        System.out.println(name.join("*","Hello","World","!"));

        System.out.println(name.charAt(5));

        System.out.println(name.codePointAt(5));

        System.out.println(name.codePointBefore(5));

        System.out.println(name.codePointCount(5, 7));

        System.out.println(name.compareTo("Hello"));

        System.out.println(name.compareToIgnoreCase("   hello   world  !"));

        System.out.println(name.concat("World Hello!"));

        System.out.println(name.contains("Hell"));

        System.out.println(name.contentEquals(name));

        System.out.println(name.endsWith("!"));

        System.out.println(name.hashCode());

        System.out.println(name.trim());

        System.out.println(name.isBlank());

        System.out.println(name.isEmpty());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.substring(5));

        System.out.println(name.length());

        System.out.println(name.repeat(3));

        System.out.println(name.replace("H", "J"));

        System.out.println(name.toCharArray());

        System.out.println(name.stripTrailing());

        System.out.println(name.stripLeading());

        System.out.println(name.replaceAll("Hello", "Jello"));


    }
}
