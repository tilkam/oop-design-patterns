<h2>Task 1</h2>
<b>What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?</b></br>
Med den ursprungliga koden så uppstår det problem eftersom trimToSize() inte finns i LinkedList. Vi vill/behöver inte veta vilken typ av lista Storage använder.
Vi skulle också behöva ändra till LinkedList på alla ställen som använder metoden från Storage vilket kan leda till att fel uppstår</br>

<b>Think about the method calls in main - does trimToSize() exist in LinkedList?</b></br>
Nej, trimToSize() finns inte i LinkedList. Är detta något man måste kontrollera så kanske det är bättre att ha det i Storage-klassen</br>

<b>Should Main know about what concrete type of List Storage provides?</b>
Nej, det är inte bra att Main vet vilken typ av lista Storage använder. Det är bättre att använda List<Person> för att skydda oss från ändringar i Storage-klassen.

<h2>Task 2</h2>
<b>1. Make a UML diagram showing the inheritance tree (you don't need to be specific)</b></br>

[![](https://mermaid.ink/img/pako:eNqVUcuKwzAM_BWhU0uTHwghp91jT736osZqNjRWgqMcSjf_vs7LDSxbWAxmNBqPB-mJZWsZMywb6vuPmipPzgjAXMOn65r2wQzPiQPIc7r26qnUoliYFIQcb9hyR14diy7MKTocJlmyExw3xdQ4xOoleHHaXtTXUi3MaGQXUKpamP0W8BSZvz98Y3cmoWrvthL_NItjy7_TNCb63Vndl0cAu3uD08EEHXtHtQ17mpMZ1C8OU8csQEv-btDIGHQ0hDwPKTFTP3CCQ2dJeV0rZjdqeh5_AK-0oJ0?type=png)](https://mermaid.live/edit#pako:eNqVUcuKwzAM_BWhU0uTHwghp91jT736osZqNjRWgqMcSjf_vs7LDSxbWAxmNBqPB-mJZWsZMywb6vuPmipPzgjAXMOn65r2wQzPiQPIc7r26qnUoliYFIQcb9hyR14diy7MKTocJlmyExw3xdQ4xOoleHHaXtTXUi3MaGQXUKpamP0W8BSZvz98Y3cmoWrvthL_NItjy7_TNCb63Vndl0cAu3uD08EEHXtHtQ17mpMZ1C8OU8csQEv-btDIGHQ0hDwPKTFTP3CCQ2dJeV0rZjdqeh5_AK-0oJ0)
(Även lagt in en bild på UML-diagrammet, UML.png)</br>
<b>2. Is it possible in this design for an Engineer to also become a Manager?</br></b>
Nej, eftersom båda ärver från Employee så kan en Engineer inte bli en Manager. Där för måste vi ändra designen så att man kan tilldela flera roller till en anställd istället. 

4. If you want a removeRole(Role) method, how do you have to change the Role class?
Kanske missförstod denna punkten, men gjorde ingen ändring i Role-klassen utan lade till en removeRole(Role) i Employee-klassen.
