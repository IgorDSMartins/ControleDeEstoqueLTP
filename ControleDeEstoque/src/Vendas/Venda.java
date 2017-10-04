/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendas;

/**
 *
 * @author juanfelipevillalba
 */
public class Venda {
    
    private int codigo;
    private String nomeProduto;
    private String fornecedor;
    private int quantidade;
    private int valorTotal;
    
    public Venda(String nomeProduto,String fornecedor,int quantidade,int valorTotal) {
        this.nomeProduto = nomeProduto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }
    
    public Venda(int codigo,String nomeProduto,String fornecedor,int quantidade,int valorTotal) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorTotal
     */
    public int getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
