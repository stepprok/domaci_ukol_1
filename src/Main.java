//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println("Štěpán Prokop");

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println(String.format("Můj věk je: "+ i++));
    }

    IO.println("Můj věk je asi 18");
    IO.println("Moje bydliště je Malá Díra, 582 Tlumačov 76362");
    IO.println("Telefon: 249872798");
    IO.println("Emil: nereknu");

    IO.println("Omluva: Ja se omlouvam zapomenul jsem to commitnout :( ");
}
