
package org.mule.modules.tradeleads.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.tradeleads.TradeLeadsConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TradeLeadsConnectorProcessAdapter</code> is a wrapper around {@link TradeLeadsConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-23T02:51:39-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class TradeLeadsConnectorProcessAdapter
    extends TradeLeadsConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TradeLeadsConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TradeLeadsConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TradeLeadsConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TradeLeadsConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TradeLeadsConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TradeLeadsConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
