/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.editor.verification;

import java.util.prefs.Preferences;
import org.netbeans.modules.php.editor.verification.TooManyLinesHint.TraitLinesHint;

/**
 *
 * @author Ondrej Brejla <obrejla@netbeans.org>
 */
public class TraitLinesCustomizer extends javax.swing.JPanel {
    private final Preferences preferences;
    private final TraitLinesHint traitLineHint;

    public TraitLinesCustomizer(Preferences preferences, TraitLinesHint traitLineHint) {
        this.preferences = preferences;
        this.traitLineHint = traitLineHint;
        initComponents();
        maxAllowedLinesSpinner.getModel().setValue(traitLineHint.getMaxAllowedLines(preferences));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maxAllowedLinesLabel = new javax.swing.JLabel();
        maxAllowedLinesSpinner = new javax.swing.JSpinner();

        org.openide.awt.Mnemonics.setLocalizedText(maxAllowedLinesLabel, org.openide.util.NbBundle.getMessage(TraitLinesCustomizer.class, "TraitLinesCustomizer.maxAllowedLinesLabel.text")); // NOI18N

        maxAllowedLinesSpinner.setModel(new javax.swing.SpinnerNumberModel(100, 1, 1000, 1));
        maxAllowedLinesSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maxAllowedLinesSpinnerStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maxAllowedLinesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxAllowedLinesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxAllowedLinesLabel)
                    .addComponent(maxAllowedLinesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maxAllowedLinesSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maxAllowedLinesSpinnerStateChanged
        traitLineHint.setMaxAllowedLines(preferences, (Integer) maxAllowedLinesSpinner.getValue());
    }//GEN-LAST:event_maxAllowedLinesSpinnerStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel maxAllowedLinesLabel;
    private javax.swing.JSpinner maxAllowedLinesSpinner;
    // End of variables declaration//GEN-END:variables
}
