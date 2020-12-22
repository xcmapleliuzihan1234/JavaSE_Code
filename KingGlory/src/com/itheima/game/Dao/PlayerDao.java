package com.itheima.game.Dao;

import com.itheima.game.domain.Player;

import java.util.ArrayList;

public class PlayerDao {
    ArrayList<Player> list = new ArrayList<>();
    public void addPlayer(Player player) {
        list.add(player);
    }

    public ArrayList<Player> findPlayer() {

        return list;
    }

    public void alterPlayer(Player player, String name) {
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.size()!=0&&list.get(i).getName().equals(name)){
                list.set(i,player);
            }
        }
    }

    public void deletePlayer(String name) {
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.size()!=0&&list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }
}
