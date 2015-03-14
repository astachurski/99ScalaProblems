/**
 * Created by adrian on 2/18/2015.
 */
/*
Find out whether a list is a palindrome.
Example:

  scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
*/


object P06 extends App{


  def isPalindrome[A](list: List[A]): Boolean = {
    list.reverse.equals(list)
  }


  println(isPalindrome(List(1, 2, 3, 2, 1)))
  println(isPalindrome(List(5, 2, 3, 2, 1)))

  println(isPalindrome(List(8,7,8)))
  println(isPalindrome(List(8,7,8,7)))
  println(isPalindrome(List(8,7,8,7,8)))

  println(isPalindrome(List("Sraka", "ptaka", "nieboraka", "gugu")))
  println(isPalindrome(List("Sraka", "ptaka", "Sraka")))
  println(isPalindrome(List("Sraka", "ptaka", "Sraka", "pu")))




}
