public class Praktikum {
    public static void main(String[] args) {
        String nameSurname  = "Иванова Маша";
        Account account = new Account(nameSurname);
        System.out.println(account.checkNameToEmboss());
        System.out.println(nameSurname);
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
    }

}
