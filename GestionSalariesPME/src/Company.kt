import java.util.*

/**
 * @author Elyas Abbasi
 * Cette classe sert à créer une entreprise
 */
class Company(var turnover : Double, val companyName : String){

    //Un tableau pour enregistrer les employés
    val employees = mutableListOf<Employee>()

    /**
     * retourne un string contenant les informations d'une entreprise
     * @return string
     */
    override fun toString(): String {
        return "Raison sociale : $companyName \nChiffre d\'affaire : $turnover "
    }

    /**
     * Cette fonction permet de recruter un employé
     * s'il a plus de 16 ans.
     * @param employee
     */
    fun recruit(employee: Employee){
        if((Calendar.getInstance().get(Calendar.YEAR) - employee.birthYear) >= 16 ){
            if(!employees.contains(employee)) {
                employee.employer = this
                employees.add(employee)
            }
        }
        else
            println("Nous ne pouvons pas vous engager vous êtes encore mineur!")
    }

    /**
     * Cette fonction permet de renvoyer un employé.
     * @param employee
     */
    fun dismiss(employee: Employee){
        if(employees.contains(employee)) {
            employees.remove(employee)
        }
    }

    /**
     * Cette fonction permet d'augmenter le salaire d'un employé.
     * Elle prend en paramètre le nom et le prénom de l'employé
     * en question ainsi que le montant d'augmentation.
     * @param lastName
     * @param name
     * @param amount
     */
    fun increaseSalary(lastName: String, name: String, amount: Int){
        for (employee in employees){
            if(employee.lastName.equals(lastName) && employee.name.equals(name)){
                employee.salary += amount
            }
        }
    }

    /**
     * Cette fonction permet de modifier le nom d'un employé.
     * Elle prend en paramètre son ancien nom ainsi que son
     * noveau nom.
     * @param oldLastName
     * @param newLastName
     */
    fun changeLastName(oldLastName: String, newLastName: String){
        for (employee in employees){
            if(employee.lastName.equals(oldLastName)){
                employee.lastName = newLastName
            }
        }
    }

    /**
     * Cette fonction permet d'afficher un employé.
     * Elle prend en paramètre le prénom de l'employé
     * qu'on souhaite afficher.
     * @param name
     */
    fun displayEmployee(name : String){
        for (employee in employees){
            if(employee.name.equals(name))
                print(employee)
        }
    }

    /**
     * Cette fonction permet d'afficher la liste des employés
     * en les triant par leur nom.
     * Le trie sera par l'ordre alphabétique.
     */
    fun displayLastName(){
        var sortedList = employees.sortedBy { it.lastName }
        print(sortedList )
    }

    /**
     * Cette fonction permet d'afficher les cadres.
     */
    fun displayCadre(){
        employees.forEach(){
            if(it is Executive){
                println(it)
            }
        }
    }

    /**
     * Cette fonction permet d'afficher la liste des employés
     * en les triant par leur salaire.
     * Par défault, le trie est en ordre croissant.
     * Ici, le trie sera en ordre décroissant.
     */
    fun displaySalary(){
        var sortedList = employees.sortedWith(compareBy{it.salary})
        // Pour trier en ordre decroissant
        sortedList = sortedList.reversed()
        print( sortedList )
    }
}