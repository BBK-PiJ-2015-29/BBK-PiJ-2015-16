package q4_2_queuetests.q2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PersonQueueTest {

    PersonQueue pq;
    Person p1, p2, p3;

    @Before
    public void setUp() {
//		pq = new SupermarketQueue();
        pq = new TakeNumberQueue();
        p1 = new Person("Marvin", 17);
        p2 = new Person("Arnie", 18);
        p3 = new Person("Elizabeth", 2);
    }

    @Test
    public void testsPushThreePeopleThenPopOne() {
        pq.insert(p1);
        pq.insert(p2);
        pq.insert(p3);
        assertEquals(p1, pq.retrieve());
    }

    @Test
    public void testsPushThreePeopleThenPopThree() {
        pq.insert(p1);
        pq.insert(p2);
        pq.insert(p3);
        assertEquals(p1, pq.retrieve());
        assertEquals(p2, pq.retrieve());
        assertEquals(p3, pq.retrieve());
    }

    // this will fail as not coded for empty queue
    @Test
    public void testsPopFromEmptyQueue() {
        Person marvin = new Person("Marvin", 17);
        pq.insert(marvin);
        assertEquals(marvin, pq.retrieve());
        assertNull(pq.retrieve());
    }

}

