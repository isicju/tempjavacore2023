package org.example;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class MathLibTest extends MainTest {

    @Test
    public void sumTest(){
        MatcherAssert.assertThat(MathLib.makeSum(1,2), Matchers.is(Matchers.equalTo(3)));
    }

}
