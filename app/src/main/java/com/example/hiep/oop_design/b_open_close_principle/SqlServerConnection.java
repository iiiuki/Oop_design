package com.example.hiep.oop_design.b_open_close_principle;

/**
 * Created by Hiep on 9/30/2016.
 */
public class SqlServerConnection extends ConnectCSDL {
    @Override
    public void doConnect() {
        System.out.println("Connect to SQL Server");
    }
}
