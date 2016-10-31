/*
 * Copyright 2016 Ignacio del Valle Alles idelvall@brutusin.org.
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
package org.brutusin.wava.core;

import java.io.File;
import org.brutusin.wava.utils.Utils;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
public final class Environment {

    public static final File ROOT;
    public static final File TEMP;
    private static final String WAVA_HOME = "WAVA_HOME";

    static {
        String value = System.getenv(WAVA_HOME);
        if (value == null) {
            throw new Error("Enviroment variable not found: " + WAVA_HOME);
        }
        ROOT = new File(value);
        TEMP = new File(ROOT, "tmp");
    }

    private Environment() {
    }
}
