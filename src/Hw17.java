public class Hw17 {
    public static void main(String[] args) {
        Pers pers = new Pers("Антон", 5,"Травень", 1998,"Antom1998@gmail.com","0977510056","Павлов",77,"120/90",5700);
        Pers pers1 = new Pers("Кирило", 5,"Квітень", 1994,"Kiril1995@gmail.com","0977567000","Дуров",85,"110/80",6200);
        Pers pers2 = new Pers("Євген", 5,"Жовтень", 1987,"Genya1987@gmail.com","0982267256","Козаков",91,"100/70",4300);

        pers1.printAccountInfo();
        pers2.printAccountInfo();
        pers.printAccountInfo();

    }
}
