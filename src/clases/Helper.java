/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUCYLEONOR
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;

            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String recibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void tablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static void limpiarTabla(JTable tabla1, JTable tabla2) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
                tabla2.setValueAt("", i, j);
            }

        }
    }

    public static void letraB(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc - 1; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == nf / 2 || i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 1; i < nf / 2; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = (nf / 2) + 1; i < nf - 1; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraK(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || (i + (j - 1)) == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
                if ((i - (j - 1)) == (nf - 1) / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraM(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
        for (int i = 0; i <= nf / 2; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j || j == nc - 1 - i) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraW(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc / 2; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 0; i < nf; i++) {
            for (int j = ((nc / 2) + 1); j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = nf / 2; i < nf - 1; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 1; j < nc - 1; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
                if (i == nf - 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 1; i < nf - 2; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = nf - 1; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 || i == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == nf - 1) {
                    tabla2.setValueAt(aux, i, j / 2);
                }

            }
        }
        for (int i = 2; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }

    }

    public static void letraG(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == nf - 3 || i == nf - 1 || j == 0) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 0; i < nf - 4; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
        for (int i = nf - 3; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }

    }

    public static void letraR(JTable tabla1, JTable tabla2) {
        int nc, nf, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == nf / 2 || i == j && i + j >= nf) {
                    tabla2.setValueAt(aux, i, j);
                }
                if (j == nc - 1) {
                    tabla2.setValueAt(aux, i / 2, j);
                }
            }
        }

    }

    public static void figura1(JTable tabla1, JTable tabla2) {
        int nc, nf, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 || i == 0 || i == nf - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 0; i < nf; i++) {
            for (int j = 1; j < nc - 1; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == nf - 2 || i == 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura2(JTable tabla1, JTable tabla2) {
        int nc, nf, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || i == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 1; i < nf - 1; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 1 || j == nc - 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void figura3(JTable tabla1, JTable tabla2) {
        int nc, nf, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nc / 2 || i == nf / 2 || j == (nc / 2) - 1 || i == (nf / 2) - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura4(JTable tabla1, JTable tabla2) {
        int nc, nf, aux;
        nc = tabla1.getColumnCount();
        nf = tabla1.getRowCount();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = nf - 1; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == nf / 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 1 || j == nc - 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = (nf - 2); i < (nf - 1); i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 1 || j == nc - 2) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
        for (int i = (nf / 2); i <= (nf / 2); i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

}
