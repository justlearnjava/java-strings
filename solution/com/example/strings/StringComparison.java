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

public class StringComparison {

  private static final System.Logger log = System.getLogger(StringComparison.class.getName());

  public static void main(final String[] args) {
    String string = "This is a string";

    // Use the equality operator to compare the strings
    equality(string);

    // Use String.equals() to compare the strings
    equals(string);
  }

  private static void equality(final String string) {
    // Compare string with its literal counterpart using the object equality operator
    if (string == "This is a string") {
      log.log(System.Logger.Level.INFO, "string == \"This is a string\" == true");
    } else {
      log.log(System.Logger.Level.INFO,"string == \"This is a string\" == false");
    }

    // Create "This is a string" in pieces using the concatenation operator
    String string2 = "This" + " " + "is" + " " + "a" + " " + "string";
    // Compare the two objects using the object equality operator
    if (string == string2) {
      log.log(System.Logger.Level.INFO,"string == string2 == true");
    } else {
      log.log(System.Logger.Level.INFO,"string == string2 == false");
    }

    // Create "This is a string" using String.concat()
    // Compare the two objects using the object equality operator
    if (string == "This".concat(" is a string")) {
      log.log(System.Logger.Level.INFO,"string == string3 == true");
    } else {
      log.log(System.Logger.Level.INFO,"string == string3 == false");
    }
  }

  private static void equals(final String string) {
    // Compare string with its literal counterpart using equals()
    if (string.equals("This is a string")) {
      log.log(System.Logger.Level.INFO, "string.equals(\"This is a string\") == true");
    } else {
      log.log(System.Logger.Level.INFO,"string.equals(\"This is a string\") == false");
    }

    // Create "This is a string" in pieces using the concatenation operator
    String string2 = "This" + " " + "is" + " " + "a" + " " + "string";
    // Compare the two objects using equals()
    if (string.equals(string2)) {
      log.log(System.Logger.Level.INFO,"string.equals(string2) == true");
    } else {
      log.log(System.Logger.Level.INFO,"string.equals(string2) == false");
    }

    // Create "This is a string" using String.concat()
    // Compare the two objects using equals()
    if (string.equals("This".concat(" is a string"))) {
      log.log(System.Logger.Level.INFO,"string.equals(string3) == true");
    } else {
      log.log(System.Logger.Level.INFO,"string.equals(string3) == false");
    }
  }

}
