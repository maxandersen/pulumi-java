// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement_v1.inputs.BillingDestinationResponse;
import java.util.List;
import java.util.Objects;


/**
 * Billing related configuration of the service. The following example shows how to configure monitored resources and metrics for billing, `consumer_destinations` is the only supported destination and the monitored resources need at least one label key `cloud.googleapis.com/location` to indicate the location of the billing usage, using different monitored resources between monitoring and billing is recommended so they can be evolved independently: monitored_resources: - type: library.googleapis.com/billing_branch labels: - key: cloud.googleapis.com/location description: | Predefined label to support billing location restriction. - key: city description: | Custom label to define the city where the library branch is located in. - key: name description: Custom label to define the name of the library branch. metrics: - name: library.googleapis.com/book/borrowed_count metric_kind: DELTA value_type: INT64 unit: &#34;1&#34; billing: consumer_destinations: - monitored_resource: library.googleapis.com/billing_branch metrics: - library.googleapis.com/book/borrowed_count
 * 
 */
public final class BillingResponse extends com.pulumi.resources.InvokeArgs {

    public static final BillingResponse Empty = new BillingResponse();

    /**
     * Billing configurations for sending metrics to the consumer project. There can be multiple consumer destinations per service, each one must have a different monitored resource type. A metric can be used in at most one consumer destination.
     * 
     */
    @Import(name="consumerDestinations", required=true)
    private List<BillingDestinationResponse> consumerDestinations;

    public List<BillingDestinationResponse> consumerDestinations() {
        return this.consumerDestinations;
    }

    private BillingResponse() {}

    private BillingResponse(BillingResponse $) {
        this.consumerDestinations = $.consumerDestinations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingResponse $;

        public Builder() {
            $ = new BillingResponse();
        }

        public Builder(BillingResponse defaults) {
            $ = new BillingResponse(Objects.requireNonNull(defaults));
        }

        public Builder consumerDestinations(List<BillingDestinationResponse> consumerDestinations) {
            $.consumerDestinations = consumerDestinations;
            return this;
        }

        public Builder consumerDestinations(BillingDestinationResponse... consumerDestinations) {
            return consumerDestinations(List.of(consumerDestinations));
        }

        public BillingResponse build() {
            $.consumerDestinations = Objects.requireNonNull($.consumerDestinations, "expected parameter 'consumerDestinations' to be non-null");
            return $;
        }
    }

}
