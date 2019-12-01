package org.yhx.aop.learning.spring.cache.spel.base;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spel 文本支持
 */
public class TextExpression {

    public static void main(String[] args){
        ExpressionParser parser = new SpelExpressionParser();
        String hellow=parser.parseExpression("\"hello\"").getValue(String.class);
        Integer add=parser.parseExpression("1+2").getValue(Integer.class);
        Object nullValue=parser.parseExpression("null").getValue();
        double doubleValue=parser.parseExpression("6.12323E+23").getValue(Double.class);
        System.out.println(hellow);
        System.out.println(add);
        System.out.println(nullValue);
        System.out.println(doubleValue);
    }
}
