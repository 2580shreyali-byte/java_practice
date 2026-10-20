class Solution {
    public int dayOfYear(String date) {
        String y = date.substring(0,4);
        int Y = Integer.parseInt(y);
        int days =0;
        if((Y%4==0 && Y%100!=0) || Y%400==0){
            days = 366;
        }
        else
        days = 365;
        int d =0;
        String Date = date.substring(8,10);
        int D = Integer.parseInt(Date);
        String m = date.substring(5,7);
        int M = Integer.parseInt(m);
            switch(M){
                case 01 : d = D;
                break;
                case 02 : d = 31+D;
                break;
                case 03 :  {
                         if(days==365) d = 59+D;
                            else d = 60+D;
                }
                break;
                case 04 : {
                         if(days==365) d = 59+31+D;
                            else d = 60+31+D;
                }
                break;
                case 05 : {
                         if(days==365) d = 90+30+D;
                            else d = 91+30+D;
                }
                break;
                case 06 : {
                         if(days==365) d = 120+31+D;
                            else d = 121+31+D;
                }
                break;
                case 07 : {
                         if(days==365) d = 151+30+D;
                            else d = 152+30+D;
                }
                break;
                case 8 : {
                         if(days==365) d = 181+31+D;
                            else d = 182+31+D;
                }
                break;
                case 9 : {
                         if(days==365) d = 212+31+D;
                            else d = 213+31+D;
                }
                break;
                case 10 : {
                         if(days==365) d = 243+30+D;
                            else d = 244+30+D;
                }
                break;
                case 11 : {
                         if(days==365) d = 273+31+D;
                            else d = 274+31+D;
                }
                break;
                case 12 : {
                         if(days==365) d = 304+30+D;
                            else d = 305+30+D;
                }
        }
        return d;
    }
}