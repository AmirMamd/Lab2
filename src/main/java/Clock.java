public class Clock {
    public String clkFunctionalities(String x){
        String [] arr= new String[x.length()];
        for(int i=0;i<x.length();i++){
            arr[i]=x.substring(i,i+1);
        }
        int m=0,h=0,D=1,M=1,Y=2000,MHDMY=0;
        boolean Chime=false;
        String State= "Normal",State1="Time";
        for(int i=0;i<arr.length;i++){
            switch(State){
                case "Normal":
                    if(arr[i].equals("a")){
                        if(State1.equals("Time")){
                            State1="Date";
                            DisplayDate(Y,M,D);
                            return Y+"-"+M+"-"+D;
                        }else{
                            State1="Time";
                            DisplayTime(h,m);
                            return h+":"+m;
                        }
                    }else if(arr[i].equals("b")){
                        State="Alarm";
                    }else if(arr[i].equals("c")){
                        State="Update";
                    }
                    break;
                case "Update":
                    if(arr[i].equals("b") && MHDMY==0){
                        m++;
                        if(m>60){
                            m=0;
                            h++;
                        }
                    }else if(arr[i].equals("b") && MHDMY==1){
                        h++;
                        if(h>24){
                            h=0;
                            D++;
                        }
                    }else if(arr[i].equals("b") && MHDMY==2){
                        D++;
                        if(D>31){
                            D=1;
                            M++;
                        }
                    }
                    else if(arr[i].equals("b") && MHDMY==3){
                        M++;
                        if(M>12){
                            M=1;
                            Y++;
                        }
                    }
                    else if(arr[i].equals("b") && MHDMY==4){
                        Y++;
                        if(Y>2100){
                            Y=2000;
                        }
                    }
                    else if(arr[i].equals("a")){
                        MHDMY++;
                        if(MHDMY==4){
                            State="Normal";
                        }
                    }
                    else if(arr[i].equals("d")){
                        State="Normal";
                    }
                    break;
                case "Alarm":
                    if(arr[i].equals("a")){
                        Chime=true;
                    }else if(arr[i].equals("d")){
                        State="Normal";
                    }
                    break;
            }
        }
        return null;
    }
    public void DisplayDate(int Y, int M, int D) {
        System.out.println(Y+"-"+M+"-"+D);

    }
    public void DisplayTime(int h, int m) {
        System.out.println(h+":"+m);

    }
}
