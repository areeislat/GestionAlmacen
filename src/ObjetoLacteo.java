public class ObjetoLacteo extends ObjetoInventario{
    private String tipoLeche;

    public ObjetoLacteo(String objeto, String tipoLeche, float precio, int stock){
        super(objeto, precio, stock);
        this.tipoLeche = tipoLeche;
    }

    public String getTipo(){
        return tipoLeche;
    }
}
