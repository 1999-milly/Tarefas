package ui;
import dominio.AlunoController;
import javax.swing.*;
import java.awt.*;
public class JFrameJanelaCadastro extends JFrame{
    private JTextField txtMatricula,txtNome,txtCurso,txtIdade;
    private AlunoController controller;

    public JFrameJanelaCadastro(AlunoController controller){
        this.controller=controller;

        setTitle("Cadastro de Aluno");
        setSize(300,250);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5,2));

        add(new JLabel("Matrícula:"));
        txtMatricula=new JTextField();
        add(txtMatricula);

        add(new JLabel("Nome:"));
        txtNome=new JTextField();
        add(txtNome);

        add(new JLabel("Curso:"));
        txtCurso=new JTextField();
        add(txtCurso);

        add(new JLabel("Idade:"));
        txtIdade=new JTextField();
        add(txtIdade);

        JButton btnSalvar=new JButton("Salvar");

        btnSalvar.addActionListener(e->{
            String matricula=txtMatricula.getText();
            String nome=txtNome.getText();
            String curso=txtCurso.getText();
            int idade=Integer.parseInt(txtIdade.getText());

            controller.salvarAluno(matricula,nome,curso,idade);

            JOptionPane.showMessageDialog(this,"Aluno salvo com sucesso!");
        });
        add(btnSalvar);
        setVisible(true);
    }
}