package Lab11;

public class Main {

    public static <E> void  sid  (String s, E [] arr){

        E [] a = arr;
        AnyTypeArray<E> sid = new AnyTypeArray<E>();
        sid.setArr(a);

        System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();
    }

    public static void main(String [] args){

        String [] str = {"Hello", "World","!"};
        sid("String type:" , str);

        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer type:" , intr);

        Double [] doub = {1.2,1.5,6.7};
        sid("Double type:" , doub);

        Boolean [] bool = {true,false,true};
        sid("Boolean type:" , bool);
    }

}