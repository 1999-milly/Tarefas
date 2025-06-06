package app;
import dominio.AlunoController;
import ui.JFrameJanelaAtualizar;
import ui.JFrameJanelaCadastro;
import ui.JFrameJanelaConsulta;
import ui.JFrameJanelaExcluir;
import javax.swing.*;
import java.awt.*;
public class Main{
    public static void main(String[] args){
        AlunoController controller=new AlunoController();

        JFrame frame=new JFrame("Menu Principal");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));

        JButton btnCadastrar=new JButton("Cadastrar Aluno");
        btnCadastrar.addActionListener(e->new JFrameJanelaCadastro(controller));
        frame.add(btnCadastrar);
        JButton btnConsultar=new JButton("Consultar Alunos");
        btnConsultar.addActionListener(e->new JFrameJanelaConsulta(controller));
        frame.add(btnConsultar);
        JButton btnAtualizar=new JButton("Atualizar Aluno");
        frame.add(btnAtualizar);
        btnAtualizar.addActionListener(e->new JFrameJanelaAtualizar(controller));
        JButton btnExcluir=new JButton("Excluir Aluno");
        frame.add(btnExcluir);
        btnExcluir.addActionListener(e->new JFrameJanelaExcluir(controller));

        frame.setVisible(true);
    }
}