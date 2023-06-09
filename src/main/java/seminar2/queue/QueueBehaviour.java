package seminar2.queue;

import seminar2.actor.Actor;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();


}
