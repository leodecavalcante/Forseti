package model;

import javax.persistence.*;

@Entity
@Table(name="maps")
public class Mapa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="COD_MAPA_PLANTA")
    private int cod_mapa_planta;

    @Column(name="REG_ADM")
    private String reg_adm;

    @Column(name="ORG_SET_ORIGEM")
    private String org_set_origem;

    @Column(name="NUM_MAPOTECA")
    private String num_mapoteca;

    @Column(name="GAVETA_MAPOTECA")
    private String gaveta_mapoteca;

    @Column(name="PRANCHA_MAPOTECA")
    private String prancha_mapoteca;

    @Column(name="TITULO_MAPA_PLANTA")
    private String titulo_mapa_planta;

    @Column(name="ENDERECO_MAPA_PLANTA_ANTIGO")
    private String endereco_mapa_planta_antigo;

    @Column(name="BAIRRO_MAPA_PLANTA_ANTIGO")
    private String bairro_mapa_planta_antigo;

    @Column(name="MUNICIPIO_UF_ANTIGO")
    private String municipio_uf_antigo;

    @Column(name="CEP_MAPA_PLANTA_ANTIGO")
    private String cep_mapa_planta_antigo;

    @Column(name="ENDERECO_MAPA_PLANTA_NOVO")
    private String endereco_mapa_planta_novo;

    @Column(name="BAIRRO_MAPA_PLANTA_NOVO")
    private String bairro_mapa_planta_novo;

    @Column(name="MUNICIPIO_UF_NOVO")
    private String municipio_uf_novo;

    @Column(name="CEP_MAPA_PLANTA_NOVO")
    private String cep_mapa_planta_novo;

    @Column(name="TIPOLOGIA_MAPA_PLANTA")
    private String tipologia_mapa_planta;

    @Column(name="TRECHO_TIPOLOGIA")
    private String trecho_tipologia;

    @Column(name="MUNICIPIO_TIPOLOGIA")
    private String municipio_tipologia;

    @Column(name="NUM_PROCESSO_TIPOLOGIA")
    private String num_processo_tipologia;

    @Column(name="SUPERVISOR_ORIGEM_TIPOLOGIA")
    private String supervisor_origem_tipologia;

    @Column(name="ORG_EMISSOR_ORIGEM_TIPOLOGIA")
    private String org_emissor_origem_tipologia;

    @Column(name="DIMENSAO_IMOVEL_AREA_TOTAL_TIPOLOGIA")
    private String dimensao_imovel_area_total_tipologia;

    @Column(name="CONFRONTAMENTO_TIPOLOGIA")
    private String confrontamento_tipologia;

    @Column(name="AUTOR_TIPOLOGIA")
    private String autor_tipologia;

    @Column(name="ORIGINAL_COPIA_TIPOLOGIA")
    private String original_copia_tipologia;

    @Column(name="DATA_TIPOLOGIA")
    private String data_tipologia;

    @Column(name="ESCALA")
    private String escala;

    @Column(name="NUM_FOLHA")
    private String num_folha;

    @Column(name="DESCRITORES")
    private String descritores;

    @Column(name="PLANTA")
    private String planta;

    @Column(name="ARMARIO")
    private String armario;

    @Column(name="TELA")
    private String tela;

    @Column(name="TUBO")
    private String tubo;

    @Column(name="QUANT")
    private String quant;

    @Column(name="OBSERVACAO")
    private String observacao;

    @Column(name="DATA_CADASTRAMENTO")
    private String data_cadastramento;

    @Column(name="CADASTRADOR")
    private String cadastrador;

    @Column(name="SEL")
    private String sel;

    @Column(name="LATITUDE")
    private String latitude;

    @Column(name="LONGITUDE")
    private String longitude;

    public Mapa(String reg_adm, String org_set_origem, String num_mapoteca, String gaveta_mapoteca, String prancha_mapoteca, String titulo_mapa_planta, String endereco_mapa_planta_antigo, String bairro_mapa_planta_antigo, String municipio_uf_antigo, String cep_mapa_planta_antigo, String endereco_mapa_planta_novo, String bairro_mapa_planta_novo, String municipio_uf_novo, String cep_mapa_planta_novo, String tipologia_mapa_planta, String trecho_tipologia, String municipio_tipologia, String num_processo_tipologia, String supervisor_origem_tipologia, String org_emissor_origem_tipologia, String dimensao_imovel_area_total_tipologia, String confrontamento_tipologia, String autor_tipologia, String original_copia_tipologia, String data_tipologia, String escala, String num_folha, String descritores, String planta, String armario, String tela, String tubo, String quant, String observacao, String data_cadastramento, String cadastrador, String sel) {
        this.reg_adm = reg_adm;
        this.org_set_origem = org_set_origem;
        this.num_mapoteca = num_mapoteca;
        this.gaveta_mapoteca = gaveta_mapoteca;
        this.prancha_mapoteca = prancha_mapoteca;
        this.titulo_mapa_planta = titulo_mapa_planta;
        this.endereco_mapa_planta_antigo = endereco_mapa_planta_antigo;
        this.bairro_mapa_planta_antigo = bairro_mapa_planta_antigo;
        this.municipio_uf_antigo = municipio_uf_antigo;
        this.cep_mapa_planta_antigo = cep_mapa_planta_antigo;
        this.endereco_mapa_planta_novo = endereco_mapa_planta_novo;
        this.bairro_mapa_planta_novo = bairro_mapa_planta_novo;
        this.municipio_uf_novo = municipio_uf_novo;
        this.cep_mapa_planta_novo = cep_mapa_planta_novo;
        this.tipologia_mapa_planta = tipologia_mapa_planta;
        this.trecho_tipologia = trecho_tipologia;
        this.municipio_tipologia = municipio_tipologia;
        this.num_processo_tipologia = num_processo_tipologia;
        this.supervisor_origem_tipologia = supervisor_origem_tipologia;
        this.org_emissor_origem_tipologia = org_emissor_origem_tipologia;
        this.dimensao_imovel_area_total_tipologia = dimensao_imovel_area_total_tipologia;
        this.confrontamento_tipologia = confrontamento_tipologia;
        this.autor_tipologia = autor_tipologia;
        this.original_copia_tipologia = original_copia_tipologia;
        this.data_tipologia = data_tipologia;
        this.escala = escala;
        this.num_folha = num_folha;
        this.descritores = descritores;
        this.planta = planta;
        this.armario = armario;
        this.tela = tela;
        this.tubo = tubo;
        this.quant = quant;
        this.observacao = observacao;
        this.data_cadastramento = data_cadastramento;
        this.cadastrador = cadastrador;
        this.sel = sel;
    }

    public int getCod_mapa_planta() {
        return cod_mapa_planta;
    }

    public void setCod_mapa_planta(int cod_mapa_planta) {
        this.cod_mapa_planta = cod_mapa_planta;
    }

    public String getReg_adm() {
        return reg_adm;
    }

    public void setReg_adm(String reg_adm) {
        this.reg_adm = reg_adm;
    }

    public String getOrg_set_origem() {
        return org_set_origem;
    }

    public void setOrg_set_origem(String org_set_origem) {
        this.org_set_origem = org_set_origem;
    }

    public String getNum_mapoteca() {
        return num_mapoteca;
    }

    public void setNum_mapoteca(String num_mapoteca) {
        this.num_mapoteca = num_mapoteca;
    }

    public String getGaveta_mapoteca() {
        return gaveta_mapoteca;
    }

    public void setGaveta_mapoteca(String gaveta_mapoteca) {
        this.gaveta_mapoteca = gaveta_mapoteca;
    }

    public String getPrancha_mapoteca() {
        return prancha_mapoteca;
    }

    public void setPrancha_mapoteca(String prancha_mapoteca) {
        this.prancha_mapoteca = prancha_mapoteca;
    }

    public String getTitulo_mapa_planta() {
        return titulo_mapa_planta;
    }

    public void setTitulo_mapa_planta(String titulo_mapa_planta) {
        this.titulo_mapa_planta = titulo_mapa_planta;
    }

    public String getEndereco_mapa_planta_antigo() {
        return endereco_mapa_planta_antigo;
    }

    public void setEndereco_mapa_planta_antigo(String endereco_mapa_planta_antigo) {
        this.endereco_mapa_planta_antigo = endereco_mapa_planta_antigo;
    }

    public String getBairro_mapa_planta_antigo() {
        return bairro_mapa_planta_antigo;
    }

    public void setBairro_mapa_planta_antigo(String bairro_mapa_planta_antigo) {
        this.bairro_mapa_planta_antigo = bairro_mapa_planta_antigo;
    }

    public String getMunicipio_uf_antigo() {
        return municipio_uf_antigo;
    }

    public void setMunicipio_uf_antigo(String municipio_uf_antigo) {
        this.municipio_uf_antigo = municipio_uf_antigo;
    }

    public String getCep_mapa_planta_antigo() {
        return cep_mapa_planta_antigo;
    }

    public void setCep_mapa_planta_antigo(String cep_mapa_planta_antigo) {
        this.cep_mapa_planta_antigo = cep_mapa_planta_antigo;
    }

    public String getEndereco_mapa_planta_novo() {
        return endereco_mapa_planta_novo;
    }

    public void setEndereco_mapa_planta_novo(String endereco_mapa_planta_novo) {
        this.endereco_mapa_planta_novo = endereco_mapa_planta_novo;
    }

    public String getBairro_mapa_planta_novo() {
        return bairro_mapa_planta_novo;
    }

    public void setBairro_mapa_planta_novo(String bairro_mapa_planta_novo) {
        this.bairro_mapa_planta_novo = bairro_mapa_planta_novo;
    }

    public String getMunicipio_uf_novo() {
        return municipio_uf_novo;
    }

    public void setMunicipio_uf_novo(String municipio_uf_novo) {
        this.municipio_uf_novo = municipio_uf_novo;
    }

    public String getCep_mapa_planta_novo() {
        return cep_mapa_planta_novo;
    }

    public void setCep_mapa_planta_novo(String cep_mapa_planta_novo) {
        this.cep_mapa_planta_novo = cep_mapa_planta_novo;
    }

    public String getTipologia_mapa_planta() {
        return tipologia_mapa_planta;
    }

    public void setTipologia_mapa_planta(String tipologia_mapa_planta) {
        this.tipologia_mapa_planta = tipologia_mapa_planta;
    }

    public String getTrecho_tipologia() {
        return trecho_tipologia;
    }

    public void setTrecho_tipologia(String trecho_tipologia) {
        this.trecho_tipologia = trecho_tipologia;
    }

    public String getMunicipio_tipologia() {
        return municipio_tipologia;
    }

    public void setMunicipio_tipologia(String municipio_tipologia) {
        this.municipio_tipologia = municipio_tipologia;
    }

    public String getNum_processo_tipologia() {
        return num_processo_tipologia;
    }

    public void setNum_processo_tipologia(String num_processo_tipologia) {
        this.num_processo_tipologia = num_processo_tipologia;
    }

    public String getSupervisor_origem_tipologia() {
        return supervisor_origem_tipologia;
    }

    public void setSupervisor_origem_tipologia(String supervisor_origem_tipologia) {
        this.supervisor_origem_tipologia = supervisor_origem_tipologia;
    }

    public String getOrg_emissor_origem_tipologia() {
        return org_emissor_origem_tipologia;
    }

    public void setOrg_emissor_origem_tipologia(String org_emissor_origem_tipologia) {
        this.org_emissor_origem_tipologia = org_emissor_origem_tipologia;
    }

    public String getDimensao_imovel_area_total_tipologia() {
        return dimensao_imovel_area_total_tipologia;
    }

    public void setDimensao_imovel_area_total_tipologia(String dimensao_imovel_area_total_tipologia) {
        this.dimensao_imovel_area_total_tipologia = dimensao_imovel_area_total_tipologia;
    }

    public String getConfrontamento_tipologia() {
        return confrontamento_tipologia;
    }

    public void setConfrontamento_tipologia(String confrontamento_tipologia) {
        this.confrontamento_tipologia = confrontamento_tipologia;
    }

    public String getAutor_tipologia() {
        return autor_tipologia;
    }

    public void setAutor_tipologia(String autor_tipologia) {
        this.autor_tipologia = autor_tipologia;
    }

    public String getOriginal_copia_tipologia() {
        return original_copia_tipologia;
    }

    public void setOriginal_copia_tipologia(String original_copia_tipologia) {
        this.original_copia_tipologia = original_copia_tipologia;
    }

    public String getData_tipologia() {
        return data_tipologia;
    }

    public void setData_tipologia(String data_tipologia) {
        this.data_tipologia = data_tipologia;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getNum_folha() {
        return num_folha;
    }

    public void setNum_folha(String num_folha) {
        this.num_folha = num_folha;
    }

    public String getDescritores() {
        return descritores;
    }

    public void setDescritores(String descritores) {
        this.descritores = descritores;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getArmario() {
        return armario;
    }

    public void setArmario(String armario) {
        this.armario = armario;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getTubo() {
        return tubo;
    }

    public void setTubo(String tubo) {
        this.tubo = tubo;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getData_cadastramento() {
        return data_cadastramento;
    }

    public void setData_cadastramento(String data_cadastramento) {
        this.data_cadastramento = data_cadastramento;
    }

    public String getCadastrador() {
        return cadastrador;
    }

    public void setCadastrador(String cadastrador) {
        this.cadastrador = cadastrador;
    }

    public String getSel() {
        return sel;
    }

    public void setSel(String sel) {
        this.sel = sel;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "cod_mapa_planta=" + cod_mapa_planta +
                ", reg_adm='" + reg_adm + '\'' +
                ", org_set_origem='" + org_set_origem + '\'' +
                ", num_mapoteca='" + num_mapoteca + '\'' +
                ", gaveta_mapoteca='" + gaveta_mapoteca + '\'' +
                ", prancha_mapoteca='" + prancha_mapoteca + '\'' +
                ", titulo_mapa_planta='" + titulo_mapa_planta + '\'' +
                ", endereco_mapa_planta_antigo='" + endereco_mapa_planta_antigo + '\'' +
                ", bairro_mapa_planta_antigo='" + bairro_mapa_planta_antigo + '\'' +
                ", municipio_uf_antigo='" + municipio_uf_antigo + '\'' +
                ", cep_mapa_planta_antigo='" + cep_mapa_planta_antigo + '\'' +
                ", endereco_mapa_planta_novo='" + endereco_mapa_planta_novo + '\'' +
                ", bairro_mapa_planta_novo='" + bairro_mapa_planta_novo + '\'' +
                ", municipio_uf_novo='" + municipio_uf_novo + '\'' +
                ", cep_mapa_planta_novo='" + cep_mapa_planta_novo + '\'' +
                ", tipologia_mapa_planta='" + tipologia_mapa_planta + '\'' +
                ", trecho_tipologia='" + trecho_tipologia + '\'' +
                ", municipio_tipologia='" + municipio_tipologia + '\'' +
                ", num_processo_tipologia='" + num_processo_tipologia + '\'' +
                ", supervisor_origem_tipologia='" + supervisor_origem_tipologia + '\'' +
                ", org_emissor_origem_tipologia='" + org_emissor_origem_tipologia + '\'' +
                ", dimensao_imovel_area_total_tipologia='" + dimensao_imovel_area_total_tipologia + '\'' +
                ", confrontamento_tipologia='" + confrontamento_tipologia + '\'' +
                ", autor_tipologia='" + autor_tipologia + '\'' +
                ", original_copia_tipologia='" + original_copia_tipologia + '\'' +
                ", data_tipologia='" + data_tipologia + '\'' +
                ", escala='" + escala + '\'' +
                ", num_folha='" + num_folha + '\'' +
                ", descritores='" + descritores + '\'' +
                ", planta='" + planta + '\'' +
                ", armario='" + armario + '\'' +
                ", tela='" + tela + '\'' +
                ", tubo='" + tubo + '\'' +
                ", quant='" + quant + '\'' +
                ", observacao='" + observacao + '\'' +
                ", data_cadastramento='" + data_cadastramento + '\'' +
                ", cadastrador='" + cadastrador + '\'' +
                ", sel='" + sel + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}