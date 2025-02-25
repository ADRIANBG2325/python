import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
public class Pantalla extends JFrame implements ActionListener, Estatus{
    ImageFondo ejemplo = new ImageFondo();
    private JFrame ventProm;
    private JLabel tf, u1, u2, u3, u4, u5, rep, aprob, snCal;
    //private JLabel unds = new JLabel();
    private JComboBox semestres, carreras,sems;
    private JPanel p1, p2, p3, p4, p5, panRep, panApr;
    private JTextField[] cubito1,cubito2,cubito3,cubito4,cubito5;
    int f,g,h,j,i,C,p,q;
    
    private void primerSem(){
            JLabel calculoDif = new JLabel("Calculo Dif.:");
            calculoDif.setBounds(10, 30, 200, 25);
            calculoDif.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(calculoDif);
            
            JLabel quimica = new JLabel("Quimica:");
            quimica.setBounds(10, 60, 200, 25);
            quimica.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(quimica);
            
            JLabel fundPro = new JLabel("Fund. DE Pro.");
            fundPro.setBounds(10, 90, 200, 25);
            fundPro.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(fundPro);
           
            JLabel matDisc = new JLabel("Mat. Discretas:");
            matDisc.setBounds(10, 120, 200, 25);
            matDisc.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(matDisc);
            
            JLabel desaSust = new JLabel("Desa. Sust.:");
            desaSust.setBounds(10, 150, 200, 25);
            desaSust.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(desaSust);
            
            JLabel fundInv = new JLabel("Fund. de Inv.:");
            fundInv.setBounds(10, 180, 200, 25);
            fundInv.setFont(new Font("Tahoma", Font.BOLD, 16));
            p1.add(fundInv);

            h=1;
    }
    private void segundoSem(){
            JLabel calculoInt = new JLabel("Calculo Int.:");
            calculoInt.setBounds(10, 30, 200, 25);
            calculoInt.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(calculoInt);
            
            JLabel fisica = new JLabel("Fisica:");
            fisica.setBounds(10, 60, 200, 25);
            fisica.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(fisica);
            
            JLabel pOO = new JLabel("P.O.O");
            pOO.setBounds(10, 90, 200, 25);
            pOO.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(pOO);
           
            JLabel probaEstad = new JLabel("Prob. Y Est.:");
            probaEstad.setBounds(10, 120, 200, 25);
            probaEstad.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(probaEstad);
            
            JLabel admin = new JLabel("T. Admin.:");
            admin.setBounds(10, 150, 200, 25);
            admin.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(admin);
            
            JLabel algebraLin = new JLabel("Algebra L.:");
            algebraLin.setBounds(10, 180, 200, 25);
            algebraLin.setFont(new Font("Tahoma", Font.BOLD, 16));
            p2.add(algebraLin);

            h=2;
    }
    private void tercerSem(){
            JLabel calculoDat = new JLabel("Calculo Vect.:");
            calculoDat.setBounds(10, 30, 200, 25);
            calculoDat.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(calculoDat);
            
            JLabel estrDat = new JLabel("Estr. Datos:");
            estrDat.setBounds(10, 60, 200, 25);
            estrDat.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(estrDat);
            
            JLabel fundTel = new JLabel("Fund. De Tel.");
            fundTel.setBounds(10, 90, 200, 25);
            fundTel.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(fundTel);
           
            JLabel invOp = new JLabel("Inv. de Op.:");
            invOp.setBounds(10, 120, 200, 25);
            invOp.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(invOp);
            
            JLabel sitemasOp = new JLabel("S. Operativos:");
            sitemasOp.setBounds(10, 150, 200, 25);
            sitemasOp.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(sitemasOp);
            
            JLabel pEyAD = new JLabel("Prin. Elec. Y Ap. Dig:");
            pEyAD.setBounds(10, 180, 200, 25);
            pEyAD.setFont(new Font("Tahoma", Font.BOLD, 16));
            p3.add(pEyAD);
           
            h=3;
    }
    private void cuartoSem(){
            JLabel ecuaDif = new JLabel("Ec. Dif.:");
            ecuaDif.setBounds(10, 30, 200, 25);
            ecuaDif.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(ecuaDif);
            
            JLabel metNum = new JLabel("Metodos Num.:");
            metNum.setBounds(10, 60, 200, 25);
            metNum.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(metNum);
            
            JLabel topAvPro = new JLabel("Top. Av. de Pro.");
            topAvPro.setBounds(10, 90, 200, 25);
            topAvPro.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(topAvPro);
           
            JLabel fundBaseD = new JLabel("Fund. Base Dat.:");
            fundBaseD.setBounds(10, 120, 200, 25);
            fundBaseD.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(fundBaseD);
            
            JLabel tSitemasOp = new JLabel("T. S. Operativos:");
            tSitemasOp.setBounds(10, 150, 200, 25);
            tSitemasOp.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(tSitemasOp);
            
            JLabel arqComp = new JLabel("Arq. de Comp.:");
            arqComp.setBounds(10, 180, 200, 25);
            arqComp.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(arqComp);
            
            JLabel etica = new JLabel("T. Etica:");
            etica.setBounds(10, 210, 200, 25);
            etica.setFont(new Font("Tahoma", Font.BOLD, 16));
            p4.add(etica);
            
            h=4;
    }
    private void quintoSem(){
            JLabel lengAuto = new JLabel("Leng. Automatas.:");
            lengAuto.setBounds(10, 30, 200, 25);
            lengAuto.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(lengAuto);
            
            JLabel redesC = new JLabel("Redes Comp.:");
            redesC.setBounds(10, 60, 200, 25);
            redesC.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(redesC);
            
            JLabel baseDatos = new JLabel("T. Base Datos");
            baseDatos.setBounds(10, 90, 200, 25);
            baseDatos.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(baseDatos);
           
            JLabel simulacion = new JLabel("Simulacion:");
            simulacion.setBounds(10, 120, 200, 25);
            simulacion.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(simulacion);
            
            JLabel fundIngSoft = new JLabel("Fund. Ing. Soft.:");
            fundIngSoft.setBounds(10, 150, 200, 25);
            fundIngSoft.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(fundIngSoft);
            
            JLabel lengIntz = new JLabel("Leng. Interfaz:");
            lengIntz.setBounds(10, 180, 200, 25);
            lengIntz.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(lengIntz);
            
            JLabel contFinc = new JLabel("Conta. Finac.:");
            contFinc.setBounds(10, 210, 200, 25);
            contFinc.setFont(new Font("Tahoma", Font.BOLD, 16));
            p5.add(contFinc);
            
            h=5;
    }
    int J, h1, h2, h3, h4, h5;
    public Pantalla(){
        
        this.setContentPane(ejemplo);
        
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(10,100,350,250);
        p1.setVisible(false);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(10,100,350,250);
        p2.setVisible(false);
        
        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(10,100,350,250);
        p3.setVisible(false);
        
        p4 = new JPanel();
        p4.setLayout(null);
        p4.setBounds(10,100,350,250);
        p4.setVisible(false);
        
        p5 = new JPanel();
        p5.setLayout(null);
        p5.setBounds(10,100,350,250);
        p5.setVisible(false);
        
            u1 = new JLabel("U1");
            u1.setBounds(180,5, 25, 25);
            u1.setFont(new Font("Tahoma", Font.BOLD, 16));
 
            u2 = new JLabel("U2");
            u2.setBounds(210, 5, 25, 25);
            u2.setFont(new Font("Tahoma", Font.BOLD, 16));
            
            u3 = new JLabel("U3");
            u3.setBounds(240, 5, 25, 25);
            u3.setFont(new Font("Tahoma", Font.BOLD, 16));
           
            u4 = new JLabel("U4");
            u4.setBounds(270, 5, 25, 25);
            u4.setFont(new Font("Tahoma", Font.BOLD, 16));

            u5 = new JLabel("U5");
            u5.setBounds(300, 5, 25, 25);
            u5.setFont(new Font("Tahoma", Font.BOLD, 16));

        
        primerSem();
        segundoSem();
        tercerSem();
        cuartoSem();
        quintoSem();
        
	setLayout(null);
        setTitle("REGISTRO DE CALIFICACIONES");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550,450); 
        setVisible(true);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
                
        JLabel carrera = new JLabel("CARRERA:");
        carrera.setBounds(30, 22, 200, 20);
        carrera.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(carrera);
        
        carreras = new JComboBox();
        carreras.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                q+=1;
                String carr = carreras.getSelectedItem().toString();
                if (q == 2){
                    carr = "";
                q=0;
                }
                if(carr.equals("Ing. Sistemas")){
                    C = 03;    
                }
            }
        });
        carreras.setBounds(150, 20, 200, 27);
        add(carreras);
        carreras.addItem("Ing. Logistica");
        carreras.addItem("Ing. Mecatronica");
        carreras.addItem("Ing. Sistemas");
        carreras.addItem("Ing. TIC's");
        carreras.addItem("Ing. Civil");
        
        JLabel semestre = new JLabel("SEMESTRE:");
        semestre.setBounds(30, 62, 200, 20);
        semestre.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(semestre);
        semestres = new JComboBox();
        semestres.setBounds(150, 60, 200, 27);
        semestres.addItem("1er Semestre"); 
        semestres.addItem("2do Semestre");
        semestres.addItem("3er Semestre");
        semestres.addItem("4to Semestre");
        semestres.addItem("5to Semestre");
        //semestres.addItem("6to Semestre");
        //semestres.addItem("7mo Semestre");
        add(semestres);
        
        semestres.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(C == 03){
                    p+=1;
                    mostrarSemestres();
                }
                
            }
        });
        
        JButton botonGuar= new JButton("GUARDAR");
        botonGuar.setBounds(375, 10, 100, 25); 
        botonGuar.addActionListener(this); 
        add(botonGuar);
        add(botonLimp());
        add(botonCancelar());
        add(botonProm());
            
        f=0;
        int k=0;
        cubito1 = new JTextField[30];
            for(j=1; j<=6; j++){
                f = f +(30);
                g=130;
                for(i=1; i<=5; i++){
                    g = g + 30;
                    cubito1[k] = new JTextField();
                    cubito1[k].setBounds(g, f, 25, 25);
                    p1.add(cubito1[k]);
                    k+=1;
                }
            }
        cubito2 = new JTextField[30];
            f=0;
            k=0;
            for(j=1; j<=6; j++){
                f = f +(30);
                g=130;
                for(i=1; i<=5; i++){
                    g = g + 30;
                    cubito2[k] = new JTextField();
                    cubito2[k].setBounds(g, f, 25, 25);
                    p2.add(cubito2[k]);
                    k+=1;
                }
            }  
        cubito3 = new JTextField[30];
            f=0;
            k=0;
            for(j=1; j<=6; j++){
                f = f +(30);
                g=160;
                for(i=1; i<=5; i++){
                    g = g + 30;
                    cubito3[k] = new JTextField();
                    cubito3[k].setBounds(g, f, 25, 25);
                    p3.add(cubito3[k]);
                    k+=1;
                }
            }  
        cubito4 = new JTextField[35];
            f=0;
            k=0;
            for(j=1; j<=7; j++){
                f = f +(30);
                g=130;
                for(i=1; i<=5; i++){
                    g = g + 30;
                    cubito4[k] = new JTextField();
                    cubito4[k].setBounds(g, f, 25, 25);
                    p4.add(cubito4[k]);
                    k+=1;
                }
            }  
        cubito5 = new JTextField[35];
            f=0;
            k=0;
            for(j=1; j<=7; j++){
                f = f +(30);
                g=150;
                for(i=1; i<=5; i++){
                    g = g + 30;
                    
                    cubito5[k] = new JTextField();
                    cubito5[k].setBounds(g, f, 25, 25);
                    p5.add(cubito5[k]);
                    k+=1;
                }
            }
    }
    public class ImageFondo extends JPanel{
        
        private Image imagen;
        
        public void paint(Graphics g){
            try{
            imagen = new ImageIcon(getClass().getResource("imagen3.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
            }catch(NullPointerException npe){
                System.out.printf("No esta la imagen \n"+npe+"\n");
            }
        }
    }        
    
    public JButton botonLimp(){
        JButton botonLimp= new JButton("LIMPIAR");
        botonLimp.setBounds(375, 70, 100, 25); 
        
        Pantalla.EvBotnLimp evento2 = new Pantalla.EvBotnLimp();
        botonLimp.addActionListener(evento2); 
        return botonLimp;
    }
    private class EvBotnLimp implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            for (int k=0; k<30;k++){
            cubito1[k].setText(null);
            cubito2[k].setText(null);
            cubito3[k].setText(null);
            }
            for (int k=0; k<35;k++){
            cubito4[k].setText(null);
            cubito5[k].setText(null);
            }
            g1=0;g2=0;g3=0;g4=0;g5=0;
        }
    }
    public JButton botonCancelar(){
        JButton botonCancel = new JButton("CANCELAR");
        botonCancel.setBounds(375, 40, 100, 25);
        
        Pantalla.EvBotnCancel evento2 = new Pantalla.EvBotnCancel();
        botonCancel.addActionListener(evento2); 
        return botonCancel;
    }
    private class EvBotnCancel implements ActionListener{
   
        public void actionPerformed(ActionEvent ae) {
            CuentaUser2 ventana = new CuentaUser2();
            ventana.setLayout(null);
            ventana.setTitle("Iniciar Sesion");
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,200); 
            ventana.setVisible(true);
            dispose();
        }
    }
    public JButton botonProm(){
        JButton botonProm = new JButton("PROMEDIO");
        botonProm.setBounds(375, 100, 100, 25);
        
        Pantalla.EvBotnProm evento2 = new Pantalla.EvBotnProm();
        botonProm.addActionListener(evento2); 
        return botonProm;
    }
    int ret = 0;
    String sem;
    private void mostrarSemestres(){
        sem = semestres.getSelectedItem().toString();
        if (p == 2){
            sem = "";
            p=0;
        }
        if (sem.equals("1er Semestre")){
            p1.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            //p6.setVisible(false);
            //p7.setVisible(false);
            ret=1;
        }else if (sem.equals("2do Semestre")){
            p1.setVisible(false);
            p2.setVisible(true);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(false);
            //p6.setVisible(false);
            //p7.setVisible(false);
            ret = 2;
        }else if (sem.equals("3er Semestre")){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(true);
            p4.setVisible(false);
            p5.setVisible(false);
            //p6.setVisible(false);
            //p7.setVisible(false);
            ret = 3;
        }else if (sem.equals("4to Semestre")){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(true);
            p5.setVisible(false);
            //p6.setVisible(false);
            //p7.setVisible(false);
            ret = 4;
        }else if (sem.equals("5to Semestre")){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            p5.setVisible(true);
            //p6.setVisible(false);
            //p7.setVisible(false);
            ret = 5;
        }
    }
    byte P1, P2, P3, P4, P5;
    int U1, U2, U3, U4, U5, g1,g2,g3,g4,g5, gt, gt1;
    public void actionPerformed(ActionEvent ae) {
        //U1 = 0;U2 = 0;U3 = 0;U4 = 0;U5 = 0;
        try{
        if (ret == 1){
            U1=0;
            for (int y=0; y<30; y++){
                String O1 = cubito1[y].getText();
                P1 = Byte.parseByte(O1);
                U1+=P1;    
            }
        }
        g1= U1;
        //System.out.println(g1);
        if (ret == 2){
            U2=0;
            for (int y=0; y<30; y++){
                String O2 = cubito2[y].getText();
                P2 = Byte.parseByte(O2);
                U2+=P2;
            }
        }
        
        g2= U2;
        if (ret == 3){
            U3=0;
            for (int y=0; y<30; y++){
                String O3 = cubito3[y].getText();
                P3 = Byte.parseByte(O3);
                U3+=P3;
            }
        }
        g3= U3;
        if (ret == 4){
            U4=0;
        for (int y=0; y<35; y++){
            String O4 = cubito4[y].getText();
            P4 = Byte.parseByte(O4);
            U4+=P4;
        }
        }
        g4= U4;
        if (ret == 5){
            U5=0;
            for (int y=0; y<35; y++){
                String O5 = cubito5[y].getText();
                P5 = Byte.parseByte(O5);
                U5+=P5;
            }
        }
        g5= U5;
        }catch(NumberFormatException nfe){
            System.out.println(" Dijite solo numeros del 1-100 "+nfe);
    }
    }
    byte op, fx;
    String calif;
    private class EvBotnProm implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            op=0;
            while (op==0){
            fx = Byte.parseByte(JOptionPane.showInputDialog("Cuantos semestres llevas cursando (1-5)"));
            premio();
            }
            ventProm = new JFrame();
            ventProm.setLayout(null);
            ventProm.setTitle("REGISTRO DE CALIFICACIONES");
            ventProm.setLocationRelativeTo(null);
            ventProm.setSize(300,250); 
            ventProm.setVisible(true);
        
        tf = new JLabel();
        tf.setBounds(50, 80, 200 ,25);
                
        JLabel semestres = new JLabel("PROMEDIO SEMESTRES");
        semestres.setBounds(30, 10, 200, 25);
        semestres.setFont(new Font("Tahoma", Font.BOLD, 16));
        ventProm.add(semestres);
        
        sems = new JComboBox();
        sems.setBounds(30, 40, 200, 27);
        sems.addItem("1er Semestre"); 
        sems.addItem("2do Semestre");
        sems.addItem("3er Semestre");
        sems.addItem("4to Semestre");
        sems.addItem("5to Semestre");
        //sems.addItem("6to Semestre");
        //sems.addItem("7mo Semestre");
        //sems.addItem("8vo Semestre");
        ventProm.add(sems);
        ventProm.add(tf);

            rep = new JLabel("Reprobado");
            rep.setBounds(100, 100, 200, 50);
            rep.setVisible(false);
            ventProm.add(rep);
            
            aprob = new JLabel("Aprobado");
            aprob.setBounds(100, 100, 200, 50);
            aprob.setVisible(false);
            ventProm.add(aprob);
            
            snCal = new JLabel("Establece calificacion");
            snCal.setBounds(80, 100, 200, 50);
            snCal.setVisible(false);
            ventProm.add(snCal);
        
        sems.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                calif = sems.getSelectedItem().toString();
                if (calif.equals("1er Semestre")){
                    tf.setText("calificacion "+calif+" "+(g1/30));
                    evCalif();
                }
                if (calif.equals("2do Semestre")){
                    tf.setText("calificacion "+calif+" "+(g2/30));
                    evCalif();
                }
                if (calif.equals("3er Semestre")){
                    tf.setText("calificacion "+calif+" "+(g3/30));
                    evCalif();
                }
                if (calif.equals("4to Semestre")){
                    tf.setText("calificacion "+calif+" "+(g4/35));
                    evCalif();
                }
                if (calif.equals("5to Semestre")){
                    tf.setText("calificacion "+calif+" "+(g5/35));
                    evCalif();
                }
            }
        });
        }
    }
    @Override
    public void evCalif() {
            float gt1=g1/30;
            float gt2=g2/30;
            float gt3=g3/30;
            float gt4=g4/35;
            float gt5=g5/35;
        if (calif.equals("1er Semestre")){
            if (gt1<70){
                rep.setVisible(true);
                aprob.setVisible(false);
                snCal.setVisible(false);
            }if (gt1 >= 70) {
                rep.setVisible(false);
                aprob.setVisible(true);
                snCal.setVisible(false);
            }if (gt1 == 0){
                rep.setVisible(false);
                aprob.setVisible(false);
                snCal.setVisible(true);
            }
            
        }
        if (calif.equals("2do Semestre")){
            if (gt2<70){
                rep.setVisible(true);
                aprob.setVisible(false);
                snCal.setVisible(false);
            
            }if (gt2 >= 70) {
                rep.setVisible(false);
                aprob.setVisible(true);
                snCal.setVisible(false);
            }if (gt2 == 0){
                rep.setVisible(false);
                aprob.setVisible(false);
                snCal.setVisible(true);
            }
        }
        if (calif.equals("3er Semestre")){
            if (gt3<70){
                rep.setVisible(true);
                aprob.setVisible(false);
                snCal.setVisible(false);
            }if (gt3 >= 70) {
                rep.setVisible(false);
                aprob.setVisible(true);
                snCal.setVisible(false);
            }if (gt3 == 0){
                rep.setVisible(false);
                aprob.setVisible(false);
                snCal.setVisible(true);
            }
        }
        if (calif.equals("4to Semestre")){
            if (gt4<70){
                rep.setVisible(true);
                aprob.setVisible(false);
                snCal.setVisible(false);
            
            }if (gt4 >= 70) {
                rep.setVisible(false);
                aprob.setVisible(true);
                snCal.setVisible(false);
            }if (gt4 == 0){
                rep.setVisible(false);
                aprob.setVisible(false);
                snCal.setVisible(true);
            }
        }
        if (calif.equals("5to Semestre")){
            if (gt5<70){
                rep.setVisible(true);
                aprob.setVisible(false);
                snCal.setVisible(false);
            
            }if (gt5 >= 70) {
                rep.setVisible(false);
                aprob.setVisible(true); 
                snCal.setVisible(false);
            }if (gt5 == 0){
                rep.setVisible(false);
                aprob.setVisible(false);
                snCal.setVisible(true);
            }
        }
    }
    int f1, f2,f3,f4,f5;
    @Override
    public void premio() {
        f1=g1/30;
        f2=g2/30;
        f3=g3/30;
        f4=g4/31;
        f5=g5/31;
        try{
        gt = (f1+f2+f3+f4+f5);
        //System.out.println(gt+"\n"+fx);
        gt1= (gt/fx);
        //System.out.println(gt1);
        if (gt > 85){
            JOptionPane.showMessageDialog(null, "Felicidades hasta el momento tienes una calificacion de "+gt1+" \n por lo que conservas tu beca de aprovechamiento" );
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Oma\\Desktop\\prueba.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        }
        op=1;
        } catch (IOException ex) {
            System.out.println("Error! La ubicacion no se encontro");
            op=1;
        }catch(ArithmeticException ae){
            System.out.println("Por favor indique un numero del 'UNO al CINCO'");
            op=0;
        }
    }
    public static void main(String [] args)throws IOException{
        Pantalla pantalla = new Pantalla();
    }
}
