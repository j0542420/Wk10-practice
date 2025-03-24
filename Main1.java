public class Main1 {
    String name = "";
    int age = 18;
    static int count = 0;

    public Main1(String aName, int anAge) 
    {
        name = aName;
        age = anAge;
        count++;
    }
    public int getAge()
    {
        return age;
    }
    public String getName ()
    {
        return name;
    }
    public static int getCount()
    {
        return count;
    }
    public static void main(String[] args)
    {
        //create object using loop
        Main1 p; // declare a dummy object, object has null value
        // System.out.println(p.getAge());

        Main1[] persons = new Main1[5];
        for(int i=0; i<5; i++)
        {
            persons[i] = new Main1("name " + i,20+i);
            
            System.out.println("p" +i+ " "+p.getCount());
        }
        System.out.println(Main1.getCount());
        System.out.println("p"+0+ " "+ persons[0].getAge());
    }

}
