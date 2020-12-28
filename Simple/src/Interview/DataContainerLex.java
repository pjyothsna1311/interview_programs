package Interview;

public class DataContainerLex {

    private int intData;

    synchronized public  int get() {
        return intData;
    }

    synchronized public  void put(int value) {
        intData = value;
    }
}

class Producer extends Thread {
    DataContainerLex dataContainerLex ;

    Producer(DataContainerLex dataContainerLex){
        this.dataContainerLex = dataContainerLex;
    }

    public void run() {
        dataContainerLex.put(10);
    }

}

class Consumer extends Thread {
    DataContainerLex dataContainerLex ;

    Consumer(DataContainerLex dataContainerLex){
        this.dataContainerLex = dataContainerLex;
    }

    public void run() {
        System.out.println(dataContainerLex.get());
    }

}

class TestProducerConsumer {
    public static void main(String[] args) {
        DataContainerLex dataContainerLex = new DataContainerLex();
        Producer producer = new Producer(dataContainerLex);
        Consumer consumer = new Consumer(dataContainerLex);
        producer.start();
        consumer.start();

    }
}
