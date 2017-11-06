/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 15:00
 * User:Lee
 */
class Consumer implements Runnable
{
    Structure structure;
    Consumer(Structure structure)
    {
        this.structure = structure;
        this.structure.name="consumer";
    }
    public void run()
    {
        while(true)
        {
            synchronized(structure)
            {
                if(structure.num>0)
                {
                    System.out.println("李晓津要消费第："+structure.num+"个产品!");
                    structure.num--;
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    structure.notifyAll();
                }
                else
                {
                    try {
                        System.out.println("consumer stop!");
                        structure.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

