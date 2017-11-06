/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 15:31
 * User:Lee
 */
public class ProcessOfPCB implements Comparable<ProcessOfPCB> {
    double weightWholeTime;
    String processName;
    int state;
    int beginTime;

    @Override
    public String toString() {
        return "ProcessOfPCB{" +
                "weightWholeTime=" + weightWholeTime +
                ", processName='" + processName + '\'' +
                ", state=" + state +
                ", beginTime=" + beginTime +
                ", finishTime=" + finishTime +
                ", priority=" + priority +
                ", wholeTime=" + wholeTime +
                ", arrivalTime=" + arrivalTime +
                ", askTime=" + askTime +
                ", usedTime=" + usedTime +"\n"+
                '}';
    }

    int finishTime;
    int priority;
    int wholeTime;
    int arrivalTime;
    int askTime; // 要求运行时间
    int usedTime;

    public double getWeightWholeTime() {
        return weightWholeTime;
    }

    public void setWeightWholeTime(double weightWholeTime) {
        this.weightWholeTime = weightWholeTime;
    }

    public int getWholeTime() {
        return wholeTime;
    }

    public void setWholeTime(int wholeTime) {
        this.wholeTime = wholeTime;
    }


    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getAskTime() {
        return askTime;
    }

    public void setAskTime(int askTime) {
        this.askTime = askTime;
    }

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * 每个进程有一个进程控制块（PCB）表示。进程控制块可以包含如下信息：进程名、优先数、到达时间、需要运行时间、已用CPU时间、进程状态等等。
     */


    public ProcessOfPCB(String processName, int askTime, int arrivalTime) {
        this.processName = processName;
        this.askTime = askTime;
        this.arrivalTime = arrivalTime;
    }


    public ProcessOfPCB(String processName, int state, int askTime, int priority) {
        this.processName = processName;
        this.state = state;
        this.askTime = askTime;
        this.priority = priority;
    }


    @Override
    public int compareTo(ProcessOfPCB o) {
        if (o != null) {
            if (this.getAskTime() > o.getAskTime())
                return 1;
            if (this.getAskTime() == o.getAskTime())
                return 1;
        }
        return -1;
    }
}
