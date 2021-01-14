/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct_project;

/**
 *
 * @author Usman Ghani Mughal
 */
public class MinHeap extends javax.swing.JFrame {
     static int size=32;
    int n;
    int arr[]=new int[size];
    /**
     * Creates new form MinHeap
     */
    public MinHeap() {
        initComponents();
        n=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InsertArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InsertTextField = new javax.swing.JTextField();
        InsertButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DelText = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
        TreeArea = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        TreeFull = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        InsertArea.setBackground(new java.awt.Color(255, 0, 255));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel1.setText("    Insert");

        InsertTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertTextFieldActionPerformed(evt);
            }
        });

        InsertButton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        InsertButton.setText(" Enter");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel3.setText("Delete");

        EnterButton.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        EnterButton.setText(" Enter");
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InsertAreaLayout = new javax.swing.GroupLayout(InsertArea);
        InsertArea.setLayout(InsertAreaLayout);
        InsertAreaLayout.setHorizontalGroup(
            InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertAreaLayout.createSequentialGroup()
                .addGroup(InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(InsertAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InsertTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DelText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InsertAreaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(InsertAreaLayout.createSequentialGroup()
                .addComponent(InsertButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnterButton)
                .addGap(31, 31, 31))
        );
        InsertAreaLayout.setVerticalGroup(
            InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InsertAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InsertAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertButton)
                    .addComponent(EnterButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        TreeArea.setBackground(new java.awt.Color(255, 102, 102));
        TreeArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l1.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 6, 25, 30));

        l2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l2.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 39, 25, 30));

        l3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l3.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 39, 25, 30));

        l4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l4.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 81, 25, 30));

        l5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l5.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 81, 25, 30));

        l6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l6.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 81, 25, 30));

        l7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l7.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 81, 25, 30));

        l8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l8.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 119, 25, 30));

        l9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l9.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 119, 25, 30));

        l10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l10.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 119, 25, 30));

        l11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l11.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 119, 25, 30));

        l12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l12.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 117, 25, 30));

        l13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l13.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l13, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 117, 25, 30));

        l14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l14.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l14, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 117, 25, 30));

        l15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l15.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 117, 25, 30));

        TreeFull.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        TreeFull.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(TreeFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 299, 313, 25));

        l16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l16.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l16, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 154, 25, 30));

        l17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l17.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 154, 23, 30));

        l18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l18.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l18, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 156, 24, 30));

        l19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l19.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l19, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 156, 24, 30));

        l20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l20.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l20, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 156, 23, 30));

        l21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l21.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l21, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 156, 20, 30));

        l22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l22.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l22, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 156, 24, 30));

        l23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l23.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l23, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 156, 22, 30));

        l24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l24.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l24, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 156, 20, 30));

        l25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l25.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l25, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 156, 20, 30));

        l26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l26.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l26, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 156, 20, 30));

        l27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l27.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l27, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 156, 19, 30));

        l28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l28.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l28, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 156, 24, 30));

        l29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l29.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l29, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 156, 24, 30));

        l30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l30.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l30, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 154, 24, 30));

        l31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        l31.setBorder(new javax.swing.border.MatteBorder(null));
        TreeArea.add(l31, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 154, 24, 30));

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        jLabel6.setText("   MIN Heap");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InsertArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TreeArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InsertArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(TreeArea, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertTextFieldActionPerformed

    }//GEN-LAST:event_InsertTextFieldActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
       int num=Integer.parseInt(InsertTextField.getText());
        this.insert(num,n);
        InsertTextField.setText("");
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
       int num=Integer.parseInt(DelText.getText());
       this.delete(num); DelText.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      this.setVisible(false);
      new Main_Frame().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    public void insert(int num,int loc)
    {
        int par;
        while(loc>0)
        {
            par=(loc-1)/2;
            if(num>=this.arr[par])
            {
                this.arr[loc]=num;
                n++;
                this.display(n);
                return;
            }
            this.arr[loc]=this.arr[par];
            loc=par;
        }
        this.arr[0]=num;
        this.arr[loc]=num;
        n++;
        this.display(n);
    }
     public void display(int n)
    {
        int i,z;
        if(n==0)
       {
           System.out.println("Heap is Empty");
           return;
       }
       for(i=0;i<n;i++)
       {
           switch(i)
           {
               case 0:
               {
                   l1.setText(Integer.toString(this.arr[i]));
                   
                   break;
               }
               case 1:
               {
                   l2.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 2:
               {
                   l3.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 3:
               {
                   l4.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 4:
               {
                   l5.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 5:
               {
                   l6.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 6:
               {
                   l7.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 7:
               {
                   l8.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 8:
               {
                   l9.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 9:
               {
                   l10.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 10:
               {
                   l11.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 11:
               {
                   l12.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 12:
               {
                   l13.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 13:
               {
                   l14.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 14:
               {
                   l15.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 15:
               {
                   l16.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 16:
               {
                   l17.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 17:
               {
                   l18.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 18:
               {
                   l19.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 19:
               {
                   l20.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 20:
               {
                   l21.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 21:
               {
                   l22.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 22:
               {
                   l23.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 23:
               {
                   l24.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 124:
               {
                   l25.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 25:
               {
                   l26.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 26:
               {
                   l27.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 27:
               {
                   l28.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 28:
               {
                   l29.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 29:
               {
                   l30.setText(Integer.toString(this.arr[i]));
                   break;
               }
               case 30:
               {
                   l31.setText(Integer.toString(this.arr[i]));
                   break;
               }
               default:
               {
                   TreeFull.setText("Tree is FULL");
                   break;
               }
           }
           
       }
        
    }
     void del_last(int n)
    {
           switch(n)
           {
               case 0:
               {
                   l1.setText(" ");
                   
                   break;
               }
               case 1:
               {
                   l2.setText(" ");
                   break;
               }
               case 2:
               {
                   l3.setText(" ");
                   break;
               }
               case 3:
               {
                   l4.setText(" ");
                   break;
               }
               case 4:
               {
                   l5.setText(" ");
                   break;
               }
               case 5:
               {
                   l6.setText(" ");
                   break;
               }
               case 6:
               {
                   l7.setText(" ");
                   break;
               }
               case 7:
               {
                   l8.setText(" ");
                   break;
               }
               case 8:
               {
                   l9.setText(" ");
                   break;
               }
               case 9:
               {
                   l10.setText(" ");
                   break;
               }
               case 10:
               {
                   l11.setText(" ");
                   break;
               }
               case 11:
               {
                   l12.setText(" ");
                   break;
               }
               case 12:
               {
                   l13.setText(" ");
                   break;
               }
               case 13:
               {
                   l14.setText(" ");
                   break;
               }
               case 14:
               {
                   l15.setText(" ");
                   break;
               }
               case 15:
               {
                   l16.setText(" ");
                   break;
               }
               case 16:
               {
                   l17.setText(" ");
                   break;
               }
               case 17:
               {
                   l18.setText(" ");
                   break;
               }
               case 18:
               {
                   l19.setText(" ");
                   break;
               }
               case 19:
               {
                   l20.setText(" ");
                   break;
               }
               case 20:
               {
                   l21.setText(" ");
                   break;
               }
               case 21:
               {
                   l22.setText(" ");
                   break;
               }
               case 22:
               {
                   l23.setText(" ");
                   break;
               }
               case 23:
               {
                   l24.setText(" ");
                   break;
               }
               case 124:
               {
                   l25.setText(" ");
                   break;
               }
               case 25:
               {
                   l26.setText(" ");
                   break;
               }
               case 26:
               {
                   l27.setText(" ");
                   break;
               }
               case 27:
               {
                   l28.setText(" ");
                   break;
               }
               case 28:
               {
                   l29.setText(" ");
                   break;
               }
               case 29:
               {
                   l30.setText(" ");
                   break;
               }
               case 30:
               {
                   l31.setText(" ");
                   break;
               }
               default:
               {
                   TreeFull.setText("Tree is FULL");
                   break;
               }
           }
           
       
    }
     public void delete(int num)
    {
        int left,right,temp,par,i;
        for(i=0;i<n;i++)
        {
            if(num==this.arr[i])
            {
                break;
            }
        }
        if(num!=this.arr[i])
        {
            
           
            return;
        }
        this.arr[i]=this.arr[n-1];
        this.display(n);
        this.del_last(n-1);
        n--;
        par=(i-1)/2;
        if(this.arr[i]<this.arr[par])
        {
            this.insert(this.arr[i],i);
            return;
        }
        left=2*i+1;
        right=2*i+2;
        while(right<n)
        {
            if(this.arr[i]<=this.arr[left]&&this.arr[i]<=this.arr[right])
            {
                return;
            }
            if(this.arr[right]>=this.arr[left])
            {
                temp=arr[i];
                arr[i]=arr[left];
                this.arr[left]=temp;
                i=left;
                this.display(n);
            }
            else
            {
                temp=arr[i];
                arr[i]=arr[right];
                this.arr[right]=temp;
                i=right;
                this.display(n);
            }
            left=2*i+1;
            right=2*i+2;
        }
        if(left==n-1&&this.arr[i]>this.arr[left])
        {
            temp=this.arr[i];
            this.arr[i]=this.arr[left];
            this.arr[left]=temp;
            this.display(n);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MinHeap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinHeap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinHeap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinHeap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinHeap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField DelText;
    public javax.swing.JButton EnterButton;
    private javax.swing.JPanel InsertArea;
    public javax.swing.JButton InsertButton;
    public javax.swing.JTextField InsertTextField;
    private javax.swing.JPanel TreeArea;
    public javax.swing.JLabel TreeFull;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel l1;
    public javax.swing.JLabel l10;
    public javax.swing.JLabel l11;
    public javax.swing.JLabel l12;
    public javax.swing.JLabel l13;
    public javax.swing.JLabel l14;
    public javax.swing.JLabel l15;
    public javax.swing.JLabel l16;
    public javax.swing.JLabel l17;
    public javax.swing.JLabel l18;
    public javax.swing.JLabel l19;
    public javax.swing.JLabel l2;
    public javax.swing.JLabel l20;
    public javax.swing.JLabel l21;
    public javax.swing.JLabel l22;
    public javax.swing.JLabel l23;
    public javax.swing.JLabel l24;
    public javax.swing.JLabel l25;
    public javax.swing.JLabel l26;
    public javax.swing.JLabel l27;
    public javax.swing.JLabel l28;
    public javax.swing.JLabel l29;
    public javax.swing.JLabel l3;
    public javax.swing.JLabel l30;
    public javax.swing.JLabel l31;
    public javax.swing.JLabel l4;
    public javax.swing.JLabel l5;
    public javax.swing.JLabel l6;
    public javax.swing.JLabel l7;
    public javax.swing.JLabel l8;
    public javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
