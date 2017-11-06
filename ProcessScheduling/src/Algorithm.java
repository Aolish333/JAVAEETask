import java.util.*;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 15:45
 * User:Lee
 */
public class Algorithm {
    List<ProcessOfPCB> processOfPCBS = new ArrayList<>();

    /**
     * 完成时间=上一个进程的执行时间+服务时间。程序中上一个服务时间是preFinished。
     周转时间=完成时间-到达时间。
     带权周转时间=周转时间/服务时间。
     */
    /**
     * 1、首先按照进程到达的顺序进行排序
     * 2、
     */
    public void FCFS() {
        //进行排序
        Collections.sort(processOfPCBS);
//        for (ProcessOfPCB p : processOfPCBS) {
//            System.out.println(p.toString());
//        }
        // 转化为数组
        ProcessOfPCB[] p = (ProcessOfPCB[]) processOfPCBS.toArray(new ProcessOfPCB[processOfPCBS.size()]);

        for (int i = 0; i < p.length; i++) {
            //计算完成时间
            if (i == 0) {
                p[i].finishTime = p[i].arrivalTime + p[i].askTime;
            } else {
                if (p[i].arrivalTime > p[i - 1].finishTime) {
                    p[i].finishTime = p[i].arrivalTime + p[i].askTime;
                    p[i].beginTime = p[i].arrivalTime;
                } else {
                    p[i].finishTime = p[i].askTime + p[i - 1].finishTime;
                    p[i].beginTime = p[i - 1].finishTime;
                }
            }
            p[i].wholeTime=p[i].finishTime-p[i].arrivalTime;
            p[i].weightWholeTime=(double)p[i].wholeTime/(double)p[i].askTime;
        }
        System.out.println(Arrays.toString(p));
    }
    //短作业优先算法
    public void SJF(){

        //当前时间
        int now=0;
        //待处理list
        List<ProcessOfPCB> list=new LinkedList<>();
        //结果list
        List<ProcessOfPCB> res=new LinkedList<>();
        //按时间对进程进行排序
        Collections.sort(processOfPCBS);
        ProcessOfPCB[] p =  processOfPCBS.toArray(new ProcessOfPCB[processOfPCBS.size()]);
        //处理第一个进程
        p[0].finishTime=p[0].arrivalTime+p[0].askTime;
        p[0].wholeTime=p[0].finishTime-p[0].arrivalTime;
        p[0].weightWholeTime=p[0].wholeTime/p[0].askTime;
        res.add(p[0]);

        now=p[0].finishTime;

        //将剩余进程添加进待处理list
        for(int i=1;i<p.length;i++){
            list.add(p[i]);
        }

        while(list.size()!=0){
            ProcessOfPCB next=FindNextPro(list, now);
            if(next.arrivalTime>now){
                next.finishTime=next.arrivalTime+next.askTime;
                next.beginTime=next.arrivalTime;
            }else{
                next.finishTime=now+next.askTime;
                next.beginTime=now;
            }
            now=next.finishTime;
            next.wholeTime=next.finishTime-next.arrivalTime;
            next.weightWholeTime=(double)next.wholeTime/(double)next.askTime;
            res.add(next);
        }
        for (ProcessOfPCB l : res) {
            System.out.println(l.toString());
        }
    }

    private ProcessOfPCB FindNextPro(List<ProcessOfPCB> list, int now) {
        ProcessOfPCB pro=list.get(0);
        int index=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i).askTime<pro.askTime&&list.get(i).arrivalTime<now){
                pro=list.get(i);
                index=i;
            }
        }
        list.remove(index);
        return pro;
    }

    /**
     * 输入数据
     * 线程名称、要求服务时间、到达时间
     */

    public void inputData() {
        processOfPCBS.add(new ProcessOfPCB("1", 2, 5));
        processOfPCBS.add(new ProcessOfPCB("2", 4, 1));
        processOfPCBS.add(new ProcessOfPCB("3", 5, 2));
        processOfPCBS.add(new ProcessOfPCB("4", 6, 4));
        processOfPCBS.add(new ProcessOfPCB("5", 8, 3));
    }
}
