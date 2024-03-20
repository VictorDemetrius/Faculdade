package Pck_Control;

import Pck_Model.ExemploModel;
import Pck_Persistencia.ExemploPersistencia;

public class ExemploControl {
	
	ExemploModel oExemploModel = new ExemploModel();
	ExemploPersistencia oExemploPersistencia = new ExemploPersistencia();
	
	public void inserirExemplo (String sNome) 
	{
		oExemploModel.setA01_nome(sNome);
		oExemploPersistencia.inserirExemplo(oExemploModel);
	}
	

	
	public void atualizarExemplo (int iCodigo_01, String sNome) 
	{
		oExemploModel.setA01_codigo(iCodigo_01);
		oExemploModel.setA01_nome(sNome);
	}
	
	
	public void removerExemplo (int iCodigo_01) 
	{
		oExemploModel.setA01_codigo(iCodigo_01);
	}
	
}
