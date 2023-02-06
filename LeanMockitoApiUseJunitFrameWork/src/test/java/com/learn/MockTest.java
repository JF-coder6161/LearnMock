package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockTest.class)
public class MockTest {

    @Test
    public void behaviourTest(){

        List mockList = Mockito.mock(LinkedList.class);
        Mockito.when(mockList.get(Mockito.anyInt())).thenReturn(123);
        System.out.println(mockList.get(1));
        mockList.clear();
        Mockito.verify(mockList,Mockito.times(1));

    }

    @Test
    public void StubbingTest(){

        List mockList = Mockito.mock(LinkedList.class,"MockLinkedList");
        Mockito.when(mockList.add(Mockito.anyInt())).thenReturn(true);
        Mockito.when(mockList.get(Mockito.anyInt())).thenThrow(new RuntimeException());
        Mockito.when(mockList.contains(Mockito.anyChar())).thenAnswer(new Answer<Object>() {
            public Object answer (org.mockito.invocation.InvocationOnMock invocationOnMock) {
                Object[] args = invocationOnMock.getArguments();
                Object mock = invocationOnMock.getMock();
                return "called with arguments:" + Arrays.toString(args);
            }
        });
        System.out.println(mockList.contains(1));
        mockList.add(1);
        try{
            mockList.get(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        Mockito.verify(mockList,Mockito.times(1)).add(1);
        Mockito.verify(mockList,Mockito.timeout(1)).get(1);
    }

    @Test
    public void StubbingTest1(){

        List mockList = Mockito.mock(LinkedList.class,"MockLinkedList");
        Mockito.when(mockList.add(Mockito.anyInt())).thenReturn(true);
        Mockito.when(mockList.get(Mockito.anyChar())).thenAnswer(new Answer<Object>() {
            public Object answer (org.mockito.invocation.InvocationOnMock invocationOnMock) {
                Object[] args = invocationOnMock.getArguments();
                Object mock = invocationOnMock.getMock();
                return "called with arguments:" + Arrays.toString(args);
            }
        });
        System.out.println(mockList.get('1'));
        mockList.add(1);

    }

}
