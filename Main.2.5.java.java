public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", 'f');

        Account account = new Account(101, customer, 1000);

        System.out.println("Initial Account Details: " + account.toString());

        account.deposit(500);
        System.out.println("After depositing $500: " + account.toString());

        account.withdraw(200);
        System.out.println("After withdrawing $200: " + account.toString());

        account.withdraw(1500);
        System.out.println("After attempting to withdraw $1500: " + account.toString());

        System.out.println("Customer's name: " + customer.getName());
        System.out.println("Customer's discount: " + customer.getId() + "%");
    }
}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
