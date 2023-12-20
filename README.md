## Коллекции Treemap и TreeSet

#### Условие задачи
Перед вами программа отбора кандидатов в астронавты. В main заполнено множество из потенциальных кандидатов, из которых выбирается только два кандидата.
Критерии отбора таковы. При сравнении двух кандидатов лучший выбирается по принципу:

1. тот у кого больше опыта; если опыт одинаковый то
2. тот, у кого в имени с фамилией (т.е. name) больше букв s или S (от слова space - космос; было решено, что 
медийность - важная часть космонавтики); если по этому критерию оказываются равны, то
3. тот, у кого имя с фамилией (т.е. name) короче (так легче будет запоминать имена астронавтов по всему миру)
Ваша задача реализовать компаратор, сортировка которым расставит кандидатов по убыванию их приоритета найма в 
астронавты. Ничего крмое класса компаратора менять нельзя. Программа в main в итоге должна выводить имена двух 
самых лучших кандидатов