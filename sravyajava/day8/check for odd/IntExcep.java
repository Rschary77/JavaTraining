public class IntExcep {

    int a;

    public void oddnumber(int a) throws OddNumberException {
        this.a = a;

        if (a % 2 != 0) {

            throw new OddNumberException("ita a odd number");


        } else {
            System.out.println("its a even number");
        }
    }
}


