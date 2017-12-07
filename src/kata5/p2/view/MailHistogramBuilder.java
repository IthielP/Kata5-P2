/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5.p2.view;
import kata5.p2.model.Histogram;
import kata5.p2.model.Mail;
import java.util.List;

/**
 *
 * @author Ithiel
 */

 
 public class MailHistogramBuilder {
     
     public static Histogram<String> build(List<Mail> mail){
         Histogram<String> histo = new Histogram<>();
         for (Mail mail1 : mail) {
             histo.increment(mail1.getDomain());
         }
         return histo;
     }
 
 }