package pl.sda.advanced.wzorceProjektoweZadania.iterator.Channel;

public interface IChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    IIteratorChannel iterator();
}
