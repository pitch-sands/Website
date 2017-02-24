package de.tu_bs.cs.isf.mbse.website.graphiti.features;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.CompoundDirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class MyLayoutDiagramFeature extends AbstractCustomFeature {

	/**
	 * Minimal distance between nodes.
	 */
	private static final int PADDING = 30;


	public MyLayoutDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getDescription() {
		return "Layout diagram with GEF Layouter"; //$NON-NLS-1$
	}

	@Override
	public String getName() {
		return "&Layout Diagram"; //$NON-NLS-1$
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {
		final CompoundDirectedGraph graph = mapDiagramToGraph();
		graph.setDefaultPadding(new Insets(PADDING));
		new CompoundDirectedGraphLayout().visit(graph);
		mapGraphCoordinatesToDiagram(graph);
	}


	private Diagram mapGraphCoordinatesToDiagram(CompoundDirectedGraph graph) {
		NodeList myNodes = new NodeList();
		//myNodes.addAll(graph.nodes);
		//myNodes.addAll(graph.subgraphs);
		for (Object object : myNodes) {
			Node node = (Node) object;
			Shape shape = (Shape) node.data;
			shape.getGraphicsAlgorithm().setX(node.x);
			shape.getGraphicsAlgorithm().setY(node.y);
			shape.getGraphicsAlgorithm().setWidth(node.width);
			shape.getGraphicsAlgorithm().setHeight(node.height);
		}
		return null;
	}


	private CompoundDirectedGraph mapDiagramToGraph() {
		Map<AnchorContainer, Node> shapeToNode = new HashMap<AnchorContainer, Node>();
		Diagram d = getDiagram();
		CompoundDirectedGraph dg = new CompoundDirectedGraph();
		EdgeList edgeList = new EdgeList();
		NodeList nodeList = new NodeList();
		EList<Shape> children = d.getChildren();
		for (Shape shape : children) {
			Node node = new Node();
			GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
			node.x = ga.getX();
			node.y = ga.getY();
			node.width = ga.getWidth();
			node.height = ga.getHeight();
			node.data = shape;
			shapeToNode.put(shape, node);
			//nodeList.add(node);
		}
		EList<Connection> connections = d.getConnections();
		for (Connection connection : connections) {
			AnchorContainer source = connection.getStart().getParent();
			AnchorContainer target = connection.getEnd().getParent();
			Edge edge = new Edge(shapeToNode.get(source), shapeToNode.get(target));
			edge.data = connection;
			//edgeList.add(edge);
		}
		dg.nodes = nodeList;
		dg.edges = edgeList;
		return dg;
	}


}