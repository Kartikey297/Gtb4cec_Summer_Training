package Day_1;

public class Operators {
    public static void main(String[] args) {
        //1. Arithematic operators
        int a=2, b=3;
        //+, -, *, /, %, ++< --
        a=a+b; //5
        b=b+a; //8
        a=a-b; // -3
        b=b-a; // 11
        ++a; a++; --b; b--;
        //2. Comparison Operators
        // >, <, !=, ==,, <=, >=
        //3. Logical operatos: &&, ||, !
        if((a>b || a<10));
        //4. Assigment Operators:
        int x=2;
        x+=3; //x=x+3;
        x-=3; //x =x-3;
        x*=3; // x=x*3;
        x/=3; // x=x/3;
        x %=3; //x=x%3;
        int sum=0;
        for(int i=1;i<=25;i++){
            sum=sum+i;
            System.out.print(sum+" ,");
        }
    }

}
