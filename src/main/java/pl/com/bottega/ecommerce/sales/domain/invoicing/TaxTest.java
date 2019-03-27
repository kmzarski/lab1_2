package pl.com.bottega.ecommerce.sales.domain.invoicing;

import org.junit.Assert;
import org.junit.Test;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import static org.hamcrest.Matchers.is;

public class TaxTest {

    @Test
    public void getAmountTest() {
        Tax first = new Tax(new Money(55,"PLN"),"for 1 ECTS");
        Tax second = new Tax(new Money(55,"PLN"),"for 1 ECTS");
        Assert.assertThat(first.getAmount(), is(first.getAmount()));
    }
}
