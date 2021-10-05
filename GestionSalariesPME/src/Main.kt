/**
 * @author Elyas Abbasi
 * Cette classe sert a la gestion des fichiers et a la classe main
 */
fun main(args: Array<String>) {

    println("==========*******  Company  *******==========\n")
    val company = Company(5000.0, "PME")
    println(company)

    println("\n==========******  Person  *******==========\n")
    val person = Person("Bareau", "Alex", 2000)
    println(person)

    println("\n==========****  Employee 1  *****==========\n")
    val romain = Employee("Durieux", "Romain", 1990, company)
    println(romain)
    company.recruit(romain)

    println("\n==========****  Employee 2  *****==========\n")
    val florie = Employee("Barbot", "Florie", 1990, company)
    println(florie)
    company.recruit(florie)

    println("\n==========****  Employee 3  *****==========\n")
    val clement = Employee("Opack", "Clement", 2003, company)
    println(clement)
    company.recruit(clement)

    println("\n==========******  Cadre 1  *******==========\n")
    val cadre = Executive("Mouches", "Oscar", 2001, company, Grade.B)
    println(cadre)
    company.recruit(cadre)

    println("\n==========******  Cadre 2  *******==========\n")
    val cadre2 = Executive("Abbasi", "Elyas", 1999, company, Grade.C)
    println(cadre2)
    company.recruit(cadre2)

    println("\n==========***  Employee minor  ***==========\n")
    val minor = Employee("Ops", "Minor", 2009, company)
    println(minor)
    company.recruit(minor)

    println("\n==========*******  Cadres  ********==========\n")
    company.displayCadre()

    println("\n========****  Sorted last name  ****========\n")
    println("Note : Here, we can see that the employee \"Minor\" is not in the list of employers.\n\n")
    company.displayLastName()

    println()
    println("\n=======  Sorted salary descending  =======\n")
    println("Note : If salary equals then it will be sort by last name\n\n")
    company.displaySalary()

    println()
    println("\n=====****  Test dismiss function   ****=====\n")
    println("Note : We dismiss Durieux Romain, so he is no longer part of the employees \n\n")
    company.dismiss(romain)
    company.displayLastName()

    println()
    println("\n==========*******  Change last name of Florie  ********==========\n")
    println("Note : Barbot => Dupond \n\n")
    println("Avant")
    println(florie)
    println("\nAprès")
    company.changeLastName("Barbot", "Dupont")
    company.displayEmployee("Florie")

    println("\n=========*****  Test Grade  *****=========\n")
    println("Note : Grade B => Grade A \n\n")

    println("Avant")
    println(cadre)
    cadre.grade = Grade.A
    println("\nAprès")
    println(cadre)

    println("\n=======****  Test increaseSalary function ****=======\n")
    println("Note : 1800 => 1950 \n\n")

    println("Avant augmentation")
    println(clement)
    company.increaseSalary("Opack", "Clement", 150)
    println("Après augmentation")
    println(clement)
}