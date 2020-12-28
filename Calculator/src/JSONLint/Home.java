package JSONLint;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class Home extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterSearchKeywordField;

	public static int searchcounter = 0;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		});
	}

	public Home() {
		setResizable(false);
		setTitle("JSON-Lint-V1.0");
		setDefaultCloseOperation(3);
		setBounds(1000, 1000, 1098, 704);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(this.contentPane);
		final TextArea InputJson = new TextArea();
		final TextArea OutputJson = new TextArea();
		OutputJson.setEditable(false);
		JLabel lblIputJson = new JLabel("Input JSON");
		lblIputJson.setToolTipText("Provide Input Below");
		lblIputJson.setFont(new Font("Tahoma", 1, 13));
		JLabel lblOutputJson = new JLabel("Output Json");
		lblOutputJson.setToolTipText("Below Text Area to Display Output");
		lblOutputJson.setFont(new Font("Tahoma", 1, 13));
		JButton btnFormat = new JButton("Format");
		btnFormat.setToolTipText("Display Formmated Json");
		btnFormat.setFont(new Font("Tahoma", 1, 13));
		btnFormat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent agr0) {
				// TODO Auto-generated method stub
				String compactJson = InputJson.getText();
				if (compactJson.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please Provide Input - ErrorCode 1");
					return;
				}
				String prettyJson = null;
				prettyJson = Home.prettyPrint(compactJson);
				OutputJson.setText(prettyJson);
			}
		});

		JButton btnReset = new JButton("Reset");
		JButton btnRemoveWhiteSpace = new JButton("Trim");
		btnRemoveWhiteSpace.setToolTipText("Remove White Space");
		btnRemoveWhiteSpace.setFont(new Font("Tahoma", 1, 13));
		btnRemoveWhiteSpace.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				String compactJson = null;
				compactJson = InputJson.getText();
				if (!compactJson.isEmpty()) {
					compactJson = compactJson.replaceAll("\\s{2,}", " ").trim();
					compactJson = compactJson.replaceAll("\\n", "");
					compactJson = compactJson.replaceAll("   ", "");
					compactJson = compactJson.replaceAll("\" :", "\": ");
					compactJson = compactJson.replaceAll(": ", ":");
					compactJson = compactJson.replaceAll(" ]", "]");
					compactJson = compactJson.replaceAll("\\[ ", "\\[");
					compactJson = compactJson.replaceAll("", "");
					compactJson = compactJson.replaceAll("//} ", "//}");
					compactJson = compactJson.replaceAll("\" ", "\"");
					compactJson = compactJson.replaceAll(" \"", "\"");
					compactJson = compactJson.replaceAll("\" : \"", "\":\"");
					OutputJson.setText(compactJson);
				} else {
					JOptionPane.showMessageDialog(null, "Please Provide Input - ErrorCode 6");
				}
			}
		});

	}

}
