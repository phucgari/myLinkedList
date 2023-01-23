import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList<String> linkedList=new MyLinkedList();
    @Test
    void getNumNodes_initialList(){
        int result= linkedList.getNumNodes();
        assertEquals(0,result);
    }
    @Test
    void getNumNode_oneElement_sizeIsOne(){
        linkedList.addLast("a");
        assertEquals(1,linkedList.getNumNodes());
    }
    @Test
    void getFirst_oneElement_sizeIsOne(){
        linkedList.addLast("a");
        assertEquals("a",linkedList.getNode(0));
    }
    @Test
    void getNumNode_twoElement_sizeIsTwo(){
        linkedList.addLast("a");
        linkedList.addLast("b");
        assertEquals(2,linkedList.getNumNodes());
    }
    @Test
    void getNode_twoElement_sizeIsTwo(){
        linkedList.addLast("a");
        linkedList.addLast("b");
        assertEquals("a",linkedList.getNode(0));
        assertEquals("b",linkedList.getNode(1));
    }
    @Test
    void checkNull(){
        String result=linkedList.getNode(0);
        assertEquals(null,result);
    }
    @Test
    void getNode_insertElement(){
        linkedList.addLast("a");
        linkedList.addLast("c");
        linkedList.add(1,"b");
        assertEquals("a",linkedList.getNode(0));
        assertEquals("b",linkedList.getNode(1));
        assertEquals("c",linkedList.getNode(2));
    }
    @Test
    void GetNode_addFirst(){
        linkedList.addLast("b");
        linkedList.addLast("c");
        linkedList.addFirst("a");
        assertEquals("a",linkedList.getNode(0));
        assertEquals("b",linkedList.getNode(1));
        assertEquals("c",linkedList.getNode(2));
    }
}