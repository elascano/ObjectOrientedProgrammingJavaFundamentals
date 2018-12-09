/** Copyright ESPE-DECC
*/

package ec.edu.espe.cursomicroservicios.cert05gestionligamaven.liga.utilitario;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;
import javafx.util.StringConverter;

/**
 *
 * @author edisonlascano
 */
public class UtilitarioForma {
 private static final String STILE_BORDER_VALIDATION = "-fx-border-color: #FF0000";
    private static final Tooltip toolTip = new Tooltip("Campo requerido.");
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void limpiarNodos(Node... nodos) {
        for (Node n : nodos) {
            if (n instanceof TextField) {
                TextField textField = (TextField) n;
                textField.setText("");
                removeToolTipAndBorderColor(textField, toolTip);
            }
            if (n instanceof TextArea) {
                TextArea textArea = (TextArea) n;
                textArea.setText("");
                textArea.setWrapText(true);
                removeToolTipAndBorderColor(textArea, toolTip);
            }
            if (n instanceof CheckBox) {
                CheckBox check = (CheckBox) n;
                check.setSelected(false);
            }
            if (n instanceof ComboBox) {
                ComboBox combo = (ComboBox) n;
                combo.getSelectionModel().clearSelection();
                removeToolTipAndBorderColor(combo, toolTip);
            }
            if (n instanceof ListView) {
                ListView combo = (ListView) n;
                combo.getSelectionModel().clearSelection();
                removeToolTipAndBorderColor(combo, toolTip);
            }
            if (n instanceof Label) {
                Label lbl = (Label) n;
                lbl.setText("");
                removeToolTipAndBorderColor(lbl, toolTip);
            }

            if (n instanceof DatePicker) {
                DatePicker dp = (DatePicker) n;
                dp.setValue(null);
                removeToolTipAndBorderColor(dp, toolTip);

            }
        }
    }
    
    public static boolean checkEmptyFields(Node... itemToCheck) {
        List<Node> failedFields = new ArrayList<>();
        toolTip.setStyle("-fx-background-color: linear-gradient(#FF6B6B , #FFA6A6 );"
                + " -fx-font-weight: bold;");
        hackTooltipStartTiming(toolTip);
        for (Node n : arrayToList(itemToCheck)) {
            if (n instanceof TextField) {
                TextField textField = (TextField) n;
                if (textField.getText() == null || textField.getText().trim().equals("")) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(textField, toolTip);
                } else {
                    removeToolTipAndBorderColor(textField, toolTip);
                }
            } // Validate Combo Box
            else if (n instanceof ComboBox) {
                ComboBox comboBox = (ComboBox) n;
                if (comboBox.getValue() == null) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(comboBox, toolTip);
                } else {
                    removeToolTipAndBorderColor(comboBox, toolTip);
                }
            } // Validate ListView
            else if (n instanceof ListView) {
                ListView listView = (ListView) n;
                if (listView.getSelectionModel().getSelectedItem() == null) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(listView, toolTip);
                } else {
                    removeToolTipAndBorderColor(listView, toolTip);
                }
            } // Validate TextArea
            else if (n instanceof TextArea) {
                TextArea textArea = (TextArea) n;
                if (textArea.getText() == null || textArea.getText().trim().equals("")) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(textArea, toolTip);
                } else {
                    removeToolTipAndBorderColor(textArea, toolTip);
                }
            }// Validate DatePcker
            else if (n instanceof DatePicker) {
                DatePicker dp = (DatePicker) n;
                if (dp.getValue() == null) {
                    failedFields.add(n);
                    addToolTipAndBorderColor(dp, toolTip);
                } else {
                    removeToolTipAndBorderColor(dp, toolTip);
                }
            }// Validate TimePcker
           
            //ADD YOUR VALIDATION HERE
            //TODO
        }

        return failedFields.isEmpty();
    }
    
    private static void addToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.install(n, t);
        n.setStyle(STILE_BORDER_VALIDATION);
    }

    private static void removeToolTipAndBorderColor(Node n, Tooltip t) {
        Tooltip.uninstall(n, t);
        n.setStyle(null);
    }
    
    private static void hackTooltipStartTiming(Tooltip tooltip) {
        try {
            Field fieldBehavior = tooltip.getClass().getDeclaredField("BEHAVIOR");
            fieldBehavior.setAccessible(true);
            Object objBehavior = fieldBehavior.get(tooltip);

            Field fieldTimer = objBehavior.getClass().getDeclaredField("activationTimer");
            fieldTimer.setAccessible(true);
            Timeline objTimer = (Timeline) fieldTimer.get(objBehavior);

            objTimer.getKeyFrames().clear();
            objTimer.getKeyFrames().add(new KeyFrame(new Duration(5)));
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            System.out.println(e);
        }
    }
    
    private static List<Node> arrayToList(Node[] n) {
        List<Node> listItems = new ArrayList<>();
        for (Node n1 : n) {
            listItems.add(n1);
        }
        return listItems;
    }

public static StringConverter converterFecha() {
        final String patronFecha = PatronFecha.PATRON_FECHA;
        StringConverter converter = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter
                    = DateTimeFormatter.ofPattern(patronFecha);

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };
        return converter;
    }    
    
}
