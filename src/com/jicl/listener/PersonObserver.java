/**
 * @Title: PersonObserver.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:04:53
 * @version: V1.0 Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.listener;

import com.jicl.listener.Person.Event;
import com.jicl.listener.Person.PersonListener;

/**
 * @ClassName: PersonObserver
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年6月4日 上午8:04:53
 */
public class PersonObserver {
    public static void main(String[] args) {
        Person person = new Person();
        person.registerListener(new PersonListener() {
            @Override
            public void dorun(Event e) {
                System.out.println(person + "-->run()...");

            }
            @Override
            public void doeat(Event e) {
                System.out.println(person + "-->eat()...");

            }
        });
        person.eat();
        person.run();
    }
}
