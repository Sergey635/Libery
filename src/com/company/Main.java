package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Edition kolobok = new Edition("Kolobok","Folc", "Barvinok",24,Genre.HORROR);
	Edition repka = new Edition("Repka", "Folc","Barvinok",50,Genre.FANTASTIC);
	Exemplar kolobok1 = new Exemplar("1", kolobok, 3, 4, 0);
	Exemplar kolobok2 = new Exemplar("2", kolobok, 3, 4, 0);
	Exemplar repka1 = new Exemplar("1",repka,2,5,0);
	Exemplar repka2 = new Exemplar("2",repka,2,5,0);
	Bibliotekar annaIvanovna = new Bibliotekar("Anna Ivanovna Leopoldovna",
            "Bibliotekar");
	Client egorIvanov = new Client("Egor", "Baranov", "Iosivovich",
            LocalDate.of(2000,07,4),958458412,"Podval 4");
	Record r1 = new Record("1", LocalDateTime.of(2020, Month.SEPTEMBER,3,10,44,33),
            annaIvanovna,kolobok1,egorIvanov,"Given");
	Record r2 = new Record("2",LocalDateTime.of(2020,Month.SEPTEMBER,3,10,23,20),
            annaIvanovna,kolobok1,egorIvanov,"Taken");

        List<Record> records = new ArrayList<>();
        records.add(r1);
        records.add(r2);
    }
}
