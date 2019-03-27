package pl.com.bottega.ecommerce.sharedkernel;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class MoneyTest {

    @Test
    public void multiplyBy() {
        Money first = new Money(2.5, "EUR");
        Assert.assertThat(new Money(5, "EUR"), is(first.multiplyBy(2)));
    }

    @Test
    public void add() {
        Money first = new Money(2.5, "EUR");
        Money second = new Money(7.5, "EUR");
        Assert.assertThat(new Money(10, "EUR"), is(first.add(second)));
    }

    @Test
    public void subtract() {
        Money first = new Money(2.5, "EUR");
        Money second = new Money(7.5, "EUR");
        Assert.assertThat(new Money(5, "EUR"), is(second.subtract(first)));
    }

    @Test
    public void incorrectTypeCurrnecyCode() {
        Money first = new Money(2.5, "EUR");
        Money second = new Money(2.5, "PLN");
        Assert.assertThat(first, not(second));
    }

    @Test(expected = IllegalArgumentException.class)
    public void incorrectTypeCurrnecyCodeAddException() {
        Money first = new Money(2.5, "EUR");
        Money second = new Money(2.5, "PLN");
        first.add(second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void incorrectTypeCurrnecyCodeSubstractException() {
        Money first = new Money(2.5, "EUR");
        Money second = new Money(2.5, "PLN");
        first.subtract(second);
    }
}
