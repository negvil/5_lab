/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
 
public class ContactEditorUI extends javax.swing.JFrame {
    
  LinkedList<RecIntegral> arrInteg = new LinkedList<>();
  private static final int NUM_THREADS = 6;
  private ExecutorService threadPool;
  
    public ContactEditorUI() {
         initComponents();
    
    threadPool = Executors.newFixedThreadPool(NUM_THREADS);
         
         // Добавление обработчиков для кнопок файловых операций
    jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));
    jButton5.addActionListener(evt -> jButton5ActionPerformed(evt));
    jButton6.addActionListener(evt -> jButton6ActionPerformed(evt));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonResult = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldUpperLimit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRange = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLowerLimit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(java.awt.Color.orange);

        jPanel1.setBackground(new java.awt.Color(153, 255, 51));

        jButtonResult.setBackground(new java.awt.Color(255, 102, 0));
        jButtonResult.setText("Resault");
        jButtonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(255, 102, 0));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(255, 102, 0));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 255, 204));
        jLabel3.setText("Step");

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("Lower limit");

        jLabel2.setBackground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Upper limit");

        jTable1.setBackground(new java.awt.Color(255, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lower Limit", "Upper Limit", "Range", "Resault"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setBackground(new java.awt.Color(102, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("√x");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setText("Collection");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setText("Записать в текстовый файл");

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setText("Считать из текстового файла ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 204));
        jButton5.setText("Записать в бинарный файл");

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.setText("Считать из бинарного файла");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLowerLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResult)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUpperLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRange, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUpperLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLowerLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonDelete))
                .addGap(18, 18, 18)
                .addComponent(jButtonResult)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        double LowerLimit = 0.1;
        double UpperLimit = 1;
        double Range = 0.1;
try{
        LowerLimit = Double.parseDouble(jTextFieldLowerLimit.getText());
        UpperLimit = Double.parseDouble(jTextFieldUpperLimit.getText());
        Range = Double.parseDouble(jTextFieldRange.getText());

       DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();

            RecIntegral rec = new RecIntegral(LowerLimit, UpperLimit, Range);
            arrInteg.add(rec);

            tModel.addRow(new Object[] {rec.getLowerLimit(), rec.getUpperLimit(), rec.getRange(), rec.getResult()});
        }catch (InvalidRangeException exe){
            JOptionPane.showMessageDialog(this, 
            exe.getMessage() + "Вы ввели: " + exe.getErrVal(), 
            "Ошибка диапазона", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
            "Введите корректные числа ", 
            "Ошибка ввода", JOptionPane.WARNING_MESSAGE);
        } finally{
        jTextFieldLowerLimit.setText("");
        jTextFieldUpperLimit.setText("");
        jTextFieldRange.setText("");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();

        int rowNum = jTable1.getSelectedRow();

        if (rowNum == -1){
            JOptionPane.showMessageDialog(null, "выберите строку");
        }else{
            tModel.removeRow(rowNum);
            arrInteg.remove(rowNum);
           
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultActionPerformed
                                         
    DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
    int rowNum = jTable1.getSelectedRow();
    
    if (rowNum == -1) {
        JOptionPane.showMessageDialog(null, "выберите строку");
        return;
    }
    
    try {
        double a = Double.parseDouble(tModel.getValueAt(rowNum, 0).toString());
        double b = Double.parseDouble(tModel.getValueAt(rowNum, 1).toString());
        double step = Double.parseDouble(tModel.getValueAt(rowNum, 2).toString());
        
        final int currentRow = rowNum;
        final double finalA = a;
        final double finalB = b;
        final double finalStep = step;
        
        final long overallStartTime = System.currentTimeMillis();
        final LocalTime overallStartLocal = LocalTime.now();

        threadPool.submit(() -> {
            try {
                double intervalWidth = (finalB - finalA) / NUM_THREADS;
                List<TrapezoidCalculator> calculators = new ArrayList<>();
                List<Thread> threads = new ArrayList<>();
                
                System.out.println("Общее время начала: " + overallStartLocal.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
                System.out.println("Интеграл от " + finalA + " до " + finalB + " с шагом " + finalStep);
                System.out.println("Количество потоков: " + NUM_THREADS + "\n");
                
                // Создаём и запускаем 6 потоков 
                for (int i = 0; i < NUM_THREADS; i++) {
                    double start = finalA + i * intervalWidth;
                    double end = (i == NUM_THREADS - 1) ? finalB : start + intervalWidth;
                    
                    TrapezoidCalculator calculator = new TrapezoidCalculator(start, end, finalStep);
                    calculators.add(calculator);
                    
                    Thread thread = new Thread(calculator, "Поток-" + (i+1));
                    threads.add(thread);
                    thread.start();
                }
                
                // Ожидание завершения всех потоков
                for (Thread thread : threads) {
                    thread.join();
                }
                
                double totalResult = 0;
                StringBuilder timesInfo = new StringBuilder();
                timesInfo.append("\nВРЕМЯ ВЫПОЛНЕНИЯ ПОТОКОВ\n");
                
                for (int i = 0; i < calculators.size(); i++) {
                    TrapezoidCalculator calc = calculators.get(i);
                    totalResult += calc.getPartialResult();
                    timesInfo.append("Поток-" + (i+1) + ": " + calc.getExecutionTime() + " мс\n");
                }
                
                final double result = totalResult;
                final long overallEndTime = System.currentTimeMillis();
                final long totalExecutionTime = overallEndTime - overallStartTime;
                
                System.out.println(timesInfo.toString());
                System.out.println("Общее время выполнения: " + totalExecutionTime + " мс");
                System.out.println("Суммарный результат: " + result);
                
                javax.swing.SwingUtilities.invokeLater(() -> {
                    try {
                        RecIntegral rec = new RecIntegral(finalA, finalB, finalStep);
                        rec.setResult(result);
                        arrInteg.set(currentRow, rec);
                        tModel.setValueAt(result, currentRow, 3);
                        
                        JOptionPane.showMessageDialog(this, 
                            "Вычисление завершено!\n" +
                            "Количество потоков: " + NUM_THREADS + "\n" +
                            "Общее время: " + totalExecutionTime + " мс\n" +
                            "Результат: " + String.format("%.6f", result) + "\n\n" +
                            timesInfo.toString(),
                            "Многопоточное вычисление", JOptionPane.INFORMATION_MESSAGE);
                    } catch (InvalidRangeException ex) {
                        tModel.setValueAt("Ошибка", currentRow, 3);
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                });
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Ошибка в данных: " + ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
  
    }//GEN-LAST:event_jButtonResultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0); 
        
        for (RecIntegral item : arrInteg) {
          
         tModel.addRow(new Object[] {item.getLowerLimit(), item.getUpperLimit(), item.getRange(), item.getResult()});
        }
    }//GEN-LAST:event_jButton2ActionPerformed

         // ЗАПИСЬ В ТЕКСТОВЫЙ ФАЙЛ (jButton3)
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (arrInteg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Коллекция пуста, нечего сохранять", 
                    "Предупреждение", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setDialogTitle("Сохранить в текстовый файл");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Текстовые файлы (*.txt)", "txt"));
        
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Всего объектов: " + arrInteg.size() + "\n\n");
                
                for (int i = 0; i < arrInteg.size(); i++) {
                    RecIntegral ri = arrInteg.get(i);
                    writer.write("Объект " + (i+1) + ":\n");
                    writer.write("LowerLimit=" + ri.getLowerLimit() + "\n");
                    writer.write("UpperLimit=" + ri.getUpperLimit() + "\n");
                    writer.write("Range=" + ri.getRange() + "\n");
                    writer.write("Result=" + ri.getResult() + "\n");
                    writer.write("---\n");
                }
                
                JOptionPane.showMessageDialog(this, "Данные сохранены в файл:\n" + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ошибка сохранения: " + ex.getMessage(), 
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
     // ЧТЕНИЕ ИЗ ТЕКСТОВОГО ФАЙЛА (jButton4)
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setDialogTitle("Загрузить из текстового файла");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Текстовые файлы (*.txt)", "txt"));
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                arrInteg.clear();
                DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
                tModel.setRowCount(0);
                
                String line;
                double lower = 0, upper = 0, range = 0, result = 0;
                int objectCount = 0;
                
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("LowerLimit=")) {
                        lower = Double.parseDouble(line.substring(11));
                    } else if (line.startsWith("UpperLimit=")) {
                        upper = Double.parseDouble(line.substring(11));
                    } else if (line.startsWith("Range=")) {
                        range = Double.parseDouble(line.substring(6));
                    } else if (line.startsWith("Result=")) {
                        result = Double.parseDouble(line.substring(7));
                        
                        try {
                            RecIntegral ri = new RecIntegral(lower, upper, range);
                            ri.setResult(result);
                            arrInteg.add(ri);
                            tModel.addRow(new Object[]{ri.getLowerLimit(), ri.getUpperLimit(), 
                                                       ri.getRange(), ri.getResult()});
                            objectCount++;
                        } catch (InvalidRangeException ex) {
                            JOptionPane.showMessageDialog(this, "Ошибка данных в файле: " + ex.getMessage(), 
                                    "Ошибка", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(this, "Загружено объектов: " + objectCount);
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ошибка загрузки: " + ex.getMessage(), 
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // ЗАПИСЬ В БИНАРНЫЙ ФАЙЛ (jButton5) - сериализация
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        if (arrInteg.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Коллекция пуста, нечего сохранять", 
                    "Предупреждение", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setDialogTitle("Сохранить в бинарный файл");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Бинарные файлы (*.ser)", "ser"));
        
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".ser")) {
                file = new File(file.getAbsolutePath() + ".ser");
            }
            
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(file)))) {
                out.writeObject(arrInteg);
                JOptionPane.showMessageDialog(this, "Коллекция сохранена в бинарный файл:\n" + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ошибка сохранения: " + ex.getMessage(), 
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // ЧТЕНИЕ ИЗ БИНАРНОГО ФАЙЛА (jButton6) - десериализация
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser(".");
        fileChooser.setDialogTitle("Загрузить из бинарного файла");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Бинарные файлы (*.ser)", "ser"));
        
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            
            try (ObjectInputStream in = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(file)))) {
                
                @SuppressWarnings("unchecked")
                LinkedList<RecIntegral> loadedList = (LinkedList<RecIntegral>) in.readObject();
                arrInteg.clear();
                arrInteg.addAll(loadedList);
                
                DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
                tModel.setRowCount(0);
                
                for (RecIntegral ri : arrInteg) {
                    tModel.addRow(new Object[]{ri.getLowerLimit(), ri.getUpperLimit(), 
                                               ri.getRange(), ri.getResult()});
                }
                
                JOptionPane.showMessageDialog(this, "Загружено объектов из бинарного файла: " + arrInteg.size());
                
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Ошибка загрузки: " + ex.getMessage(), 
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new ContactEditorUI().setVisible(true);
            }
        });
    }
   
   @Override
    public void dispose() {
    if (threadPool != null) {
        threadPool.shutdown();
    }
    super.dispose();
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLowerLimit;
    private javax.swing.JTextField jTextFieldRange;
    private javax.swing.JTextField jTextFieldUpperLimit;
    // End of variables declaration//GEN-END:variables
}
