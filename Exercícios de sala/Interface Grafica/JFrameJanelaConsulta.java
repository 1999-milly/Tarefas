package ui;
import dominio.AlunoController;
import dominio.Aluno;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class JFrameJanelaConsulta extends JFrame{
    private JTable tabela;
    private AlunoController controller;

    public JFrameJanelaConsulta(AlunoController controller){
        this.controller=controller;

        setTitle("Consulta de Alunos");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        tabela=new JTable();
        add(new JScrollPane(tabela),BorderLayout.CENTER);
        carregarTabela();
        setVisible(true);
    }
    private void carregarTabela(){
        List<Aluno> alunos=controller.listarAlunos();

        DefaultTableModel model=new DefaultTableModel();

        model.addColumn("Matrícula");
        model.addColumn("Nome");
        model.addColumn("Curso");
        model.addColumn("Idade");

        for(Aluno a:alunos){
            model.addRow(new Object[]{
                    a.getMatricula(),a.getNome(),a.getCurso(),a.getIdade()
            });
        }
        tabela.setModel(model);
    }
}