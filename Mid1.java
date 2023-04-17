class AddAmount
{
    int amount = 50;
    AddAmount()
    {
        System.out.println("Default Constructor");
        System.out.println(amount);
    }
    AddAmount(int n)
    {
        amount = amount+n;
        System.out.println("Parametrized Constructor");
        System.out.println(amount);
    }
    public static void main(String[] args)
    {
        AddAmount a = new AddAmount();
        AddAmount a2 = new AddAmount(70);
    }
}