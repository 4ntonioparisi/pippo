/*
 * Copyright (C) 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.pippo.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.fortsoft.pippo.core.Application;
import ro.fortsoft.pippo.core.Pippo;

/**
 * This demo shows how to use Spring Framework to declare your Application as bean together with other beans and how
 * to retrieve a declared bean in a Controller.
 *
 * @author Decebal Suiu
 */
public class SpringDemo2 {

    public static void main(String[] args) {
        // create spring application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
        Application application = (Application) applicationContext.getBean("application");

        Pippo pippo = new Pippo(application);
        pippo.start();
    }

}