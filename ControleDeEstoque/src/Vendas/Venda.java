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
    private int idProduto;
    private String fornecedor;
    private int quantidade;
    private int valorTotal;
    
    public Venda(int idProduto,String fornecedor,int quantidade) {
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        //this.valorTotal = valorTotal;
    }
    
    public Venda(int codigo,int idProduto,String fornecedor,int quantidade) {
        this.codigo = codigo;
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        //this.valorTotal = valorTotal;
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
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
