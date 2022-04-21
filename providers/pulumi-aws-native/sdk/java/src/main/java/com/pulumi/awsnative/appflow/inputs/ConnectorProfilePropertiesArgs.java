// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.ConnectorProfileDatadogConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileDynatraceConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileInforNexusConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileMarketoConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileRedshiftConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileSAPODataConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileSalesforceConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileServiceNowConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileSlackConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileSnowflakeConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileVeevaConnectorProfilePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileZendeskConnectorProfilePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connector specific properties needed to create connector profile - currently not needed for Amplitude, Trendmicro, Googleanalytics and Singular
 * 
 */
public final class ConnectorProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfilePropertiesArgs Empty = new ConnectorProfilePropertiesArgs();

    @Import(name="datadog")
    private @Nullable Output<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog;

    public Optional<Output<ConnectorProfileDatadogConnectorProfilePropertiesArgs>> datadog() {
        return Optional.ofNullable(this.datadog);
    }

    @Import(name="dynatrace")
    private @Nullable Output<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace;

    public Optional<Output<ConnectorProfileDynatraceConnectorProfilePropertiesArgs>> dynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }

    @Import(name="inforNexus")
    private @Nullable Output<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus;

    public Optional<Output<ConnectorProfileInforNexusConnectorProfilePropertiesArgs>> inforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }

    @Import(name="marketo")
    private @Nullable Output<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo;

    public Optional<Output<ConnectorProfileMarketoConnectorProfilePropertiesArgs>> marketo() {
        return Optional.ofNullable(this.marketo);
    }

    @Import(name="redshift")
    private @Nullable Output<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift;

    public Optional<Output<ConnectorProfileRedshiftConnectorProfilePropertiesArgs>> redshift() {
        return Optional.ofNullable(this.redshift);
    }

    @Import(name="sAPOData")
    private @Nullable Output<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData;

    public Optional<Output<ConnectorProfileSAPODataConnectorProfilePropertiesArgs>> sAPOData() {
        return Optional.ofNullable(this.sAPOData);
    }

    @Import(name="salesforce")
    private @Nullable Output<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce;

    public Optional<Output<ConnectorProfileSalesforceConnectorProfilePropertiesArgs>> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }

    @Import(name="serviceNow")
    private @Nullable Output<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow;

    public Optional<Output<ConnectorProfileServiceNowConnectorProfilePropertiesArgs>> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }

    @Import(name="slack")
    private @Nullable Output<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack;

    public Optional<Output<ConnectorProfileSlackConnectorProfilePropertiesArgs>> slack() {
        return Optional.ofNullable(this.slack);
    }

    @Import(name="snowflake")
    private @Nullable Output<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake;

    public Optional<Output<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs>> snowflake() {
        return Optional.ofNullable(this.snowflake);
    }

    @Import(name="veeva")
    private @Nullable Output<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva;

    public Optional<Output<ConnectorProfileVeevaConnectorProfilePropertiesArgs>> veeva() {
        return Optional.ofNullable(this.veeva);
    }

    @Import(name="zendesk")
    private @Nullable Output<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk;

    public Optional<Output<ConnectorProfileZendeskConnectorProfilePropertiesArgs>> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    private ConnectorProfilePropertiesArgs() {}

    private ConnectorProfilePropertiesArgs(ConnectorProfilePropertiesArgs $) {
        this.datadog = $.datadog;
        this.dynatrace = $.dynatrace;
        this.inforNexus = $.inforNexus;
        this.marketo = $.marketo;
        this.redshift = $.redshift;
        this.sAPOData = $.sAPOData;
        this.salesforce = $.salesforce;
        this.serviceNow = $.serviceNow;
        this.slack = $.slack;
        this.snowflake = $.snowflake;
        this.veeva = $.veeva;
        this.zendesk = $.zendesk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfilePropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfilePropertiesArgs();
        }

        public Builder(ConnectorProfilePropertiesArgs defaults) {
            $ = new ConnectorProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder datadog(@Nullable Output<ConnectorProfileDatadogConnectorProfilePropertiesArgs> datadog) {
            $.datadog = datadog;
            return this;
        }

        public Builder datadog(ConnectorProfileDatadogConnectorProfilePropertiesArgs datadog) {
            return datadog(Output.of(datadog));
        }

        public Builder dynatrace(@Nullable Output<ConnectorProfileDynatraceConnectorProfilePropertiesArgs> dynatrace) {
            $.dynatrace = dynatrace;
            return this;
        }

        public Builder dynatrace(ConnectorProfileDynatraceConnectorProfilePropertiesArgs dynatrace) {
            return dynatrace(Output.of(dynatrace));
        }

        public Builder inforNexus(@Nullable Output<ConnectorProfileInforNexusConnectorProfilePropertiesArgs> inforNexus) {
            $.inforNexus = inforNexus;
            return this;
        }

        public Builder inforNexus(ConnectorProfileInforNexusConnectorProfilePropertiesArgs inforNexus) {
            return inforNexus(Output.of(inforNexus));
        }

        public Builder marketo(@Nullable Output<ConnectorProfileMarketoConnectorProfilePropertiesArgs> marketo) {
            $.marketo = marketo;
            return this;
        }

        public Builder marketo(ConnectorProfileMarketoConnectorProfilePropertiesArgs marketo) {
            return marketo(Output.of(marketo));
        }

        public Builder redshift(@Nullable Output<ConnectorProfileRedshiftConnectorProfilePropertiesArgs> redshift) {
            $.redshift = redshift;
            return this;
        }

        public Builder redshift(ConnectorProfileRedshiftConnectorProfilePropertiesArgs redshift) {
            return redshift(Output.of(redshift));
        }

        public Builder sAPOData(@Nullable Output<ConnectorProfileSAPODataConnectorProfilePropertiesArgs> sAPOData) {
            $.sAPOData = sAPOData;
            return this;
        }

        public Builder sAPOData(ConnectorProfileSAPODataConnectorProfilePropertiesArgs sAPOData) {
            return sAPOData(Output.of(sAPOData));
        }

        public Builder salesforce(@Nullable Output<ConnectorProfileSalesforceConnectorProfilePropertiesArgs> salesforce) {
            $.salesforce = salesforce;
            return this;
        }

        public Builder salesforce(ConnectorProfileSalesforceConnectorProfilePropertiesArgs salesforce) {
            return salesforce(Output.of(salesforce));
        }

        public Builder serviceNow(@Nullable Output<ConnectorProfileServiceNowConnectorProfilePropertiesArgs> serviceNow) {
            $.serviceNow = serviceNow;
            return this;
        }

        public Builder serviceNow(ConnectorProfileServiceNowConnectorProfilePropertiesArgs serviceNow) {
            return serviceNow(Output.of(serviceNow));
        }

        public Builder slack(@Nullable Output<ConnectorProfileSlackConnectorProfilePropertiesArgs> slack) {
            $.slack = slack;
            return this;
        }

        public Builder slack(ConnectorProfileSlackConnectorProfilePropertiesArgs slack) {
            return slack(Output.of(slack));
        }

        public Builder snowflake(@Nullable Output<ConnectorProfileSnowflakeConnectorProfilePropertiesArgs> snowflake) {
            $.snowflake = snowflake;
            return this;
        }

        public Builder snowflake(ConnectorProfileSnowflakeConnectorProfilePropertiesArgs snowflake) {
            return snowflake(Output.of(snowflake));
        }

        public Builder veeva(@Nullable Output<ConnectorProfileVeevaConnectorProfilePropertiesArgs> veeva) {
            $.veeva = veeva;
            return this;
        }

        public Builder veeva(ConnectorProfileVeevaConnectorProfilePropertiesArgs veeva) {
            return veeva(Output.of(veeva));
        }

        public Builder zendesk(@Nullable Output<ConnectorProfileZendeskConnectorProfilePropertiesArgs> zendesk) {
            $.zendesk = zendesk;
            return this;
        }

        public Builder zendesk(ConnectorProfileZendeskConnectorProfilePropertiesArgs zendesk) {
            return zendesk(Output.of(zendesk));
        }

        public ConnectorProfilePropertiesArgs build() {
            return $;
        }
    }

}
