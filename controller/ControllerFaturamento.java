package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import entity.Faturamento;

public class ControllerFaturamento {

	
	public static List<Faturamento> lerXML() throws Exception {
		List<Faturamento> faturamentos = new ArrayList<>();
		File fXmlFile = new File("dados.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

		NodeList nList = doc.getElementsByTagName("Faturamento");

		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				Faturamento f = new Faturamento();
				f.setDia(Integer.parseInt(eElement.getElementsByTagName("dia").item(0).getTextContent()));
				f.setValor(Double.parseDouble(eElement.getElementsByTagName("valor").item(0).getTextContent()));
				faturamentos.add(f);
			}
		}
		return faturamentos;
	}
	


	public Faturamento menorFaturamento() throws Exception  {
		Faturamento mf = new Faturamento();

		List<Faturamento> lista = lerXML();

		for (Faturamento f : lista) {
			if (f.getDia() == 1) {
				mf = f;
			}
			if (f.getValor() == 0) {
				continue;
			}
			if (f.getValor() < mf.getValor()) {
				mf = f;
			}
		}

		return mf;
	}

	public Faturamento maiorFaturamento() throws Exception {
		Faturamento mf = new Faturamento();

		List<Faturamento> lista = lerXML();

		for (Faturamento f : lista) {
			if (f.getDia() == 1) {
				mf = f;
			}
			if (f.getValor() == 0) {
				continue;
			}
			if (f.getValor() > mf.getValor()) {
				mf = f;
			}
		}

		return mf;
	}

	public Double mediaMensal() throws Exception {
		double media = 0;
		double contador = 0;
		List<Faturamento> lista = lerXML();

		for (Faturamento f : lista) {
			if (f.getValor() == 0) {
				continue;
			} else {
				contador += f.getValor();
				media = contador / f.getDia();
			}
		}
		return media;
	}

	public int numeroDiasFaturamentoSuperior() throws Exception {
		int numeroDias = 0;
		double media = mediaMensal();
		List<Faturamento> lista = lerXML();

		for (Faturamento f : lista) {
			if(f.getValor() >= media) {
				numeroDias += 1;
			}
		}

		return numeroDias;
	}
}
