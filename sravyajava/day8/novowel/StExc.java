public class StExc {
    String s;
    public void vowels(String s) throws  NovowelException
    {
        this.s=s;
        for(int i=0; i<=s.length(); i++)

       if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)==i ||s.charAt(i)=='o'|| s.charAt(i)=='u')
        {
            System.out.println("string has vowels");
        }
        else {
            System.out.println("string has no vowels");
        }
    }


}
