package class_and_OOP.thucHanh;

public class StopWatch {
     private long starTime;
     private long endTime;
    public long getStarTime(){
        return this.starTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public long starTime(){
        return this.starTime=System.currentTimeMillis();
    }
    public long star(){
       return this.starTime=System.currentTimeMillis();
    }
     public long end(){
        return this.endTime=System.currentTimeMillis();

     }
     public long getElapseTime(){
        return this.endTime-this.starTime;
     }

    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.star();
        for (int i=0;i<100000;i++){
            System.out.println(i);
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapseTime());
    }

}
