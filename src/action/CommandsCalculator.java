//package action;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CommandsCalculator implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        private class InsertListener implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String input = e.getActionCommand();
//                if (start) {
//                    display.setText("");
//                    start = false;
//                }
//                display.setText(display.getText() + input);
//            }
//        }
//
//        private class CommandAction implements ActionListener {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String command = e.getActionCommand();
//                if (start) {
//                    if (command.equals("-")) {
//                        display.setText(command);
//                        start = false;
//                    } else {
//                        lastCommand = command;
//                    }
//                } else {
//                    calculate(Double.parseDouble(display.getText()));
//                    lastCommand = command;
//                    start = true;
//                }
//
//            }
//            public void calculate(double x) {
//                if (lastCommand.equals("+")) {
//                    result += x;
//                } else if (lastCommand.equals("-")) {
//                    result -= x;
//                } else if (lastCommand.equals("*")) {
//                    result *= x;
//                } else if (lastCommand.equals("/")) {
//                    result /= x;
//                } else if (lastCommand.equals("=")) {
//                    result = x;
//                }
//                display.setText("" + result);
//            }
//        }
//    }
//}
