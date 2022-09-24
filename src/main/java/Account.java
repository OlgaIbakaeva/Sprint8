public class Account {

    private final String name;
    private  boolean isCard;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if ((name.length() > 2) && (name.length() < 20)) {
            if (countBlank() == 1) { // проверка, что пробел содержится только один
                if (name.startsWith(" ") || name.endsWith(" ")) {
                    return false;
                } else {return true;}
            } else return false;

        } else return false;
    }

    public int countBlank() {
        int i = name.indexOf(" ");
        int count = 0;
        while (i != -1) {
            i = name.indexOf(" ", i+1);
            count +=1;
        }
        return count;
    }

}