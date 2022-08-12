class Calculation{
    void fact(int fnum){
        int factorail = 1;
        for(int i = fnum; i >=1;i--){
            factorail = factorail * i;
        }
        System.out.println("Factorial is : " + factorail);
    }
}