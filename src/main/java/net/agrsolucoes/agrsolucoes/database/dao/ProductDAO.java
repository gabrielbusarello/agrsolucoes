package net.agrsolucoes.agrsolucoes.database.dao;

import net.agrsolucoes.agrsolucoes.database.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public List<Product> getAll() {
        List<Product> ProductList = new ArrayList<Product>();
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("SELECT id, nome, quantidade, valor, fabricacao, status, descricao FROM agr_catalog_prods");

            ResultSet resultado = p.executeQuery();

            while (resultado.next()){
                Product Product = new Product();

                Product.setId(resultado.getLong(1));
                Product.setNome(resultado.getString(2));
                Product.setQuantidade(resultado.getInt(3));
                Product.setValor(resultado.getDouble(4));
                Product.setFabricacao(resultado.getDate(5));
                Product.setStatus(resultado.getString(6));
                Product.setDescricao(resultado.getString(7));

                ProductList.add(Product);
            }
            p.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return ProductList;
    }

    public Product getById(Long id) {
        Product product = null;
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("SELECT id, nome, quantidade, valor, fabricacao, status, descricao FROM agr_catalog_prods WHERE id = ?");
            p.setLong(1, id);

            ResultSet resultado = p.executeQuery();

            if (resultado.next()){
                product = new Product();

                product.setId(resultado.getLong(1));
                product.setNome(resultado.getString(2));
                product.setQuantidade(resultado.getInt(3));
                product.setValor(resultado.getDouble(4));
                product.setFabricacao(resultado.getDate(5));
                product.setStatus(resultado.getString(6));
                product.setDescricao(resultado.getString(7));
            }

            p.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }

        return product;
    }

    public void insert(Product product) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("INSERT INTO agr_catalog_prods(nome, quantidade, valor, fabricacao, status, descricao) values(?, ?, ?, ?, ?, ?)");
            p.setString(1, product.getNome());
            p.setInt(2, product.getQuantidade());
            p.setDouble(3, product.getValor());
            p.setDate(4, product.getFabricacao());
            p.setString(5, product.getStatus());
            p.setString(6, product.getDescricao());
            p.execute();
            p.close();

            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Product product) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("UPDATE agr_catalog_prods SET nome = ?, quantidade = ?, valor = ?, fabricacao = ?, status = ?, descricao = ? WHERE id = ?");
            p.setString(1, product.getNome());
            p.setInt(2, product.getQuantidade());
            p.setDouble(3, product.getValor());
            p.setDate(4, product.getFabricacao());
            p.setString(5, product.getStatus());
            p.setString(6, product.getDescricao());
            p.setLong(7, product.getId());

            p.execute();
            p.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteById(long id) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("DELETE FROM agr_catalog_prods WHERE id = ?");
            p.setLong(1, id);

            p.execute();
            p.close();
            conn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
