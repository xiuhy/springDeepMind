package org.yhx.aop.learning.spring.cache.spel.first;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class EvalutionContextMain {

    static class Simple{
        public List<Boolean> booleans=new ArrayList<>();
    }
    public static void main(String[] args){

        Simple simple=new Simple();
        simple.booleans.add(true);
        StandardEvaluationContext context=new StandardEvaluationContext(simple);
        ExpressionParser parser=new SpelExpressionParser();
        parser.parseExpression("booleans[0]").setValue(context,false);
        System.out.println("booleans[1]="+parser.parseExpression("booleans[0]").getValue(context));
    }
}
