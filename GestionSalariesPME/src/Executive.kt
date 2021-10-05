/**
 * @author Elyas Abbasi
 * Cette classe sert à créer un cadre pour l'entreprise
 */
class Executive(lastName : String, name : String, birthYear : Int, employer : Company, grade: Grade)
    : Employee(lastName, name, birthYear, employer){

    /**
     * retourne un string contenant les informations du cadre
     * @return string
     */
    override fun toString(): String {
        return super.toString() + "\nGrade  : $grade \n"
    }

    var grade = grade
        set(value) {
            val gradeOld = grade
            val salaireOld = salary - gradeOld.prime
            salary = salaireOld + value.prime
            field = value
        }

    /**
     * Cette fonction permet de récuperer le salaire d'employé
     * pour en ajouter son grade.
     */
    init {
        salary += grade.prime
    }
}