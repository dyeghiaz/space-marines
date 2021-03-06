package com.rockbite.hackathon.sm.communications.actions;

import com.rockbite.hackathon.sm.communications.Action;

import org.json.JSONException;
import org.json.JSONObject;

public class MinionUpdate extends Action {

    public int user_id;
    public int slot_id;

    public int atk;
    public int hp;

    public float cooldown;

    public boolean destroyed;

    public void set(int user_id, int slot_id, JSONObject minionJson) {
        this.user_id = user_id;
        this.slot_id = slot_id;

        try {
            atk = minionJson.getInt("atk");
            hp = minionJson.getInt("hp");

            cooldown = (float) minionJson.getDouble("cooldown");

            destroyed = minionJson.getBoolean("destroyed");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
