import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private  FizzBuzz game;

@Before
public void before(){
    game = new FizzBuzz();


}


    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5() {
        List<String> numberslist = game.getnumbers ();
        Assert.assertEquals("1",numberslist.get(0));
        Assert.assertEquals("2",numberslist.get(1));
        Assert.assertEquals("7",numberslist.get(6));
        Assert.assertEquals("13",numberslist.get(12));

    }
    @Test
    public void should_returnFizz_whenAMultipleOf3() {
        FizzBuzz game = new FizzBuzz();
        List<String> numberslist = game.getnumbers ();
        Assert.assertEquals(FIZZ,numberslist.get(2));
        Assert.assertEquals(FIZZ,numberslist.get(5));
        Assert.assertEquals(FIZZ,numberslist.get(8));
        Assert.assertEquals(FIZZ,numberslist.get(11));


    }
    @Test
    public void should_returnBuzz_whenAMultipleOf5() {
        FizzBuzz game = new FizzBuzz();
        List<String> numberslist = game.getnumbers ();
        Assert.assertEquals(BUZZ,numberslist.get(4));
        Assert.assertEquals(BUZZ,numberslist.get(9));
        Assert.assertEquals(BUZZ,numberslist.get(19));
        Assert.assertEquals(BUZZ,numberslist.get(24));


    }
    @Test
    public void should_returnFizzBuzz_whenAMultipleOf3And5() {
        FizzBuzz game = new FizzBuzz();
        List<String> numberslist = game.getnumbers ();
        Assert.assertEquals(FIZZ + BUZZ ,numberslist.get(14));
        Assert.assertEquals(FIZZ + BUZZ ,numberslist.get(29));
        Assert.assertEquals(FIZZ + BUZZ ,numberslist.get(59));
        Assert.assertEquals(FIZZ + BUZZ ,numberslist.get(89));


    }
}
