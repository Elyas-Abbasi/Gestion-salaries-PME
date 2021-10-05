import java.util.*

/**
 * @author Elyas Abbasi
 * Cette classe sert à créer un employe pour l'entreprise
 */
open class Employee (lastName : String, name : String, birthYear : Int, var employer : Company) : Person(lastName , name, birthYear) {

    /**
     * variable "salary" qui calcule l'âge du salarié
     * en récupérant l'année en cours et en déduisant de son année de naissance.
     */
    var salary = (Calendar.getInstance().get(Calendar.YEAR) - birthYear) * 100

    /**
     * retourne un string contenant les informations d'un employe
     * @return Sting
     */
    override fun toString(): String {
        return super.toString() + "\nSalaire : " + salary + "\n"
    }
}