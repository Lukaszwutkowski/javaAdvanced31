package pl.sda.advanced.wzorceProjektoweZadania.iterator.Channel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChannelCollectionImpl implements IChannelCollection{

    List<Channel> channels = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channelToRemove) {
        Iterator<Channel> iterator = channels.iterator();
        while (iterator.hasNext()){
            Channel iteratorChannel = iterator.next();
            if (iteratorChannel.equals(channelToRemove)){
                iterator.remove();
            }
        }
    }

    @Override
    public IIteratorChannel iterator() {
        return null;
    }

    private class IteratorChannel implements IIteratorChannel{
        List<Channel> channels;
        int position = 0;

        public IteratorChannel(List<Channel> channels){
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            if (position < channels.size() && channels.get(position) != null) {
                return true;
            }
            return false;
        }

        @Override
        public Channel next() {
            return channels.get(position++);
        }
    }
}
