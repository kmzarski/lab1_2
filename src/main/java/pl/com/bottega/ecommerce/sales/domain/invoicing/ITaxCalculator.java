package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

import java.math.BigInteger;

public interface ITaxCalculator {
    BigInteger calculate(ProductType productType);
    Tax getTax();
}
