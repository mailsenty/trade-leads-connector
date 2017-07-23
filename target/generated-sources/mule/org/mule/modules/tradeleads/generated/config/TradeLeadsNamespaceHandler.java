
package org.mule.modules.tradeleads.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/trade-leads</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-23T02:51:39-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TradeLeadsNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(TradeLeadsNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [trade-leads] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [trade-leads] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new TradeLeadsConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("greet", new GreetDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("greet", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("query", new QueryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("query", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("industries", new IndustriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("industries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("countries", new CountriesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("countries", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("trade_regions", new Trade_regionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("trade_regions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("world_regions", new World_regionsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("world_regions", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("sources", new SourcesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("sources", "@Processor", ex);
        }
    }

}
