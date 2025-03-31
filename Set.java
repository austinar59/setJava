import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

public class Set {
	Queue<Number> setMembersPermanent; // the "permanent" set of members, though members can be removed from here if they are no longer part of the set.
	Queue<Number> setMembersRemove; //the removable queue for set members, to be removed for observation and added back into. implemented as fifo to avoid repeats but maintain "unorderedness"
	
	public Set(int[] in) {
    prepareQueues();
		for(int x : in) {
       setMembersPermanent.add(new Integer(x));
    }
    setMembersRemove.addAll(setMembersPermanent);
	}
 
  public void prepareQueues() {
    setMembersPermanent = new LinkedList<Number>();
    setMembersRemove = new LinkedList<Number>();
  }
  public Number getSetMember() {
    Number x = setMembersRemove.remove();
    setMembersRemove.add(x);
    return x;
  }
}
