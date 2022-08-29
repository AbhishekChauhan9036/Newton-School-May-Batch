class AdderII{
    int num1;
    int num2;
    AdderII()
    {
        this.num1=0;
        this.num2=0;
    }
    AdderII(int a, int b)
    {
        num1=a;
        num2=b;
    }
    int add(int a, int b, int c)
    {
        num1=num1+a;
        num2=num2+b;
        return (num1+num2 - 2*c);
    }
    int add()
    {
        return num1+num2;
    }
    int add(int a, int b)
    {
        return a+b;
    }
}