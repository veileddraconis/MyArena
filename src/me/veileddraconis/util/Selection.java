package me.veileddraconis.util;

import org.bukkit.util.BlockVector;

/**
 * Created by Draconis on 1/20/2016.
 */
public class Selection {

    protected BlockVector startPoint;
    protected BlockVector endPoint;

    protected int lengthX, widthZ, heightY;


    private void calculateDimensions() {

        if(startPoint.getBlockX() != endPoint.getBlockX()) {

            if(startPoint.getBlockX() > endPoint.getBlockX()) {

                if(startPoint.getBlockX() >= 0) {

                    if(endPoint.getBlockX() >= 0) {

                        lengthX = startPoint.getBlockX() - endPoint.getBlockX();

                    }
                    else {

                        lengthX = startPoint.getBlockX() + Math.abs(endPoint.getBlockX());

                    }

                }
                else {

                    lengthX = Math.abs(endPoint.getBlockX()) - Math.abs(startPoint.getBlockX());

                }

            }
            else {

                if(endPoint.getBlockX() >= 0) {

                    if(startPoint.getBlockX() >= 0) {

                        lengthX = endPoint.getBlockX() - startPoint.getBlockX();

                    }
                    else {

                        lengthX = endPoint.getBlockX() + Math.abs(startPoint.getBlockX());

                    }

                }
                else {

                    lengthX = Math.abs(startPoint.getBlockX()) - Math.abs(endPoint.getBlockX());

                }

            }

        }
        else {

            lengthX = 1;

        }


        if(startPoint.getBlockZ() != endPoint.getBlockZ()) {

            if(startPoint.getBlockZ() > endPoint.getBlockZ()) {

                if(startPoint.getBlockZ() >= 0) {

                    if(endPoint.getBlockZ() >= 0) {

                        widthZ = startPoint.getBlockZ() - endPoint.getBlockZ();

                    }
                    else {

                        widthZ = startPoint.getBlockZ() + Math.abs(endPoint.getBlockZ());

                    }

                }
                else {

                    widthZ = Math.abs(endPoint.getBlockZ()) - Math.abs(startPoint.getBlockZ());

                }

            }
            else {

                if(endPoint.getBlockZ() >= 0) {

                    if(startPoint.getBlockZ() >= 0) {

                        widthZ = endPoint.getBlockZ() - startPoint.getBlockZ();

                    }
                    else {

                        widthZ = endPoint.getBlockZ() + Math.abs(startPoint.getBlockZ());

                    }

                }
                else {

                    widthZ = Math.abs(startPoint.getBlockZ()) - Math.abs(endPoint.getBlockZ());

                }

            }

        }
        else {

            widthZ = 1;

        }


        if(startPoint.getBlockY() != endPoint.getBlockY()) {

            if(startPoint.getBlockY() > endPoint.getBlockY()) {

                if(startPoint.getBlockY() >= 0) {

                    if(endPoint.getBlockY() >= 0) {

                        heightY = startPoint.getBlockY() - endPoint.getBlockY();

                    }
                    else {

                        heightY = startPoint.getBlockY() + Math.abs(endPoint.getBlockY());

                    }

                }
                else {

                    heightY = Math.abs(endPoint.getBlockY()) - Math.abs(startPoint.getBlockY());

                }

            }
            else {

                if(endPoint.getBlockY() >= 0) {

                    if(startPoint.getBlockY() >= 0) {

                        heightY = endPoint.getBlockY() - startPoint.getBlockY();

                    }
                    else {

                        heightY = endPoint.getBlockY() + Math.abs(startPoint.getBlockY());

                    }

                }
                else {

                    heightY = Math.abs(startPoint.getBlockY()) - Math.abs(endPoint.getBlockY());

                }

            }

        }
        else {

            heightY = 1;

        }

    }
    public int getVolume() {

        return (lengthX * widthZ * heightY);

    }
}
