// задача 12
interface PaymentSystem {
    void pay(float sum);
    void refund(float sum);
}

class CreditCard implements PaymentSystem{
    @Override
    public void pay(float sum) {
        System.out.println("Оплачено " + sum + " кредитной картой");
    }

    @Override
    public void refund(float sum) {
        System.out.println("На кредитную карту возвращено " + sum);
    }
}

class PayPal implements PaymentSystem
{

    @Override
    public void pay(float sum) {
        System.out.println("Оплачено " + sum + " с PayPal");
    }

    @Override
    public void refund(float sum) {
        System.out.println("На PayPal возвращено " + sum);
    }
}