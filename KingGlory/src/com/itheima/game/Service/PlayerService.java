package com.itheima.game.Service;

import com.itheima.game.Dao.PlayerDao;
import com.itheima.game.domain.Player;

import java.util.ArrayList;

public class PlayerService {
    ArrayList<Player> list =new ArrayList<>();
        PlayerDao pd = new PlayerDao();
    public void addPlayer(Player player) {
        pd.addPlayer(player);
    }

    public boolean isExisit(String name) {
        int index=-1;
        list = pd.findPlayer();
        for (int i = 0; i < list.size(); i++) {
            if(list.size()!=0&&list.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }if(index == -1){
            return false;
        }else {
            return true;
        }

    }

    public ArrayList<Player> findPlayer() {
       return pd.findPlayer();
    }

    public void alterPlayer(Player player, String name) {
        pd.alterPlayer(player,name);
    }

    public void deletePlayer(String name) {
        pd.deletePlayer(name);
    }
}
