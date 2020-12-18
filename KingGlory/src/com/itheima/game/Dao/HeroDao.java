package com.itheima.game.Dao;

import com.itheima.game.domain.Hero;

import java.util.ArrayList;

public class HeroDao {

    ArrayList<Hero> list = new ArrayList<>();

    public void addHero(Hero hero) {
        list.add(hero);

    }

    public ArrayList<Hero> getHero() {

        return list;
    }

    public void removeHero(String name ) {
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.size()!=0&&list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }

    public void setHero(Hero hero,String name) {
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.size()!=0&&list.get(i).getName().equals(name)){
                list.set(i,hero);
            }
        }
    }
}
