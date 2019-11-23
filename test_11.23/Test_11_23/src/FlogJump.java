class FlogJump {
    public static void  main(String[] args){
        int x = 6;
        for (int i = 1; i <= x ; i++) {
            System.out.println(Jump(i));
        }
    }

    public static int Jump(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2) {
            return 2;
        }else{
            return Jump(n-1)+Jump(n-2);
        }
    }
}
