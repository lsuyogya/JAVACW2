import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Component;


public class INGNepal implements ActionListener {

    public static void main(String[] args) {
        new INGNepal();
    }
        //DECLARING VARIABLES

        String[] selectionString = {"---SELECT---","Full time staff", "Part time staff"};
        JComboBox<String> selectComboBox = new JComboBox<String>(selectionString);
    
        JFrame frame = new JFrame();
        private JTextField vacNoFTextField = new JTextField();
        private JTextField designationFTextField = new JTextField();
        private JTextField workingHrFTextField = new JTextField(10);
        private JTextField salaryTextField = new JTextField(10);
        private JTextField staffNameFTextField = new JTextField();
        private JTextField qualificationFTextField = new JTextField();
        private JTextField joiningDateFTextField = new JTextField();
        private JTextField appointdByFTextField = new JTextField();
        private JTextField vacNoAppointFTextField =new JTextField();

        private JTextField vacNoTextField = new JTextField();
        private JTextField designationTextField = new JTextField();
        private JTextField workingHrTextField = new JTextField(10);
        private JTextField staffNameTextField = new JTextField();
        private JTextField qualificationTextField = new JTextField();
        private JTextField joiningDateTextField = new JTextField();
        private JTextField appointdByTextField = new JTextField();
        private JTextField workingShiftsTextField = new JTextField();
        private JTextField wagesPerHrTextField = new JTextField();
        private JTextField vacNoAppointTextField =new JTextField();
    
        private JButton addButton = new JButton("ADD");
        private JButton addFButton = new JButton("ADD");
        private JButton appointButton = new JButton("Appoint"); 
        private JButton appointFButton = new JButton("Appoint"); 
        private JButton terminateButton = new JButton("Terminate");
        private JButton displayFButton = new JButton("Display");
        private JButton displayButton = new JButton("Display");
        private JButton clearFButton = new JButton("Clear");
        private JButton clearButton = new JButton("Clear");
    
        private JPanel fullTimeContainer = new JPanel();
        private JPanel partTimeContainer = new JPanel();
        boolean fullTimeAdded = false;
        boolean partTimeAdded = false; 
        ArrayList<StaffHire> bokuNoList =  new ArrayList<StaffHire>(); 
        
        //Accessors
        public String getVacNoFTextField(){
            return vacNoFTextField.getText();
        }
        public String getDesignationFTextField(){
            return designationFTextField.getText();
        }
        public String getWorkingHrFTextField(){
            return workingHrFTextField.getText();
        }
        public String getSalaryTextField(){
            return salaryTextField.getText();
        }
        public String getStaffNameFTextField(){
            return staffNameFTextField.getText();
        }
        public String getQualificationFTextField(){
            return qualificationFTextField.getText();
        }
        public String getJoiningDateFTextField(){
            return joiningDateFTextField.getText();
        }
        public String getAppointdByFTextField(){
            return appointdByFTextField.getText();
        }
        public String getVacNoAppointFTextField(){
            return vacNoAppointFTextField.getText();
        }

        public String getVacNoTextField(){
            return vacNoTextField.getText();
        }
        public String getDesignationTextField(){
            return designationTextField.getText();
        }
        public String getWorkingHrTextField(){
            return workingHrTextField.getText();
        }
        public String getStaffNameTextField(){
            return staffNameTextField.getText();
        }
        public String getQualificationTextField(){
            return qualificationTextField.getText();
        }
        public String getJoiningDateTextField(){
            return joiningDateTextField.getText();
        }
        public String getAppointdByTextField(){
            return appointdByTextField.getText();
        }
        public String getWorkingShiftsTextField(){
            return workingShiftsTextField.getText();
        }
        public String getWagesPerHrTextField(){
            return wagesPerHrTextField.getText();
        }
        public String getVacNoAppointTextField(){
            return vacNoAppointTextField.getText();
        }

    public void fullTimeGUI(){
        fullTimeContainer.setBounds(0, 60, 975, 316);
        fullTimeContainer.setLayout(null);

        /*-----------------1st row------------------*/
        JLabel vacNoLabel = new JLabel("Vacancy No ") ;
        fullTimeContainer.add(vacNoLabel);
        vacNoLabel.setBounds(10, 5, 100, 20);
        fullTimeContainer.add(vacNoFTextField);
        vacNoFTextField.setBounds(110, 5, 150, 20);

        JLabel designationLabel = new JLabel("Designation ") ;
        fullTimeContainer.add(designationLabel);
        designationLabel.setBounds(350, 5, 100, 20);
        fullTimeContainer.add(designationFTextField);
        designationFTextField.setBounds(450, 5, 150, 20);

        JLabel workingHrLabel = new JLabel("Working Hours") ;
        fullTimeContainer.add(workingHrLabel);
        // workingHrLabel.setBounds(350, 35, 100, 20);
        workingHrLabel.setBounds(700, 5, 100, 20);
        fullTimeContainer.add(workingHrFTextField);
        workingHrFTextField.setBounds(800, 5, 150, 20);
        // workingHrFTextField.setBounds(450, 35, 150, 20);

        /*---------------2nd row  --------------------*/
        JLabel salaryLabel = new JLabel("Salary") ;
        fullTimeContainer.add(salaryLabel);
        salaryLabel.setBounds(10, 35, 100, 20);
        fullTimeContainer.add(salaryTextField);
        salaryTextField.setBounds(110, 35, 150, 20);

        /*--------------3rd row -------------*/
        fullTimeContainer.add(addFButton); 
        addFButton.setBounds(430, 70, 100, 20);
        addFButton.addActionListener(this);

        /*--------------4th row -------------*/
        JLabel staffNameLabel = new JLabel("Staff Name") ;
        fullTimeContainer.add(staffNameLabel);
        staffNameLabel.setBounds(10, 130, 100, 20);
        fullTimeContainer.add(staffNameFTextField);
        staffNameFTextField.setBounds(110, 130, 150, 20);

        JLabel qualificationLabel = new JLabel("Qualification") ;
        fullTimeContainer.add(qualificationLabel);
        qualificationLabel.setBounds(350, 130, 100, 20);
        fullTimeContainer.add(qualificationFTextField);
        qualificationFTextField.setBounds(450, 130, 150, 20);

        JLabel joiningDateLabel = new JLabel("Joining Date") ;
        fullTimeContainer.add(joiningDateLabel);
        joiningDateLabel.setBounds(700, 130, 100, 20);
        fullTimeContainer.add(joiningDateFTextField);
        joiningDateFTextField.setBounds(800, 130, 150, 20);

        /*--------------5th row -------------*/
        
        JLabel appointedByLabel = new JLabel("Appointed By") ;
        fullTimeContainer.add(appointedByLabel);
        appointedByLabel.setBounds(10, 160, 100, 20);
        fullTimeContainer.add(appointdByFTextField);
        appointdByFTextField.setBounds(110, 160, 150, 20);

        JLabel vacNoFAppointLabel = new JLabel("Vacancy No");
        fullTimeContainer.add(vacNoFAppointLabel);
        vacNoFAppointLabel.setBounds(350, 160, 100, 20);
        fullTimeContainer.add(vacNoAppointFTextField);
        vacNoAppointFTextField.setBounds(450, 160, 150, 20);;

        /*--------------------6th row----------------------------*/
        fullTimeContainer.add(appointFButton);
        appointFButton.setBounds(100, 220, 120, 20);
        appointFButton.addActionListener(this);

        fullTimeContainer.add(displayFButton);
        displayFButton.setBounds(300, 220, 120, 20);
        displayFButton.addActionListener(this);

        fullTimeContainer.add(clearFButton);
        clearFButton.setBounds(500, 220, 120, 20);
        clearFButton.addActionListener(this);

        partTimeContainer.setVisible(false);
        fullTimeContainer.setVisible(true);
    }

    public void partTimeGUI(){
        partTimeContainer.setBounds(0, 60, 975, 316);
        partTimeContainer.setLayout(null);
        /*-----------------1st row------------------*/
        JLabel vacNoLabel = new JLabel("Vacancy No ") ;
        partTimeContainer.add(vacNoLabel);
        vacNoLabel.setBounds(10, 5, 100, 20);
        partTimeContainer.add(vacNoTextField);
        vacNoTextField.setBounds(110, 5, 150, 20);

        JLabel designationLabel = new JLabel("Designation ") ;
        partTimeContainer.add(designationLabel);
        designationLabel.setBounds(350, 5, 100, 20);
        partTimeContainer.add(designationTextField);
        designationTextField.setBounds(450, 5, 150, 20);

        JLabel workingShiftLabel = new JLabel("Working Shift ") ;
        partTimeContainer.add(workingShiftLabel);
        // workingShiftLabel.setBounds(700, 35, 100, 20);
        workingShiftLabel.setBounds(700, 5, 100, 20);
        partTimeContainer.add(workingShiftsTextField);
        workingShiftsTextField.setBounds(800, 5, 150, 20);
        // workingShiftsTextField.setBounds(800, 35, 150, 20);

        /*---------------2nd row  --------------------*/
        JLabel wagesPerHrLabel = new JLabel("Wages Per Hour") ;
        partTimeContainer.add(wagesPerHrLabel);
        wagesPerHrLabel.setBounds(10, 35, 100, 20);
        partTimeContainer.add(wagesPerHrTextField);
        wagesPerHrTextField.setBounds(110, 35, 150, 20);

        JLabel workingHrLabel = new JLabel("Working Hours") ;
        partTimeContainer.add(workingHrLabel);
        workingHrLabel.setBounds(350, 35, 100, 20);
        partTimeContainer.add(workingHrTextField);
        workingHrTextField.setBounds(450, 35, 150, 20);

        /*--------------3rd row -------------*/
        partTimeContainer.add(addButton); 
        addButton.setBounds(430, 70, 100, 20);
        addButton.addActionListener(this);

        /*--------------4th row -------------*/
        JLabel staffNameLabel = new JLabel("Staff Name") ;
        partTimeContainer.add(staffNameLabel);
        staffNameLabel.setBounds(10, 130, 100, 20);
        partTimeContainer.add(staffNameTextField);
        staffNameTextField.setBounds(110, 130, 150, 20);

        JLabel qualificationLabel = new JLabel("Qualification") ;
        partTimeContainer.add(qualificationLabel);
        qualificationLabel.setBounds(350, 130, 100, 20);
        partTimeContainer.add(qualificationTextField);
        qualificationTextField.setBounds(450, 130, 150, 20);

        JLabel joiningDateLabel = new JLabel("Joining Date") ;
        partTimeContainer.add(joiningDateLabel);
        joiningDateLabel.setBounds(700, 130, 100, 20);
        partTimeContainer.add(joiningDateTextField);
        joiningDateTextField.setBounds(800, 130, 150, 20);

        /*--------------5th row -------------*/
        JLabel appointedByLabel = new JLabel("Appointed by");
        partTimeContainer.add(appointedByLabel);
        appointedByLabel.setBounds(10, 160, 100, 20);
        partTimeContainer.add(appointdByTextField);
        appointdByTextField.setBounds(110, 160, 150, 20);

        JLabel vacNoFAppointLabel = new JLabel("Vacancy No");
        partTimeContainer.add(vacNoFAppointLabel);
        vacNoFAppointLabel.setBounds(350, 160, 100, 20);
        partTimeContainer.add(vacNoAppointTextField);
        vacNoAppointTextField.setBounds(450, 160, 150, 20);;

        /*--------------------6th row----------------------------*/
        partTimeContainer.add(appointButton);
        appointButton.setBounds(100, 220, 120, 20);
        appointButton.addActionListener(this);

        partTimeContainer.add(displayButton);
        displayButton.setBounds(300, 220, 120, 20);
        displayButton.addActionListener(this);

        partTimeContainer.add(clearButton);
        clearButton.setBounds(500, 220, 120, 20);
        clearButton.addActionListener(this);

        partTimeContainer.add(terminateButton);
        terminateButton.setBounds(700, 220, 120, 20);
        terminateButton.addActionListener(this);  

        fullTimeContainer.setVisible(false);
        partTimeContainer.setVisible(true);
    }
    
    public INGNepal(){
        frame.setLayout(null);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.add(selectComboBox);
        selectComboBox.setBounds(400, 10, 200, 20);
        selectComboBox.addActionListener(this);
        fullTimeGUI();
        partTimeGUI();
        frame.add(partTimeContainer);
        frame.add(fullTimeContainer);
        fullTimeContainer.setVisible(false);
        partTimeContainer.setVisible(false);
        frame.setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource()==addButton || event.getSource()==addFButton){
                boolean isrepeated = false;
                boolean error = false;

                if(selectComboBox.getSelectedItem().toString()=="Full time staff"){
                String vacNoFString= getVacNoFTextField();
                String designationFString = getDesignationFTextField();
                String jobTypeFString = selectComboBox.getSelectedItem().toString().substring(0, 9);
                String workingHourFString = getWorkingHrFTextField();
                String salaryString = getSalaryTextField();
                try {
                    intConvert(salaryString);
                    intConvert(vacNoFString);
                    intConvert(workingHourFString);
                    stringValidation(designationFString);   
                    stringValidation(jobTypeFString);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Invalid numbers");
                    error = true;
                }catch(IOException e){
                    JOptionPane.showMessageDialog(frame, "Invalid texts");
                    error = true;
                }
                for (StaffHire element : bokuNoList) {
                    if (element.getVacancyNO()==intConvert(vacNoFString)){
                        isrepeated=true;
                    }
                }
                
                if(isrepeated){
                    JOptionPane.showMessageDialog(frame, "Vacancy no repeated");
                }
                else if(error == false){
                    int     salary = intConvert(salaryString);
                    int     vacancyNoF = intConvert(vacNoFString);
                    String  designationF = designationFString;
                    String  jobTypeF = jobTypeFString;
                    int     workingHoursF = intConvert(workingHourFString);
                
                    FullTimeStaffHire fullTimeObj = new FullTimeStaffHire(vacancyNoF, designationF, jobTypeF, salary, workingHoursF);
                    bokuNoList.add(fullTimeObj);
                    JOptionPane.showMessageDialog(frame, "Full Time Vacancy Created");
                }        
            }
                else if(selectComboBox.getSelectedItem().toString()=="Part time staff"){
                    String vacNoString= getVacNoTextField();
                    String designationString = getDesignationTextField();
                    String jobTypeString = selectComboBox.getSelectedItem().toString().substring(0, 9);
                    String wagesPerHrString = getWagesPerHrTextField();
                    String shiftsString = getWorkingShiftsTextField();
                    String workingHourString = getWorkingHrTextField();
                    try {
                        intConvert(wagesPerHrString);
                        stringValidation(shiftsString);
                        intConvert(vacNoString);
                        intConvert(workingHourString);
                        stringValidation(designationString);   
                        stringValidation(jobTypeString);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(frame, "Invalid numbers");
                        error=true;
                    } catch(IOException e){
                        JOptionPane.showMessageDialog(frame, "Invalid texts");
                        error=true;
                    }
                    for (StaffHire element : bokuNoList) {
                        if (element.getVacancyNO() == intConvert(vacNoString)){
                            isrepeated=true;
                        }
                    }

                    if(isrepeated){
                        JOptionPane.showMessageDialog(frame, "Vacancy no repeated");
                    }
                    else if(error == false){
                        int     vacancyNo = intConvert(vacNoString);
                        String  designation = designationString;
                        String  jobType = jobTypeString;
                        int     workingHours = intConvert(workingHourString);
                        int     wagesPerHr = intConvert(wagesPerHrString);

                        PartTimeStaffHire partTimeObj = new PartTimeStaffHire(vacancyNo, designation, jobType, workingHours, wagesPerHr, shiftsString);
                        bokuNoList.add(partTimeObj);
                        JOptionPane.showMessageDialog(frame, "Part Time Vacancy Created");
                    }        
                }        
            }
            else if(event.getSource()==appointButton || event.getSource()==appointFButton){
                boolean error = false;
               
                if(selectComboBox.getSelectedItem().toString()=="Full time staff"){
                    String staffNameFString= getStaffNameFTextField();
                    String qualificationFString = getQualificationFTextField();
                    String joiningDateFString = getJoiningDateFTextField();
                    String vacNoAppointFString = getVacNoAppointFTextField();
                    String appointedByFString = getAppointdByFTextField();

                    try{
                        stringValidation(staffNameFString);   
                        stringValidation(qualificationFString);
                        stringValidation(appointedByFString);
                        stringValidation(joiningDateFString);
                        intConvert(vacNoAppointFString);

                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(frame, "Check the numbers again");
                        error = true;
                    }catch(IOException e){
                        JOptionPane.showMessageDialog(frame, "Check the texts again");
                        error = true;
                    }
                    
                    if(error==false){
                        boolean isFound = false;
                        boolean isPartTime = false;
                        // boolean canJoin = false;
                        for (StaffHire Selement : bokuNoList) {
                            if (Selement.getVacancyNO() == intConvert(vacNoAppointFString) && Selement instanceof FullTimeStaffHire){
                                FullTimeStaffHire Felement = (FullTimeStaffHire) Selement;
                                if(Felement.getJoined()){
                                    JOptionPane.showMessageDialog(frame, Felement.getStaffName()+" has already joined for this vacancy at "+ Felement.getJoiningDate());
                                }else{
                                    Felement.hireFullTimeStaff(staffNameFString, joiningDateFString, qualificationFString, appointedByFString);
                                    isFound = true;
                                }
                            }else if(Selement.getVacancyNO() == intConvert(vacNoAppointFString) && Selement instanceof PartTimeStaffHire){
                                isPartTime = true;
                        }
                        }if(isPartTime){
                                JOptionPane.showMessageDialog(frame, "Cannot appoint fulltime staff to part time vacancy");
                        }else{
                            if(isFound){
                                JOptionPane.showMessageDialog(frame, "Full time Staff Appointed");
                            }else{
                                JOptionPane.showMessageDialog(frame, "The vacancy number is invalid");
                            }
                        }
                    }
                }else if(selectComboBox.getSelectedItem().toString()=="Part time staff"){
                    String staffNameString= getStaffNameTextField();
                    String qualificationString = getQualificationTextField();
                    String joiningDateString = getJoiningDateTextField();
                    String vacNoAppointString = getVacNoAppointTextField();
                    String appointedByString = getAppointdByTextField();
                    
                    try{
                        stringValidation(staffNameString);   
                        stringValidation(qualificationString);
                        stringValidation(appointedByString);
                        stringValidation(joiningDateString);
                        intConvert(vacNoAppointString);  
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(frame, "Check the numbers again");
                        error = true;
                    }catch(IOException e){
                        JOptionPane.showMessageDialog(frame, "Check the texts again");
                        error = true;
                    }
                    if(error==false){
                        boolean isFound = false;
                        boolean isFullTime = false;
                        for (StaffHire Selement : bokuNoList) {
                            if(Selement.getVacancyNO()==intConvert(vacNoAppointString) && Selement instanceof PartTimeStaffHire){
                                PartTimeStaffHire Pelement = (PartTimeStaffHire) Selement;
                                if(Pelement.getJoined()){
                                    JOptionPane.showMessageDialog(frame, Pelement.getStaffName()+" has already been appointed for this vacancy at "+Pelement.getJoiningDate());
                                }else{
                                    Pelement.hirePartTimeStaff(staffNameString, joiningDateString, qualificationString, appointedByString);
                                    isFound=true;
                                }
                            }else if(Selement.getVacancyNO() == intConvert(vacNoAppointString) && Selement instanceof FullTimeStaffHire){
                                isFullTime = true;
                            }
                        }
                        if(isFullTime){
                            JOptionPane.showMessageDialog(frame, "Cannot appoint part time staff to full time vacancy");
                        }else{
                            if(isFound){
                                JOptionPane.showMessageDialog(frame, "Part time Staff Appointed");
                            }else{
                                JOptionPane.showMessageDialog(frame, "The vacancy number is invalid");
                            }
                        }
                    }
                }      
            }   
            else if(event.getSource()==displayButton || event.getSource()==displayFButton){
                System.out.println("==================================================================");
                for (StaffHire Selement : bokuNoList) {
                    if(Selement instanceof FullTimeStaffHire){
                        FullTimeStaffHire Felement = (FullTimeStaffHire) Selement;
                        Felement.display();
                        System.out.println("__________________________________________________________________");
                    }else{
                        PartTimeStaffHire Pelement = (PartTimeStaffHire) Selement;
                        Pelement.display();
                        System.out.println("__________________________________________________________________");
                    }
                }
            }   
            else if(event.getSource()==clearFButton){

                for (Component tfs : fullTimeContainer.getComponents()) {
                    if (tfs instanceof JTextField){
                        JTextField tf = (JTextField) tfs;
                        tf.setText("");
                    }
                }
                JOptionPane.showMessageDialog(frame, "Full Time Staff Cleared");
            }   
            else if(event.getSource()==clearButton){
                for (Component tfs : partTimeContainer.getComponents()) {
                    if (tfs instanceof JTextField){
                        JTextField tf = (JTextField) tfs;
                        tf.setText("");
                    }
                }
                JOptionPane.showMessageDialog(frame, "Part Time Staff Cleared");
            }   
            else if(event.getSource()==terminateButton){
                boolean error = false;
                boolean isterminated=false;
                boolean isFound = false;
                boolean isFullTime = false;
                try {
                    intConvert(getVacNoAppointTextField());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(frame, "Enter the vacancy number again");
                    error = true;
                }
                if (error == false){
                    for (StaffHire Selement : bokuNoList) {
                        if(Selement.getVacancyNO()== intConvert(getVacNoAppointTextField()) && Selement instanceof PartTimeStaffHire){
                            isFound = true;
                            PartTimeStaffHire pobj = (PartTimeStaffHire) Selement;
                            if(pobj.getTerimnated()){
                                isterminated = true;
                            }else{
                                pobj.terminate();
                                JOptionPane.showMessageDialog(frame, "Part Time Staff Terminated");
                            }
                        }else if (Selement.getVacancyNO()== intConvert(getVacNoAppointTextField()) && Selement instanceof FullTimeStaffHire){
                            // JOptionPane.showMessageDialog(frame, "The vacancy number was not found");
                            isFullTime=true;
                        }
                    }
                    if(isterminated) JOptionPane.showMessageDialog(frame, "The staff has already been terminated");
                    if(isFullTime) JOptionPane.showMessageDialog(frame, "Cannot terminate fulltime staff");
                    if(isFound==false) JOptionPane.showMessageDialog(frame, "The vacancy number is invalid");
                }
            }
            else if(event.getSource()==selectComboBox){
            if(selectComboBox.getSelectedItem().toString()=="Full time staff"){
                
                fullTimeContainer.setVisible(true);
                partTimeContainer.setVisible(false);
                SwingUtilities.updateComponentTreeUI(frame);

            }else if(selectComboBox.getSelectedItem().toString()=="Part time staff"){
                
                partTimeContainer.setVisible(true);
                fullTimeContainer.setVisible(false);
                SwingUtilities.updateComponentTreeUI(frame);

            }else if(selectComboBox.getSelectedItem().toString()=="---SELECT---"){
                
                partTimeContainer.setVisible(false);
                fullTimeContainer.setVisible(false);
                SwingUtilities.updateComponentTreeUI(frame);
            }
        }
        
    }
    public void stringValidation(String s) throws IOException{
        if (s.isBlank()){
            throw new IOException("The string is not valid");
        }
    }
    public int intConvert(String s){
        return Integer.parseInt(s);
    }
}