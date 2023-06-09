package com.example.restglassfishhelloworld;

import com.google.gson.Gson;
import model.Message;
import services.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/messages")
public class MessageResource {
    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getText() {
        return messageService.getAllMessages();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public String getTextJSON() {
        return new Gson().toJson(messageService.getAllMessages());
    }
}
