/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        int fav;
        String validRange;

        //Bloque principal
        try {
            //Solicitar número al usuario
            System.out.print("Por favor, inserte su número favorito "
                    + "de la lotería, comprendido entre '1' y '49': ");
            fav = SCN.nextInt();

            //Calcular si es un número válido
            validRange = fav >= 1 && fav <= 49
                    ? "Su número favorito de la primitiva es...: " + fav
                    : "Número no válido";

            //Salida
            System.out.println(validRange);
        } catch (Exception e) {
            System.out.println("Por favor, inserte un valor válido.");
        }
    }
}
