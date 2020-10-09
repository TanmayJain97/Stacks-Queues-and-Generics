package bridgelabz.stacks_queues;

public interface LinkedListFunction<Key> {

	Key getKey();
	public void setKey();
	
	public LinkedListFunction<Key> getNextNode();
	public void setNextNode(LinkedListFunction<Key> nextNode);
}