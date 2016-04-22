package q4_2_queuetests.q1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonQueueTest {

    PersonQueue pq;
    Person mark, anna, ellie;

    @Before
    public void setUp() {
        pq = new SupermarketQueue();
//		pq = new TakeNumberQueue();
        mark = new Person("Marvin", 17);
        anna = new Person("Anna", 18);
        ellie = new Person("Elizabeth", 2);

    }

    @Test
    public void testsPushThreePeopleThenPopOne() {
        pq.insert(mark);
        pq.insert(anna);
        pq.insert(ellie);
        assertEquals(mark, pq.retrieve());
    }

    @Test
    public void testsPushThreePeopleThenPopThree() {
        pq.insert(mark);
        pq.insert(anna);
        pq.insert(ellie);
        assertEquals(mark, pq.retrieve());
        assertEquals(anna, pq.retrieve());
        assertEquals(ellie, pq.retrieve());
    }

    // this will fail as not coded for empty queue
    @Test
    public void testsPopFromEmptyQueue() {
        pq.insert(mark);
        assertEquals(mark, pq.retrieve());
        assertNull(pq.retrieve());
    }

}

