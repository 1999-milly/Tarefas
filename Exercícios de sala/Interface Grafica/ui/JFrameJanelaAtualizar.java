package ui;
import dominio.AlunoController;
import javax.swing.*;
import java.awt.*;

public class JFrameJanelaAtualizar extends JFrame{
    private JTextField txtMatricula,txtNome,txtCurso,txtIdade;
    private AlunoController controller;

    public JFrameJanelaAtualizar(AlunoController controller){
        this.controller=controller;
        setTitle("Atualizar Aluno");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6,2));

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

        JButton btnAtualizar=new JButton("Atualizar");
        btnAtualizar.addActionListener(e->{
            String matricula=txtMatricula.getText();
            String nome=txtNome.getText();
            String curso=txtCurso.getText();
            int idade=Integer.parseInt(txtIdade.getText());

            boolean atualizado=controller.atualizarAluno(matricula,nome,curso,idade);
            if(atualizado){
                JOptionPane.showMessageDialog(this,"Aluno atualizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Aluno não encontrado para atualização.");
            }
        });
        add(btnAtualizar);
        add(new JLabel());
        setVisible(true);
    }
}
