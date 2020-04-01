import javax.swing.JOptionPane;
public class TesteTurma{
   public static void main(String [] args){
      int quantidadeDeAlunos;
      int serie;
      String curso;
      String nome;
      nome = JOptionPane.showInputDialog("digite a sua turma");
      curso = JOptionPane.showInputDialog("digite o seu curso");
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("digite quantos alunos tem na sua sala"));
      serie = Integer.parseInt(JOptionPane.showInputDialog("digite o numero do seu semestre"));
      
      Turma turma =new Turma(nome,curso,quantidadeDeAlunos,serie);
      
      JOptionPane.showMessageDialog(null,"Tutma: " + turma.getNome()+ "\nAlunos: " + turma.getQuantidadeDeAlunos()+ "\nCurso: " + turma.getCurso()+"\nSemestre: " + turma.getSerie());   
      turma.setQuantidadeDeAlunos(Integer.parseInt(JOptionPane.showInputDialog("digite a nova quantidade de alunos")));
      JOptionPane.showMessageDialog(null,"Tutma: " + turma.getNome()+ "\nAlunos: " + turma.getQuantidadeDeAlunos()+ "\nCurso: " + turma.getCurso()+"\nSemestre: " + turma.getSerie());
   }
}