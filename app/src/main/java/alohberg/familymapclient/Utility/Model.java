package alohberg.familymapclient.Utility;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Filter;

import alohberg.familymapclient.BaseObjects.event;
import alohberg.familymapclient.BaseObjects.person;

public class Model {
    private static final Model anInstance = new Model();

    private String authToken = "";

    private String userID = "";

    private List<String> eventTypes;

    private List<person> people;

    private List<event> events;

    //private Settings settings;

    private Map<String, List<event>> personEvents;

    private Filter filter;

    //private Map<String, MapColor> eventTypeColors;

    private Set<String> paternalAncestors;

    private Set<String> maternalAncestors;

    private Map<String, List<person>> personsChildren;


    //Default Constructor
    private Model(){

    }

    public static Model getInstance(){
        return anInstance;
    }

    public void setAuthToken(String auth){
        authToken = auth;
    }

    public boolean checkLoggedIn(){
        if(authToken == null || authToken.equals("")){
            return false;
        }
        return true;
    }

    //Get's the stored auth token
    public String getAuthToken(){
        return authToken;
    }

    public void setUserID(String currentUsersID){
        userID = currentUsersID;
    }

    //For now it just stores the events data
    public void setEventList(List<event> newEvents){
        events = newEvents;
    }

    //Stores the people data
    public void setPersonList(List<person> newPersons){
        people = newPersons;
    }
}
