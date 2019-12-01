package org.yhx.aop.learning.spring.cache.spel.first;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelCompilerMain {

    static class Persion{
    private Integer age;
    private String name;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args){

        Persion persion=new Persion();
        persion.setAge(123);
        persion.setName("yhx");

        SpelParserConfiguration configuration=new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE,
                Thread.currentThread().getContextClassLoader());

        ExpressionParser parser=new SpelExpressionParser(configuration);
        System.out.println(parser.parseExpression("getName()+getAge()").getValue(persion,String.class));

    }
}
