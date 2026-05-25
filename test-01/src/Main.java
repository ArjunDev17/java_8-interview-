////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
* I HAVE MUTILPKE A thred B thread incrmenting counter both counter
*
* 0->100
*
* result
*
* 200
*
* */

void main() {

    MyConuter A= new MyConuter();
    MyConuter B = new MyConuter();

    A.start();
    B.start();

}
