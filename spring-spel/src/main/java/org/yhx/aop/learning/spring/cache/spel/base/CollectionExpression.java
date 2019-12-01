package org.yhx.aop.learning.spring.cache.spel.base;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.yhx.aop.learning.spring.cache.spel.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 1. 集合表达式
 * 2. 集合过滤
 */
public class CollectionExpression {

    public static void main(String[] args){
        ExpressionParser parser = new SpelExpressionParser();
        User user=new User();
        List<String> list = new ArrayList<>(3);
        list.add("coding");
        list.add("song");
        list.add("sleep");
        user.setHobby(list);
        EvaluationContext context = new StandardEvaluationContext(user);

        //数组
       int[] intArray= parser.parseExpression("new int[]{12,23,23}").getValue(context,int[].class);
       int[][] intArray2=parser.parseExpression("new int[2][2]").getValue(int[][].class);
       System.out.println(Arrays.toString(intArray2));

       //List
        List list2=parser.parseExpression("{1,23,423423}").getValue(List.class);
        System.out.println("list: "+list2);
        System.out.println("从属性中获取值："+parser.parseExpression("hobby[2]").getValue(context,List.class));

        //Map
        Map map1=parser.parseExpression("{user:'yhx',age:'23'}").getValue(Map.class);
        System.out.println("map: "+map1.get("user"));

        //集合过滤
       System.out.println(parser.parseExpression("hobby.?[#this=='sleep']").getValue(context));

        //#root 引用
        System.out.println("#root refer:"+parser.parseExpression("#root").getValue(context));
        System.out.println("#this refer:"+parser.parseExpression("#this").getValue(context));
    }
}
