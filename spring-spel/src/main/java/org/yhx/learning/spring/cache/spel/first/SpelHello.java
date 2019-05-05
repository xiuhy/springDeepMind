package org.yhx.learning.spring.cache.spel.first;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelHello {
    public static void main(String[] args){

        ExpressionParser parser=new SpelExpressionParser();
        Expression expression=parser.parseExpression("'Hello '+'SpEL'");
        System.out.println("expression:"+expression.getExpressionString()+", value:"+expression.getValue());
        Expression expression2=parser.parseExpression("'Hello'.concat(12)");
        System.out.println("result:"+expression2.getValue(String.class));

    }
}
