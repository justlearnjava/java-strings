/*
 *    Copyright 2020 Just Learn Java
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.example.strings;

public class StringLiteral {

  public static void main(final String[] args) {
    // Demonstrate basic string literals
    simple();

    // Demonstrate escape sequences
    escape();
  }

  private static void simple() {
    // TODO: Declare a String and initialize it using a literal: "Just Learn Java!"
    String aString;

    // TODO: Print the String object to the console
    System.out.println(/*aString*/);
  }

  private static void escape() {
    // TODO: Declare a String and initialize it using a literal: "Just Learn Java!"
    // TODO: The literal should contain double quotes when printed out
    // TODO: (Hint: use an escape sequence)
    String aString;

    // TODO: Print the string object to the console
    System.out.println(/* aString*/);

    // TODO: Initialize the string with the same literal
    // TODO: But this time the literal should contain single quotes

    // TODO: Print the string object to the console
    System.out.println(/*aString*/);

    // TODO: Insert tabs between Just, Learn, and Java (keep the single quotes)

    // TODO: Print the string object to the console
    System.out.println(/*aString*/);

    // TODO: Insert newline between Just, Learn, and Java (lose the single quotes)

    // TODO: Print the string object to the console
    System.out.println(/*aString*/);

    // Full list of escape characters here:
    // https://docs.oracle.com/javase/tutorial/java/data/characters.html
  }

}
