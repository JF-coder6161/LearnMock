
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticX.class)
public class TestStaticX {

    @Test
    public void testStaticX() {

        PowerMockito.mockStatic(StaticX.class);

        PowerMockito.when(StaticX.secondStaticMethod()).thenReturn(1);


        PowerMockito.verifyStatic(StaticX.class);

        Long res = Long.parseLong(String.valueOf(StaticX.secondStaticMethod())
        );

        Assert.assertEquals(java.util.Optional.of(1L), res);


    }

}
