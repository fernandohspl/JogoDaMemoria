package regras;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

/**
 *
 * @author fernando.lima
 */
public class ControleBotoesSelecionados {
    
    private String nmBotao;
    private Map<JButton, EstadosBotoes> referenciaBotoes;
    
    public ControleBotoesSelecionados() {
        this.referenciaBotoes = new HashMap<>();
    }
    public String getNmBotao() {
        return nmBotao;
    }
    public void setNmBotao(String nmBotao) {
        this.nmBotao = nmBotao;
    }
    public Map<JButton, EstadosBotoes> getReferenciaBotoes() {
        return referenciaBotoes;
    }
    public void setReferenciaBotoes(Map<JButton, EstadosBotoes> referenciaBotoes) {
        this.referenciaBotoes = referenciaBotoes;
    }
    public void adicionarBotao(JButton botao) {
        this.referenciaBotoes.put(botao, EstadosBotoes.NORMAL);
    }  
    public void alterarSelecao(JButton botao, EstadosBotoes selecionado) {
        EstadosBotoes b = this.referenciaBotoes.get(botao);
        b = selecionado;
        alterarVisualizacaoBotao(botao);
    }
    
    private void alterarVisualizacaoBotao(JButton botao) {
        EstadosBotoes selecionado = this.referenciaBotoes.get(botao);
        switch (selecionado) {
            case NORMAL: // Cinza, não exibe texto
                botao.setBackground(null);
                botao.setText("Jogo");
                break;
            case SELECIONADO: // Exibir texto, mudar a cor
                botao.setBackground(Color.green);
                botao.setText(this.nmBotao);
                break;
            case PARES_ENCONTRADOS: // Mudar a cor, exibir o texto
                botao.setBackground(Color.MAGENTA);
                botao.setText(this.nmBotao);
                break;
        }
    }
    
    public void zerarSelecoes() {
        this.referenciaBotoes.values().stream().forEach((b) -> {
            b = EstadosBotoes.NORMAL;
        });
    }
    public Boolean isTodasSelecionadas() {
        for (EstadosBotoes b : this.referenciaBotoes.values()) {
            if (b != EstadosBotoes.SELECIONADO) {
                // Não foram todos selecionados
                return false;
            }
        }
        return true;
    }
}