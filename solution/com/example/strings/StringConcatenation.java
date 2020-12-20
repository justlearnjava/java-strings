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

public class StringConcatenation {

  public static void main(final String[] args) {
    // Concatenate using +
    plus();

    // Concatenate
    concat();

    // StringBuilder
    stringBuilder();
  }

  private static void plus() {
    // Declare a String and initialize it to "this one"
    String thisOne = "this one";

    // Declare a String and initialize it to "that one"
    String thatOne = "that one";

    // Concatenate both strings, separated by a space
    String thisOneAndThatOne = thisOne + " " + thatOne;

    // Print both string objects to the console separated by a space
    System.out.println("plus(): " + thisOneAndThatOne);
  }

  private static void concat() {
    // Declare a String and initialize it to "this one" (include the space in this literal)
    String thisOne = "this one";

    // Declare a String and initialize it to "that one"
    String thatOne = "that one";

    // Concatenate both strings using .concat()
    String thisOneAndThatOne = thisOne.concat(" ").concat(thatOne);

    // Print both string objects to the console separated by a space
    System.out.println("concat(): " + thisOneAndThatOne);
  }

  private static void stringBuilder() {
    // Declare a String and initialize it to "this one" (include the space in this literal)
    String thisOne = "this one";

    // Declare a String and initialize it to "that one"
    String thatOne = "that one";

    // Declare a StringBuilder class and use it to concatenate both strings
    StringBuilder thisOneAndThatOne = new StringBuilder();
    thisOneAndThatOne.append(thisOne);
    thisOneAndThatOne.append(" ");
    thisOneAndThatOne.append(thatOne);

    // Print both string objects to the console separated by a space
    System.out.println("stringBuilder(): " + thisOneAndThatOne.toString());
  }

}
