package ru.alttiri.Trash.Others.Trash;

import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            int x = in.nextInt();
            int y = in.nextInt();
            int nextCheckpointX = in.nextInt(); // x position of the next check point
            int nextCheckpointY = in.nextInt(); // y position of the next check point
            int nextCheckpointDist = in.nextInt(); // distance to the next checkpoint
            int nextCheckpointAngle = in.nextInt(); // angle between your pod orientation and the direction of the next checkpoint
            int opponentX = in.nextInt();
            int opponentY = in.nextInt();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // You have to output the target position
            // followed by the power (0 <= thrust <= 100)
            // i.e.: "x y thrust"



            String thrust;
            if(nextCheckpointAngle > 90 || nextCheckpointAngle < -90){
                thrust = Integer.toString(0);
            }
            else{
                thrust =  Integer.toString(100);;
            }

            if (nextCheckpointDist>9000 && (nextCheckpointAngle < 35 && nextCheckpointAngle > -35)){
                thrust = "BOOST";
            }

            System.out.println(nextCheckpointX + " " + nextCheckpointY + " " + thrust);
        }
    }


}