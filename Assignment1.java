package com.company;

class Assignment1{
    public static void main(String []args){


        // WAP TO PRINT INEURON
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //FOR I
                if(i==0 || i==n-1 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            System.out.print("  ");


            //FOR N
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");


            // FOR E
            for(int j=0;j<n;j++){
                if(i==0 || i==(n-1)/2 || i==n-1 ||j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");


            //FOR U
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 ||i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");


            //FOR R
            for(int j=0;j<n;j++){
                if(j==0 && i>=0 || i==n/2 && j>=0 || i==0 && j>=0 || j==n-1 && i<=n/2 ||i>=(n/2) && i==j ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");


            //FOR O
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");


            //FOR N
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.println(" ");

        }
        System.out.println("------------------------------------------------------------------------------------------------------");


        //WAP TO PRINT NUMERIC PATTERN
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        System.out.println("---------------------------------------------------------------------------");


        // QUESTION 3
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 ||j==n-1 || i+j<=(n-4)/2 ){

                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        System.out.println("---------------------------------------------------------------------------");


        // QUESTION 4
        int w=6;
        for(int i=1;i<=w;i++){

            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(w-i);

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------");


        // QUESTION 5
        int m=14;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 ||i==m-1 || i+j<=(m-1)/2 || i-j>=(m-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
