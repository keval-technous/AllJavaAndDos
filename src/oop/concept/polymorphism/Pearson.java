package oop.concept.polymorphism;

/**
 * Polymorphism in Java is the task that performs a single action in different ways.
 * Polymorphism cover method overloading and method overriding
 */
public class Pearson {
    public String speaking(String language)
    {
        return language;
    }
    public String speaking(String ... language)
    {
        String planguage="";
        String lang[]=new String[language.length];
        for(int i=0;i<language.length;i++)
        {
            lang[i]=language[i];
            planguage=planguage+" " +lang[i];
        }
        return planguage;
    }
}
class TechnousEmployee extends Pearson
{
    public String speaking(String language)
    {
        return language+"English";
    }
}
