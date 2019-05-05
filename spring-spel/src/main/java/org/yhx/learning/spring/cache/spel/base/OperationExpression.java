package org.yhx.learning.spring.cache.spel.base;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.yhx.learning.spring.cache.spel.entity.User;

/**
 * 操作符
 * 1.关系运算
 * 2.逻辑运算
 * 3.算术运算
 * 4.三元运算
 * 4.2 Elvis运算
 * 5 安全导航
 */
public class OperationExpression {

    public static void main(String[] args){

        ExpressionParser parser = new SpelExpressionParser();
        User user=new User();
        EvaluationContext context = new StandardEvaluationContext(user);
        // 数字在与null对比下时永远null是最小
        System.out.println(parser.parseExpression("12>null").getValue(Boolean.class));
        System.out.println(parser.parseExpression("null>null").getValue(Boolean.class));
        //逻辑
        System.out.println(parser.parseExpression("true or false").getValue(Boolean.class));
        System.out.println(parser.parseExpression("'yxh' instanceof T(Integer)").getValue(Boolean.class));
        System.out.println("正则解析="+parser.parseExpression("'1b23' matches '^\\d{1,10}$'").getValue(Boolean.class));

        //安全导航
        System.out.println("安全导航="+parser.parseExpression("placeOfBirth?.name").getValue(user));
//        System.out.println("非安全导航="+parser.parseExpression("placeOfBirth.name").getValue(user)); out:  Property or field 'name' cannot be found on null

        System.out.println("三元运算="+parser.parseExpression("'abc'=='abc'?'abcd':'No'").getValue());
        System.out.println("Elvis 1="+parser.parseExpression("'abc'?:'No'").getValue());
        System.out.println("Elvis empty="+parser.parseExpression("''?:'empty'").getValue());
        System.out.println("Elvis null="+parser.parseExpression("null?:'null2'").getValue());
    }
}
