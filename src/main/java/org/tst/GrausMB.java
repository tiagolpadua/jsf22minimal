package org.tst;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class GrausMB {

	@EJB
	GrausBean grausBean;

	double c;
	double resultadoF;

	public void converterParaFahrenheit() {
		this.resultadoF = this.grausBean.converterParaFahrenheit(c);
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getResultadoF() {
		return resultadoF;
	}

	public void setResultadoF(double resultadoF) {
		this.resultadoF = resultadoF;
	}
}