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

public class Substring {

  public static void main(final String[] args) {
    // Start with a phrase: Hello. My name is Inigo Montoya.
    String phrase = "Hello. My name is Inigo Montoya.";
    System.out.println(phrase);

    // Use substring to pull out each sentence.
    String sentence1 = phrase.substring(0, 6);
    String sentence2 = phrase.substring(7);

    // Print each sentence to the console
    System.out.println(sentence1);
    System.out.println(sentence2);

    // Use substring to pull out "My name is Inigo" surrounded with double quotes
    String myNameIsInigo = phrase.substring(7, 23);
    // Print it to the console
    System.out.println(myNameIsInigo);

  }
}
