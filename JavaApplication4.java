// figura 14.9: textfieldframe java
//demontrando a classe jtextfield.
import java.awt.FlowLayout;
import java.awt.event.Actionlistener;
import java.awt.event.ActionEvent;
import javax.swing.jframe;
import javax.swing.jtextfield;
import javax.swing.jpasswordfield;
import javax.swing.joptionpane;

public class texfieldframe extends jframe
(
   private jtextfield texfield; // campo de texto com tamanho configurado
   private jtextfield texfield2; // campo de texto construído com texto
   private jtextfield texfield3; // campo de com texto e tamanho
   private jpasswordfield passwordfield; // campo de senha com texto

   // construtor textfieldframe adiciona jtextfields a jframe
   public textfieldframe()
   {
     super( "testing jtextfield and jpassswordfield" );
     setlayout( new flowlayout() ): // configura o layout de frame
    // constrói textfield com 10 colunas
    textfield1 = new jtextfield(10);
    add(textfield); // adiciona textfield ao jframe

    // contrói campo de texto com texto padrão
    texfield2 = new jtextfield( "enter text here" );
    add( textfield2 ): // adiciona textfield2 ao jframe

    // constrói textfield com o texto padrão e 21 colunas
    texfield3 - new jtextfield( "uneditable text field", 21);
    textfield3.seteditable( false ); // desativa a ediçaõ
    add( textfield3 ): // adiciona textfield ao jframe

    // constroí passwordfield com o texto padraõ
    passwordfield - new jpasswordfield( "hidden text" );
    add( passwordfield ): // adiciona passwordfield ao jframe

    // handlers de eventos registradores
    texfieldhadler handler = new textfieldhandler():
    textfield1.addactionlistener( handler ):
    textfield2.addactionlistener( handler ):
    textfield3.addactionlistener( handler ):
    passwordfield.addactionlistener( handler ):
    // fim do construtor textfieldframe
    // classe interna private para tratamento de evento
    private class textfieldhandler implements actionlistener
    {
      // processa eventos de campo de texto
      public void actionperformed( actionevent event )
      {
          string string - ""://declara string a ser exibida
          //usuário pressionou enter no jtextfield textfield
          if (event.getsource()-- textfield1 )
          string = string.format( "textfield: %s",
                  event.getactioncommand()):
          // usuário pressionou enter no jtextfield textfield2
          else if (event.getsource()-- textfield2 )
          string = string.format( "textfield2: %s")
