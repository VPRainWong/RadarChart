package com.vp.plugin.sample.radarChartPlugin;

import java.awt.Color;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.DiagramManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.diagram.IDiagramTypeConstants;
import com.vp.plugin.diagram.IMaturityAnalysisUIModel;
import com.vp.plugin.model.IMaturityAnalysisMaturityFactor;
import com.vp.plugin.model.IMaturityAnalysisMaturityFactorValue;
import com.vp.plugin.model.IMaturityAnalysisModel;
import com.vp.plugin.model.IMaturityAnalysisStage;
import com.vp.plugin.model.factory.IModelElementFactory;


public class RadarChartAction implements VPActionController{

	@Override
	public void performAction(VPAction arg0) {
		//Create Blank Radar Chart
		DiagramManager diagramManager = ApplicationManager.instance().getDiagramManager();
		IMaturityAnalysisUIModel radarChart = (IMaturityAnalysisUIModel) diagramManager.createDiagram(IDiagramTypeConstants.DIAGRAM_TYPE_MATURITY_ANALYSIS);
		radarChart.setName("Sample Radar Chart");				
		
		
		//Create Radar Chart Model
		IMaturityAnalysisModel radar = IModelElementFactory.instance().createMaturityAnalysisModel();
		radarChart.setMaturityAnalysisModelAddress(radar.getAddress());
		
		//Create Factors
		IMaturityAnalysisMaturityFactor sweetTaste = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		sweetTaste.setName("Sweet Taste");
		//Add the factor to the model
		radar.addMaturityFactor(sweetTaste);
		
		IMaturityAnalysisMaturityFactor goodForKids = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		goodForKids.setName("Good For Kids");
		radar.addMaturityFactor(goodForKids);
		
		IMaturityAnalysisMaturityFactor wideChoice = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		wideChoice.setName("Wide Choice");
		radar.addMaturityFactor(wideChoice);
		
		IMaturityAnalysisMaturityFactor goodForEntertaining = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		goodForEntertaining.setName("Good For Entertaining");
		radar.addMaturityFactor(goodForEntertaining);
		
		IMaturityAnalysisMaturityFactor goodAsASnack = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		goodAsASnack.setName("Good As a Snack");
		radar.addMaturityFactor(goodAsASnack);
		
		IMaturityAnalysisMaturityFactor goodForYou = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		goodForYou.setName("Good For You");
		radar.addMaturityFactor(goodForYou);
		
		IMaturityAnalysisMaturityFactor highQuality = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		highQuality.setName("High Quality");
		radar.addMaturityFactor(highQuality);
		
		IMaturityAnalysisMaturityFactor oldFashioned = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		oldFashioned.setName("Old Fashioned");
		radar.addMaturityFactor(oldFashioned);
		
		IMaturityAnalysisMaturityFactor trustedBrand = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		trustedBrand.setName("A Trusted Brand");
		radar.addMaturityFactor(trustedBrand);
		
		IMaturityAnalysisMaturityFactor convenientServingSize = IModelElementFactory.instance().createMaturityAnalysisMaturityFactor();
		convenientServingSize.setName("Convenient Serving Size");
		radar.addMaturityFactor(convenientServingSize);
		
		
		//Create Stages
		IMaturityAnalysisStage brandA = IModelElementFactory.instance().createMaturityAnalysisStage();
		brandA.setName("Brand A");
		brandA.setColor(Color.BLUE.getRGB());
		//Add stage to the model
		radar.addStage(brandA);
		
		
		IMaturityAnalysisMaturityFactorValue brandASweetTaste = IModelElementFactory.instance().createMaturityAnalysisMaturityFactorValue();
		brandASweetTaste.setMaturityFactor(sweetTaste);
		brandASweetTaste.setValue(0.15);
		brandA.addMaturityFactorValue(brandASweetTaste);
		
		brandA.addMaturityFactorValue(addValue(goodForKids,20));	
		brandA.addMaturityFactorValue(addValue(wideChoice, 30));
		brandA.addMaturityFactorValue(addValue(goodForEntertaining, 40));
		brandA.addMaturityFactorValue(addValue(goodAsASnack, 50));
		brandA.addMaturityFactorValue(addValue(goodForYou, 70));
		brandA.addMaturityFactorValue(addValue(highQuality, 40));
		brandA.addMaturityFactorValue(addValue(oldFashioned, 70));
		brandA.addMaturityFactorValue(addValue(trustedBrand, 50));
		brandA.addMaturityFactorValue(addValue(convenientServingSize, 30));
		
		
		IMaturityAnalysisStage brandB = IModelElementFactory.instance().createMaturityAnalysisStage();
		brandB.setName("Brand B");
		brandB.setColor(Color.RED.getRGB());
		radar.addStage(brandB);
		
		brandB.addMaturityFactorValue(addValue(sweetTaste, 90));
		brandB.addMaturityFactorValue(addValue(goodForKids, 50));
		brandB.addMaturityFactorValue(addValue(wideChoice, 70));
		brandB.addMaturityFactorValue(addValue(goodForEntertaining, 80));
		brandB.addMaturityFactorValue(addValue(goodAsASnack, 40));
		brandB.addMaturityFactorValue(addValue(goodForYou, 20));
		brandB.addMaturityFactorValue(addValue(highQuality, 80));
		brandB.addMaturityFactorValue(addValue(oldFashioned, 30));
		brandB.addMaturityFactorValue(addValue(trustedBrand, 90));
		brandB.addMaturityFactorValue(addValue(convenientServingSize, 50));
		
		
		IMaturityAnalysisStage brandC = IModelElementFactory.instance().createMaturityAnalysisStage();
		brandC.setName("Brand C");
		brandC.setColor(Color.GREEN.getRGB());
		radar.addStage(brandC);
		
		brandC.addMaturityFactorValue(addValue(sweetTaste, 30));
		brandC.addMaturityFactorValue(addValue(goodForKids, 50));
		brandC.addMaturityFactorValue(addValue(wideChoice, 30));
		brandC.addMaturityFactorValue(addValue(goodForEntertaining, 80));
		brandC.addMaturityFactorValue(addValue(goodAsASnack, 60));
		brandC.addMaturityFactorValue(addValue(goodForYou, 30));
		brandC.addMaturityFactorValue(addValue(highQuality, 70));
		brandC.addMaturityFactorValue(addValue(oldFashioned, 40));
		brandC.addMaturityFactorValue(addValue(trustedBrand, 90));
		brandC.addMaturityFactorValue(addValue(convenientServingSize, 40));
		
		//Show Up Diagram
		diagramManager.openDiagram(radarChart);	
	}

	private IMaturityAnalysisMaturityFactorValue addValue(IMaturityAnalysisMaturityFactor variable, double rating) {
		IMaturityAnalysisMaturityFactorValue v = IModelElementFactory.instance().createMaturityAnalysisMaturityFactorValue();
		v.setMaturityFactor(variable);
		v.setValue(rating/100);
		return v;
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}


}
