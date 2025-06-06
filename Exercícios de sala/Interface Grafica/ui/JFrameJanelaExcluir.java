package ui;
import dominio.AlunoController;
import javax.swing.*;
import java.awt.*;
public class JFrameJanelaExcluir extends JFrame{
    private JTextField txtMatricula,txtNome,txtCurso,txtIdade;
    private AlunoController controller;

    public JFrameJanelaExcluir(AlunoController controller){
        this.controller=controller;

        setTitle("Cadastro de Aluno");
        setSize(300,250);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7,2));

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

        JButton btnExcluir=new JButton("Excluir");
        btnExcluir.addActionListener(e->{
        String matricula=txtMatricula.getText();

        int confirmacao=JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir o aluno com matrícula: " + matricula + "?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

            if(confirmacao==JOptionPane.YES_OPTION){
                controller.excluirAluno(matricula);
                JOptionPane.showMessageDialog(this,"Aluno excluído com sucesso!");
        limparCampos();
            }
                    });
        add(btnExcluir);
    }
    public void limparCampos(){
        txtMatricula.setText("");
        txtNome.setText("");
        txtCurso.setText("");
        txtIdade.setText("");
    }}
