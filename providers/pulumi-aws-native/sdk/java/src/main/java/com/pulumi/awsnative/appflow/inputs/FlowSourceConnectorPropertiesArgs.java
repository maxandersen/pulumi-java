// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowAmplitudeSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowDatadogSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowDynatraceSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowGoogleAnalyticsSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowInforNexusSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowMarketoSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowS3SourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSAPODataSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSalesforceSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowServiceNowSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSingularSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSlackSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowTrendmicroSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowVeevaSourcePropertiesArgs;
import com.pulumi.awsnative.appflow.inputs.FlowZendeskSourcePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source connector details required to query a connector
 * 
 */
public final class FlowSourceConnectorPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSourceConnectorPropertiesArgs Empty = new FlowSourceConnectorPropertiesArgs();

    @Import(name="amplitude")
    private @Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude;

    public Optional<Output<FlowAmplitudeSourcePropertiesArgs>> amplitude() {
        return Optional.ofNullable(this.amplitude);
    }

    @Import(name="datadog")
    private @Nullable Output<FlowDatadogSourcePropertiesArgs> datadog;

    public Optional<Output<FlowDatadogSourcePropertiesArgs>> datadog() {
        return Optional.ofNullable(this.datadog);
    }

    @Import(name="dynatrace")
    private @Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace;

    public Optional<Output<FlowDynatraceSourcePropertiesArgs>> dynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }

    @Import(name="googleAnalytics")
    private @Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics;

    public Optional<Output<FlowGoogleAnalyticsSourcePropertiesArgs>> googleAnalytics() {
        return Optional.ofNullable(this.googleAnalytics);
    }

    @Import(name="inforNexus")
    private @Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus;

    public Optional<Output<FlowInforNexusSourcePropertiesArgs>> inforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }

    @Import(name="marketo")
    private @Nullable Output<FlowMarketoSourcePropertiesArgs> marketo;

    public Optional<Output<FlowMarketoSourcePropertiesArgs>> marketo() {
        return Optional.ofNullable(this.marketo);
    }

    @Import(name="s3")
    private @Nullable Output<FlowS3SourcePropertiesArgs> s3;

    public Optional<Output<FlowS3SourcePropertiesArgs>> s3() {
        return Optional.ofNullable(this.s3);
    }

    @Import(name="sAPOData")
    private @Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData;

    public Optional<Output<FlowSAPODataSourcePropertiesArgs>> sAPOData() {
        return Optional.ofNullable(this.sAPOData);
    }

    @Import(name="salesforce")
    private @Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce;

    public Optional<Output<FlowSalesforceSourcePropertiesArgs>> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }

    @Import(name="serviceNow")
    private @Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow;

    public Optional<Output<FlowServiceNowSourcePropertiesArgs>> serviceNow() {
        return Optional.ofNullable(this.serviceNow);
    }

    @Import(name="singular")
    private @Nullable Output<FlowSingularSourcePropertiesArgs> singular;

    public Optional<Output<FlowSingularSourcePropertiesArgs>> singular() {
        return Optional.ofNullable(this.singular);
    }

    @Import(name="slack")
    private @Nullable Output<FlowSlackSourcePropertiesArgs> slack;

    public Optional<Output<FlowSlackSourcePropertiesArgs>> slack() {
        return Optional.ofNullable(this.slack);
    }

    @Import(name="trendmicro")
    private @Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro;

    public Optional<Output<FlowTrendmicroSourcePropertiesArgs>> trendmicro() {
        return Optional.ofNullable(this.trendmicro);
    }

    @Import(name="veeva")
    private @Nullable Output<FlowVeevaSourcePropertiesArgs> veeva;

    public Optional<Output<FlowVeevaSourcePropertiesArgs>> veeva() {
        return Optional.ofNullable(this.veeva);
    }

    @Import(name="zendesk")
    private @Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk;

    public Optional<Output<FlowZendeskSourcePropertiesArgs>> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    private FlowSourceConnectorPropertiesArgs() {}

    private FlowSourceConnectorPropertiesArgs(FlowSourceConnectorPropertiesArgs $) {
        this.amplitude = $.amplitude;
        this.datadog = $.datadog;
        this.dynatrace = $.dynatrace;
        this.googleAnalytics = $.googleAnalytics;
        this.inforNexus = $.inforNexus;
        this.marketo = $.marketo;
        this.s3 = $.s3;
        this.sAPOData = $.sAPOData;
        this.salesforce = $.salesforce;
        this.serviceNow = $.serviceNow;
        this.singular = $.singular;
        this.slack = $.slack;
        this.trendmicro = $.trendmicro;
        this.veeva = $.veeva;
        this.zendesk = $.zendesk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSourceConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSourceConnectorPropertiesArgs $;

        public Builder() {
            $ = new FlowSourceConnectorPropertiesArgs();
        }

        public Builder(FlowSourceConnectorPropertiesArgs defaults) {
            $ = new FlowSourceConnectorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder amplitude(@Nullable Output<FlowAmplitudeSourcePropertiesArgs> amplitude) {
            $.amplitude = amplitude;
            return this;
        }

        public Builder amplitude(FlowAmplitudeSourcePropertiesArgs amplitude) {
            return amplitude(Output.of(amplitude));
        }

        public Builder datadog(@Nullable Output<FlowDatadogSourcePropertiesArgs> datadog) {
            $.datadog = datadog;
            return this;
        }

        public Builder datadog(FlowDatadogSourcePropertiesArgs datadog) {
            return datadog(Output.of(datadog));
        }

        public Builder dynatrace(@Nullable Output<FlowDynatraceSourcePropertiesArgs> dynatrace) {
            $.dynatrace = dynatrace;
            return this;
        }

        public Builder dynatrace(FlowDynatraceSourcePropertiesArgs dynatrace) {
            return dynatrace(Output.of(dynatrace));
        }

        public Builder googleAnalytics(@Nullable Output<FlowGoogleAnalyticsSourcePropertiesArgs> googleAnalytics) {
            $.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder googleAnalytics(FlowGoogleAnalyticsSourcePropertiesArgs googleAnalytics) {
            return googleAnalytics(Output.of(googleAnalytics));
        }

        public Builder inforNexus(@Nullable Output<FlowInforNexusSourcePropertiesArgs> inforNexus) {
            $.inforNexus = inforNexus;
            return this;
        }

        public Builder inforNexus(FlowInforNexusSourcePropertiesArgs inforNexus) {
            return inforNexus(Output.of(inforNexus));
        }

        public Builder marketo(@Nullable Output<FlowMarketoSourcePropertiesArgs> marketo) {
            $.marketo = marketo;
            return this;
        }

        public Builder marketo(FlowMarketoSourcePropertiesArgs marketo) {
            return marketo(Output.of(marketo));
        }

        public Builder s3(@Nullable Output<FlowS3SourcePropertiesArgs> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(FlowS3SourcePropertiesArgs s3) {
            return s3(Output.of(s3));
        }

        public Builder sAPOData(@Nullable Output<FlowSAPODataSourcePropertiesArgs> sAPOData) {
            $.sAPOData = sAPOData;
            return this;
        }

        public Builder sAPOData(FlowSAPODataSourcePropertiesArgs sAPOData) {
            return sAPOData(Output.of(sAPOData));
        }

        public Builder salesforce(@Nullable Output<FlowSalesforceSourcePropertiesArgs> salesforce) {
            $.salesforce = salesforce;
            return this;
        }

        public Builder salesforce(FlowSalesforceSourcePropertiesArgs salesforce) {
            return salesforce(Output.of(salesforce));
        }

        public Builder serviceNow(@Nullable Output<FlowServiceNowSourcePropertiesArgs> serviceNow) {
            $.serviceNow = serviceNow;
            return this;
        }

        public Builder serviceNow(FlowServiceNowSourcePropertiesArgs serviceNow) {
            return serviceNow(Output.of(serviceNow));
        }

        public Builder singular(@Nullable Output<FlowSingularSourcePropertiesArgs> singular) {
            $.singular = singular;
            return this;
        }

        public Builder singular(FlowSingularSourcePropertiesArgs singular) {
            return singular(Output.of(singular));
        }

        public Builder slack(@Nullable Output<FlowSlackSourcePropertiesArgs> slack) {
            $.slack = slack;
            return this;
        }

        public Builder slack(FlowSlackSourcePropertiesArgs slack) {
            return slack(Output.of(slack));
        }

        public Builder trendmicro(@Nullable Output<FlowTrendmicroSourcePropertiesArgs> trendmicro) {
            $.trendmicro = trendmicro;
            return this;
        }

        public Builder trendmicro(FlowTrendmicroSourcePropertiesArgs trendmicro) {
            return trendmicro(Output.of(trendmicro));
        }

        public Builder veeva(@Nullable Output<FlowVeevaSourcePropertiesArgs> veeva) {
            $.veeva = veeva;
            return this;
        }

        public Builder veeva(FlowVeevaSourcePropertiesArgs veeva) {
            return veeva(Output.of(veeva));
        }

        public Builder zendesk(@Nullable Output<FlowZendeskSourcePropertiesArgs> zendesk) {
            $.zendesk = zendesk;
            return this;
        }

        public Builder zendesk(FlowZendeskSourcePropertiesArgs zendesk) {
            return zendesk(Output.of(zendesk));
        }

        public FlowSourceConnectorPropertiesArgs build() {
            return $;
        }
    }

}
