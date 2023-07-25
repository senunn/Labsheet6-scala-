import scala.io.StdIn.readLine
import scala.io.StdIn

object StringToList extends App {
  println("Enter the name: ")
  val name = readLine()
  println("Enter the shift amount: ")
  val shift = StdIn.readInt()

  // Convert the string to a list of characters using map
  val inputList: List[Char] = name.toList

  // Print the resulting list
  // println(inputList)

  def encryptChar(char: Char, shift: Int): Char = {
    if (char.isLetter) {
      val base = if (char.isUpper) 'A' else 'a'
      ((char - base + shift + 26) % 26 + base).toChar
    } else {
      char
    }
  }

  def intoEncrypted(charList: List[Char], shift: Int): String = {
    val encryptedChars: List[Char] = charList.map(char => encryptChar(char, shift))
    encryptedChars.mkString
  }

  // Changed the function name to "intoEncrypted"
  println(intoEncrypted(inputList, shift))

  println("Enter the name: ")
  val name2 = readLine()
  println("Enter the shift amount: ")
  val shift2 = StdIn.readInt()

  val inputList2: List[Char] = name2.toList

  def intoDecrypted(charList: List[Char], shift: Int): String = {
    // Changed the function name to "intoDecrypted"
    val decryptedChars: List[Char] = charList.map(char => encryptChar(char, -shift))
    decryptedChars.mkString
  }

  // Changed the function name to "intoDecrypted"
  println(intoDecrypted(inputList2, shift2))
}
