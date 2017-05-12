/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import uts.wsd.*;

/**
 *
 * @author 12545404
 */



@WebService(serviceName = "diaryApp")
public class DiarySOAP {
    
    
    public DiarySOAP() {
        
    }
    @Resource
    private WebServiceContext context;

    
    @WebMethod
    public Users fetchUsers() {
        try {
            DiaryApplication diaryApp = getDiaryApp();
            return diaryApp.getUsers();
        } catch (JAXBException ex) {
            Logger.getLogger(DiarySOAP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DiarySOAP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @WebMethod        
    public User fetchUser(String email) {
        try {
            return getDiaryApp().getUsers().getUser(email);
        } catch (JAXBException ex) {
            Logger.getLogger(DiarySOAP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DiarySOAP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @WebMethod
    private DiaryApplication getDiaryApp() throws JAXBException, IOException {
        // This needs to be local variable in your "getDiaryApp" method
// It will not work if declared as a field (since field initializers
// are executed before dependency injection takes place).
    ServletContext application = (ServletContext)context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
  // The web server can handle requests from different clients in parallel.
  // These are called "threads".
  //
  // We do NOT want other threads to manipulate the application object at the same
  // time that we are manipulating it, otherwise bad things could happen.
  //
  // The "synchronized" keyword is used to lock the application object while
  // we're manpulating it.
  synchronized (application) {
   DiaryApplication diaryApp = (DiaryApplication)application.getAttribute("diaryApp");
   if (diaryApp == null) {
    diaryApp = new DiaryApplication();
    diaryApp.setFilePath(application.getRealPath("WEB-INF/users.xml"));
    application.setAttribute("diaryApp", diaryApp);
   }
   return diaryApp;
  }
 }
}
