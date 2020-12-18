package com.itheima.game.Service;

import com.itheima.game.Dao.HeroDao;
import com.itheima.game.domain.Hero;

import java.util.ArrayList;

public class HeroService {
   private static ArrayList<Hero> list = new ArrayList<>();
    HeroDao hd = new HeroDao();

    public void addHero(Hero hero) {
        hd.addHero(hero);

    }

    public boolean isExisit(String name) {
        int index = -1;
        list = hd.getHero();
        for (int i = 0; i < list.size(); i++) {
            if (list.size() != 0 && list.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<Hero> getHero() {
        return hd.getHero();

    }

    public void removeHero(String name) {
        hd.removeHero(name);
    }

    public void setHero(Hero hero,String name) {
        hd.setHero(hero,name);
    }
}
