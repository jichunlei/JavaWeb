/**
 * @Title: Person.java
 * @Prject: JavaWeb
 * @Package: com.jicl.listener
 * @Description: TODO
 * @author: xianzilei
 * @date: 2019年6月3日 上午8:56:02
 * @version: V1.0 Copyright © 2019xianzilei. All rights reserved.
 */
package com.jicl.listener;

/**
 * @ClassName: Person
 * @Description: 监听对象
 * @author: xianzilei
 * @date: 2019年6月3日 上午8:56:02
 */
public class Person {
    /**
     * 监听器
     */
    private PersonListener personListener;

    /**
     * @Title: eat
     * @Description: eat动作
     * @return: void
     */
    public void eat() {
        if (personListener != null) {
            personListener.doeat(new Event(this));
        }
    }

    /**
     * @Title: run
     * @Description: run动作
     * @return: void
     */
    public void run() {
        if (personListener != null) {
            personListener.dorun(new Event(this));
        }
    }

    /**
     * @Title: registerListener
     * @Description: 注册监听器
     * @param personListener
     * @return: void
     */
    public void registerListener(PersonListener personListener) {
        this.personListener = personListener;
    }

    /**
     * @ClassName: PersonListener
     * @Description: 监听器接口
     * @author: xianzilei
     * @date: 2019年6月3日 上午8:57:18
     */
    interface PersonListener {
        /**
         * @Title: doeat
         * @Description: 监听Person对象eat这个行为动作
         * @param e
         *            事件
         * @return: void
         */
        void doeat(Event e);

        /**
         * @Title: dorun
         * @Description: 监听Person对象run这个行为动作
         * @param e
         *            事件
         * @return: void
         */
        void dorun(Event e);
    }

    /**
     * @ClassName: Event
     * @Description: 事件对象
     * @author: xianzilei
     * @date: 2019年6月3日 上午8:57:54
     */
    class Event {
        // 事件源
        private Person person;

        public Event(Person person) {
            super();
            this.person = person;
        }

        public Event() {}

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }
}
