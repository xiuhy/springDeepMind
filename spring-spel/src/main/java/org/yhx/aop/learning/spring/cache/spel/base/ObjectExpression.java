package org.yhx.aop.learning.spring.cache.spel.base;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.yhx.aop.learning.spring.cache.spel.entity.Place;
import org.yhx.aop.learning.spring.cache.spel.entity.User;

import java.util.Date;

/**
 *
 * Spel 支持对象解析,必须设置rootObject。可以通过context或者通过setValue
 * 或者getValue 参数,或者property='xx'
 *
 * T 类型
 *
 * 构造器
 *
 * 变量：
 */
public class ObjectExpression {

    public static void main(String[] args){
        User user=new User();
        user.setUserName("yhx");
        user.setLastVisit(new Date());
        user.setCredits(100);
        user.setPlaceOfBirth(new Place("中国","南京"));

        ExpressionParser parser=new SpelExpressionParser();
        EvaluationContext context=new StandardEvaluationContext(user);
        System.out.println(parser.parseExpression("userName").getValue(context));
        System.out.println(parser.parseExpression("placeOfBirth.city").getValue(user));

        //赋值 property=value
        parser.parseExpression("userName='yhx007'").getValue(context);
        System.out.println(parser.parseExpression("userName").getValue(context));

        //赋值 通过setValue赋值
        parser.parseExpression("userName").setValue(context,"yhx008");
        System.out.println(user.getUserName());

        //类型
        System.out.println(parser.parseExpression("T(java.lang.String)"));

        //变量 #value
        context.setVariable("tmpUserName","yhx009");
        parser.parseExpression("userName=#tmpUserName").getValue(context);
        System.out.println("变量赋值="+user.getUserName());

        //构造函数 除了基本类型和String 其他必须使用权限定类名
        User expressionUser= parser.parseExpression("new User('cr',213)").getValue(User.class);
        System.out.println("构造函数：="+expressionUser.getUserName());
    }

}
