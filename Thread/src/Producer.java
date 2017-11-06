/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 14:58
 * User:Lee
 */
class Producer implements Runnable
{
    Structure structure;
    Producer(Structure structure)
    {
        this.structure = structure;
        this.structure.name="producer";
    }
    public void run()
    {
        while(true)
        {
            synchronized(structure)
            {
                if(structure.num<structure.size)
                {
                    structure.num++;
                    System.out.println("Y01已生产第："+structure.num+"个产品!");
                    try {
                        Thread.currentThread().sleep(120);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    structure.notify();
                }
                else
                {
                    try {
                        System.out.println("producer stop!");
                        structure.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


