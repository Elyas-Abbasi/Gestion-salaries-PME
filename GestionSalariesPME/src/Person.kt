/**
 * @author Elyas Abbasi
 * Cette classe sert de base pour créer un employe
 */
open class Person(var lastName : String, val name : String, val birthYear : Int){

    /**
     * retourne les informations d'une personne
     * @return String
     */
    override fun toString(): String {
        return  "Last Name :  $lastName  \nName : $name \nBirthYear : $birthYear"
    }
}