package org.yhx.aop.learning.spring.cache.spel.base;


import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TemplateExpression {

    public static void main(String[] args){

        ExpressionParser parser=new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("n","不咋地");
        context.setVariable("a","的小心点");
        String result=parser.parseExpression("这个人非常#{#n},所以啊，我们要#{#a}",new TemplateParserContext()).
                getValue(context,String.class);
        System.out.println("reuslt="+result);
    }
}
