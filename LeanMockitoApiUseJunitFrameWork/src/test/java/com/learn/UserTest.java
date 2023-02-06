package com.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserTest.class)
public class UserTest {

    // test Mockit thenReturn and thenAnswer
    public void testThenReturn(){



    }

    @Test
    public void testThenAnswer(){

        User user = Mockito.mock(User.class);
        Mockito.when(user.getName(1,true,0.0)).thenAnswer(new Answer<String>() {
            @Override
            public String answer(InvocationOnMock invocation) throws Throwable {
                // 拿到user.getName(1,true,0.0)的所有参数
                Iterator<Object> iterator = Arrays.stream(invocation.getArguments()).iterator();
                StringBuilder stringBuilder = new StringBuilder();
                while (iterator.hasNext()){
                    stringBuilder.append(iterator.next().toString());
                }
                return stringBuilder.toString() ;
            }
        });
        System.out.println(user.getName(1,true,0.0));
    }
}
