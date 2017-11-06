/**
 * @author aolish333@gmail.com
 * @date 2017/11/4 15:04
 * User:Lee
 */
public class Test
{
    public static void main(String[] args)
    {
        Structure structure = new Structure();
        new Thread(new Producer(structure)).start();
        new Thread(new Consumer(structure)).start();
    }
}
