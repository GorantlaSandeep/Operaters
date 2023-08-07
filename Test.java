class Account{
    static int Total= 999;
    static int min_Bal= 500;
    public static void main(String[] args){
        
       Account a1= new Account();

        System.out.println(Total);

        
        System.out.println(a1.Total);
            
        
        min_Bal = 20000;
        a1.min_Bal = 15000;
        Account.min_Bal = 25000;
        System.out.println(min_Bal);
    }
       
        
       

            
}
