package pl.sda.advanced.wzorceProjektoweZadania.iterator.Channel;

public class IteratorTest {
    public static void main(String[] args) {
        IChannelCollection iChannelCollection = new ChannelCollectionImpl();
        iChannelCollection.addChannel(new Channel("mtv"));
        iChannelCollection.addChannel(new Channel("sport"));
        iChannelCollection.addChannel(new Channel("rozrywka"));

        IIteratorChannel iIteratorChannel = iChannelCollection.iterator();

        while (iIteratorChannel.hasNext()){
            System.out.println(iIteratorChannel.next());
        }
    }
}
