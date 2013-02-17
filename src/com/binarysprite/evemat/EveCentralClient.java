package com.binarysprite.evemat;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.Stack;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * EVE Central の API からデータを取得するクライアントです。
 * @author Tabunoki
 *
 */
public class EveCentralClient {
	
	private Logger logger;
	
	/**
	 * ロガーを取得します。
	 * @return
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * ロガーを設定します。
	 * @param logger
	 */
	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	/**
	 * 
	 * @param ids
	 * @param key
	 * @param size
	 * @return
	 */
	private List<String> buildQueryBlocks(Collection<Integer> ids, String key, int size) {
		
		List<String> blockList = new ArrayList<String>();
		
		StringBuilder builder = null;
		Iterator<Integer> iterator = ids.iterator();
		for (int i = 0; iterator.hasNext(); i++) {
			if (i % size == 0) {
				if (builder != null) {
					blockList.add(builder.toString());
				}
				builder = new StringBuilder();
			}
			builder.append(key);
			builder.append(iterator.next());
		}
		if (builder != null) {
			blockList.add(builder.toString());
		}
		
		return blockList;
	}
	
	/**
	 * マーケットの統計情報を取得します。
	 * @param typeIDs
	 * @param regionIDs
	 * @param hours
	 * @param minQuantity
	 * @return
	 */
	public List<EveCentralMarketStat> getMarketStat(
			int[] typeIDs, int[] regionIDs, int hours, int minQuantity, int system) {
		
		List<Integer> typeIDList = new ArrayList<Integer>();
		List<Integer> regionIDList = new ArrayList<Integer>();
		
		for (int typeID : typeIDs) {
			typeIDList.add(typeID);
		}
		for (int regionID : regionIDs) {
			regionIDList.add(regionID);
		}
		
		return this.getMarketStat(typeIDList, regionIDList, hours, minQuantity, system);
	}
	
	/**
	 * マーケットの統計情報を取得します。
	 * @param typeIDs
	 * @param regionIDs
	 * @param hours
	 * @param minQuantity
	 * @return
	 */
	public List<EveCentralMarketStat> getMarketStat(
			Collection<Integer> typeIDs, Collection<Integer> regionIDs, int hours, int minQuantity, int system) {
		
		List<EveCentralMarketStat> marketStats = new ArrayList<EveCentralMarketStat>();
		
		List<String> queryList = new ArrayList<String>();
		
		List<String> typeBlockList = this.buildQueryBlocks(typeIDs, "&typeid=", 50);
		List<String> regionBlockList = this.buildQueryBlocks(regionIDs, "&regionlimit=", 50);
		
		StringBuilder builder;
		for (String typeIDBlock : typeBlockList) {
			for (String regionIDBlock : regionBlockList) {
				builder = new StringBuilder();
				builder.append("http://api.eve-central.com/api/marketstat");
				builder.append("?hours=");
				builder.append(hours);
				if (minQuantity > 0) {
					builder.append("&minQ=");
					builder.append(minQuantity);
				}
				if (system > 0) {
					builder.append("&usesystem=");
					builder.append(system);
				}
				builder.append(typeIDBlock);
				builder.append(regionIDBlock);
				
				queryList.add(builder.toString());
			}
			if (regionBlockList.size() == 0) {
				builder = new StringBuilder();
				builder.append("http://api.eve-central.com/api/marketstat");
				builder.append("?hours=");
				builder.append(hours);
				if (minQuantity > 0) {
					builder.append("&minQ=");
					builder.append(minQuantity);
				}
				if (system > 0) {
					builder.append("&usesystem=");
					builder.append(system);
				}
				builder.append(typeIDBlock);
				
				queryList.add(builder.toString());
			}
		}
		
		for (String query : queryList) {
			marketStats.addAll(this.getMarketStats(query));
		}
		
		return marketStats;
	}
	
	
	/**
	 * マーケットの統計情報を取得します。
	 * このメソッドは指定のクエリで EVE Central と連携する実装メソッドです。
	 * @param query
	 * @return
	 */
	private List<EveCentralMarketStat> getMarketStats(String query) {
		
		DocumentBuilder builder = null;
		try {
			builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
		Document document = null;
		try {
			if (logger != null) {
				logger.info("EVE Central API へクエリを送信: " + query);
			}
			
			document = builder.parse(new URL(query).openStream());
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
		
		List<EveCentralMarketStat> marketStats = new ArrayList<EveCentralMarketStat>();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		try {
			NodeList typeNodeList = (NodeList) xPath.evaluate("//type", document, XPathConstants.NODESET);
			
			for (int i = 0; i < typeNodeList.getLength(); i++) {
				Node typeNode = typeNodeList.item(i);
				NodeList orderKindNodeList = typeNode.getChildNodes();
				
				EveCentralMarketStat marketStat = new EveCentralMarketStat();
				
				marketStat.setTypeID(Integer.parseInt(typeNode.getAttributes().getNamedItem("id").getNodeValue()));
				
				for (int j = 0; j < orderKindNodeList.getLength(); j++) {
					Node orderKindNode = orderKindNodeList.item(j);
					NodeList statNodeList = orderKindNode.getChildNodes();
					
					for (int k = 0; k < statNodeList.getLength(); k++) {
						Node statNode = statNodeList.item(k);
						
						String statNodeName = statNode.getNodeName();
						String statNodeText = statNode.getTextContent();
						
						if (orderKindNode.getNodeName().equals("all")) {
							if (statNodeName.equals("volume")) {
								marketStat.setAllVolume(Long.parseLong(statNodeText));
							} else if (statNodeName.equals("avg")) {
								marketStat.setAllAvg(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("max")) {
								marketStat.setAllMax(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("min")) {
								marketStat.setAllMin(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("stddev")) {
								marketStat.setAllStdDev(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("median")) {
								marketStat.setAllMedian(Double.parseDouble(statNodeText));
							}
						} else if (orderKindNode.getNodeName().equals("buy")) {
							if (statNodeName.equals("volume")) {
								marketStat.setBuyVolume(Long.parseLong(statNodeText));
							} else if (statNodeName.equals("avg")) {
								marketStat.setBuyAvg(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("max")) {
								marketStat.setBuyMax(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("min")) {
								marketStat.setBuyMin(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("stddev")) {
								marketStat.setBuyStdDev(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("median")) {
								marketStat.setBuyMedian(Double.parseDouble(statNodeText));
							}
						} else if (orderKindNode.getNodeName().equals("sell")) {
							if (statNodeName.equals("volume")) {
								marketStat.setSellVolume(Long.parseLong(statNodeText));
							} else if (statNodeName.equals("avg")) {
								marketStat.setSellAvg(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("max")) {
								marketStat.setSellMax(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("min")) {
								marketStat.setSellMin(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("stddev")) {
								marketStat.setSellStdDev(Double.parseDouble(statNodeText));
							} else if (statNodeName.equals("median")) {
								marketStat.setSellMedian(Double.parseDouble(statNodeText));
							}
						}
					}
					
				}
				
				marketStats.add(marketStat);
			}
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return marketStats;
	}
	
	/**
	 * マーケットのオーダー情報を取得します。
	 * @param typeID
	 * @param regionIDs
	 * @param hours
	 * @param minQuantity
	 * @param system
	 * @return
	 */
	public List<EveCentralMarketOrder> getMarketOrder(
			int typeID, int[] regionIDs, int hours, int minQuantity, int system) {
		
		List<Integer> regionIDList = new ArrayList<Integer>();
		
		for (int regionID : regionIDs) {
			regionIDList.add(regionID);
		}
		
		return this.getMarketOrder(typeID, regionIDList, hours, minQuantity, system);
	}
	
	/**
	 * マーケットのオーダー情報を取得します。
	 * @param typeID
	 * @param regionIDs
	 * @param hours
	 * @param minQuantity
	 * @param system
	 * @return
	 */
	public List<EveCentralMarketOrder> getMarketOrder(
			int typeID, Collection<Integer> regionIDs, int hours, int minQuantity, int system) {
		
		List<EveCentralMarketOrder> marketOrders = new ArrayList<EveCentralMarketOrder>();
		
		List<String> queryList = new ArrayList<String>();
		
		List<String> regionBlockList = this.buildQueryBlocks(regionIDs, "&regionlimit=", 50);
		
		StringBuilder builder = new StringBuilder();
		for (String regionIDBlock : regionBlockList) {
			builder.append("http://api.eve-central.com/api/quicklook");
			builder.append("?typeid=");
			builder.append(typeID);
			builder.append(regionIDBlock);
			if (hours > 0) {
				builder.append("&sethours=");
				builder.append(hours);
			}
			if (minQuantity > 0) {
				builder.append("&setminQ=");
				builder.append(minQuantity);
			}
			if (system > 0) {
				builder.append("&usesystem=");
				builder.append(system);
			}
			
			queryList.add(builder.toString());
		}
		if (regionBlockList.size() == 0) {
			builder.append("http://api.eve-central.com/api/quicklook");
			builder.append("?typeid=");
			builder.append(typeID);
			if (hours > 0) {
				builder.append("&sethours=");
				builder.append(hours);
			}
			if (minQuantity > 0) {
				builder.append("&setminQ=");
				builder.append(minQuantity);
			}
			if (system > 0) {
				builder.append("&usesystem=");
				builder.append(system);
			}
			
			queryList.add(builder.toString());
		}
		
		for (String query : queryList) {
			marketOrders.addAll(this.getMarketOrders(query));
		}
		
		return marketOrders;
	}
	
	/**
	 * マーケットのオーダー情報を取得します。
	 * このメソッドは指定のクエリで EVE Central と連携する実装メソッドです。
	 * @param query
	 * @return
	 */
	private List<EveCentralMarketOrder> getMarketOrders(String query) {
		
		long startTime = System.nanoTime();
		
		final List<EveCentralMarketOrder> orders = new ArrayList<EveCentralMarketOrder>();

		try {
			final XMLReader reader = XMLReaderFactory.createXMLReader();
			
			reader.setContentHandler(new QuicklookHandler(orders));
			
			if (logger != null) {
				logger.info("EVE Central API へクエリを送信: " + query);
			}
			
			reader.parse(new InputSource(query));
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println((System.nanoTime() - startTime) / 1000000 + " milli sec.");
		
		return orders;
	}
	
}

/**
 * 
 * @author vagrantmuse
 *
 */
class MarketStatHandler extends DefaultHandler {
	
	private static enum Element {
		
		EVEC_API("evec_api") {
			@Override
			public void endElement(MarketStatHandler handler) {}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		MARKETSTAT("marketstat") {
			@Override
			public void endElement(MarketStatHandler handler) {}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		ALL("all") {
			@Override
			public void endElement(MarketStatHandler handler) {}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		BUY("buy") {
			@Override
			public void endElement(MarketStatHandler handler) {}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		SELL("sell") {
			@Override
			public void endElement(MarketStatHandler handler) {}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		TYPE("type") {
			@Override
			public void endElement(MarketStatHandler handler) {
				handler.marketStats.add(handler.marketStat);
			}

			@Override
			public void startElement(MarketStatHandler handler) {
				handler.marketStat = new EveCentralMarketStat();
				handler.marketStat.setTypeID(Integer.parseInt(handler.attributes.getValue("id")));
			}
		},
		AVG("avg") {
			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellAvg(Double.parseDouble(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyAvg(Double.parseDouble(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllAvg(Double.parseDouble(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		MAX("max") {
			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellMax(Double.parseDouble(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyMax(Double.parseDouble(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllMax(Double.parseDouble(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		MIN("min") {
			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellMin(Double.parseDouble(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyMin(Double.parseDouble(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllMin(Double.parseDouble(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		STDDEV("stddev") {
			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellStdDev(Double.parseDouble(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyStdDev(Double.parseDouble(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllStdDev(Double.parseDouble(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
		},
		MEDIAN("median") {

			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellMedian(Double.parseDouble(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyMedian(Double.parseDouble(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllMedian(Double.parseDouble(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
			
		},
		VOLUME("volume") {
			@Override
			public void endElement(MarketStatHandler handler) {
				switch (handler.elements.peek()) {
				case SELL:
					handler.marketStat.setSellVolume(Long.parseLong(handler.textContent.toString()));
					break;
				case BUY:
					handler.marketStat.setBuyVolume(Long.parseLong(handler.textContent.toString()));
					break;
				case ALL:
					handler.marketStat.setAllVolume(Long.parseLong(handler.textContent.toString()));
					break;
				default:
					break;
				}
			}

			@Override
			public void startElement(MarketStatHandler handler) {}
		};
		
		/**
		 * 
		 */
		private final String name;
		
		/**
		 * @param name
		 */
		private Element(String name) {
			this.name = name;
		}
		
		/**
		 * 
		 * @param name
		 * @param reader
		 * @param parent
		 * @param attributes
		 * @return
		 */
		public static Element get(String name) {
			
			for (Element element : Element.values()) {
				if (element.name.equals(name)) {
					return element;
				}
			}
			
			return null;
		}

		/**
		 * 
		 * @param handler
		 */
		public abstract void startElement(MarketStatHandler handler);
		
		/**
		 * 
		 * @param handler
		 */
		public abstract void endElement(MarketStatHandler handler);
	}
	
	/**
	 * 
	 */
	private StringBuilder textContent;
	
	/**
	 * 
	 */
	private Attributes attributes;
	
	/**
	 * 
	 */
	private Stack<Element> elements = new Stack<Element>();
	
	/**
	 * 
	 */
	private List<EveCentralMarketStat> marketStats;
	private EveCentralMarketStat marketStat;
	
	/**
	 * 
	 * @param marketStats
	 */
	public MarketStatHandler(List<EveCentralMarketStat> marketStats) {
		super();
		this.marketStats = marketStats;
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		if (this.textContent == null) {
			this.textContent = new StringBuilder();
		}
		
		this.textContent.append(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		Element element = Element.get(qName);
		if (element != null) {
			this.elements.pop();
			element.endElement(this);
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		this.textContent = null;
		
		this.attributes = attributes;
		
		Element element = Element.get(qName);
		if (element != null) {
			this.elements.push(element);
			element.startElement(this);
		}
	}
	
}

/**
 * 
 * @author vagrantmuse
 *
 */
class QuicklookHandler extends DefaultHandler {
	
	/**
	 * 
	 * @author Tabunoki
	 *
	 */
	private static enum Element {
		
		ITEM("item") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.typeID = Integer.parseInt(handler.textContent.toString());
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		ITEMNAME("itemname") {

			@Override
			public void endElement(QuicklookHandler handler) {
				
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		SELL_ORDERS("sell_orders") {
			@Override
			public void endElement(QuicklookHandler handler) {}

			@Override
			public void startElement(QuicklookHandler handler) {}
		},
		BUY_ORDERS("buy_orders") {
			@Override
			public void endElement(QuicklookHandler handler) {}

			@Override
			public void startElement(QuicklookHandler handler) {}
		},
		ORDER("order") {

			@Override
			public void endElement(QuicklookHandler handler) {
				
				if (handler.elements.peek() == BUY_ORDERS) {
					handler.marketOrder.setBid(true);
				} else {
					handler.marketOrder.setBid(false);
				}
				
				handler.marketOrder = null;
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
				handler.marketOrder = new EveCentralMarketOrder();
				handler.marketOrder.setTypeID(handler.typeID);
				handler.marketOrder.setOrderID(Long.parseLong(handler.attributes.getValue("id")));
				
				handler.marketOrders.add(handler.marketOrder);
			}},
		REGION("region") {

			@Override
			public void endElement(QuicklookHandler handler) {
				
				if (handler.elements.size() > 0 && handler.elements.peek() == ORDER) {
					handler.marketOrder.setRegionID(
							Integer.parseInt(handler.textContent.toString().trim()));
				}
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		STATION("station") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setStationID(
						Integer.parseInt(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		STATION_NAME("station_name") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setStationName(handler.textContent.toString());
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		SECURITY("security") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setSecurity(Double.parseDouble(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		RANGE("range") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setRange(
						Integer.parseInt(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		PRICE("price") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setPrice(
						Double.parseDouble(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		VOL_REMAIN("vol_remain") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setVolumeRemain(
						Integer.parseInt(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		MIN_VOLUME("min_volume") {

			@Override
			public void endElement(QuicklookHandler handler) {
				handler.marketOrder.setMinVolume(
						Integer.parseInt(handler.textContent.toString()));
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		EXPIRES("expires") {

			@Override
			public void endElement(QuicklookHandler handler) {
				try {
					handler.marketOrder.setExpires(
							handler.expiresFormat.parse(handler.textContent.toString()));
				} catch (ParseException e) {
//					e.printStackTrace();
					handler.marketOrder.setExpires(handler.now.getTime());
				}
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}},
		REPORTED_TIME("reported_time") {

			@Override
			public void endElement(QuicklookHandler handler) {
				try {
					handler.marketOrder.setReportedTime(
							handler.reportedFormat.parse(handler.now.get(Calendar.YEAR) + "-" + handler.textContent.toString()));
				} catch (ParseException e) {
//					e.printStackTrace();
					handler.marketOrder.setReportedTime(handler.now.getTime());
				}
			
			}

			@Override
			public void startElement(QuicklookHandler handler) {
				
			}}
		;
		
		/**
		 * 
		 */
		private final String name;
		
		/**
		 * @param name
		 */
		private Element(String name) {
			this.name = name;
		}
		
		/**
		 * 
		 * @param name
		 * @param reader
		 * @param parent
		 * @param attributes
		 * @return
		 */
		public static Element get(String name) {
			
			for (Element element : Element.values()) {
				if (element.name.equals(name)) {
					return element;
				}
			}
			
			return null;
		}
		
		public abstract void startElement(QuicklookHandler handler);
		
		public abstract void endElement(QuicklookHandler handler);
	}
	
	/**
	 * 
	 */
	private StringBuilder textContent;
	
	/**
	 * 
	 */
	private Attributes attributes;
	
	/**
	 * 
	 */
	private Stack<Element> elements = new Stack<Element>();
	
	/**
	 * 
	 */
	private int typeID;
	
	/**
	 * 
	 */
	private final List<EveCentralMarketOrder> marketOrders;
	
	/**
	 * 処理中のオーダーです。
	 */
	private EveCentralMarketOrder marketOrder;
	
	/**
	 * 
	 */
	private final DateFormat expiresFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 
	 */
	private final DateFormat reportedFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 
	 */
	private final Calendar now = Calendar.getInstance(new SimpleTimeZone(0, "GMT"));
	

	/**
	 * @param marketOrders
	 * @param type
	 */
	public QuicklookHandler(List<EveCentralMarketOrder> marketOrders) {
		super();
		this.marketOrders = marketOrders;
		
		expiresFormat.setCalendar(now);
		reportedFormat.setCalendar(now);
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		
		if (this.textContent == null) {
			this.textContent = new StringBuilder();
			this.textContent.append(ch, start, length);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		
		Element element = Element.get(qName);
		if (element != null) {
			this.elements.pop();
			element.endElement(this);
		}
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		this.textContent = null;
		
		this.attributes = attributes;
		
		Element element = Element.get(qName);
		if (element != null) {
			this.elements.push(element);
			element.startElement(this);
		}
	}
	
}
