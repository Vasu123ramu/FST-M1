@Test
void notEnoughFunds() {
    // Create an object for BankAccount class
    BankAccount account = new BankAccount(9);

    // Assertion for exception
    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
}