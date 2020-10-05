
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        String path = getServletContext().getRealPath("/WEB-INF/notes.txt");
       BufferedReader br = new BufferedReader(new FileReader(new File(path)));
       String title = br.readLine();
       String contents = br.readLine();
      
        Note note = new Note(title, contents);
       // nn.setTitle(title);
        //nn.setContents(contents);
       request.setAttribute("note", note);
       if(request.getParameter("edit") != null){
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").
        forward(request, response);
       }
       else{
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").
        forward(request, response);
       }
        
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String path = getServletContext().getRealPath("/WEB-INF/notes.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       String title = request.getParameter("title");
       String contents = request.getParameter("contents");
       //br.close();
        Note note = new Note(title, contents);
       // nn.setTitle(title);
       // nn.setContents(contents);
       request.setAttribute("note", note);
       
      
        pw.write(title + " \n" + contents);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").
        forward(request, response);
        
    }

  
}
