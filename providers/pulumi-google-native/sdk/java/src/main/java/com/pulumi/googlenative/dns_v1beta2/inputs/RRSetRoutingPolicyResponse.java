// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyGeoPolicyResponse;
import com.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyWrrPolicyResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A RRSetRoutingPolicy represents ResourceRecordSet data that is returned dynamically with the response varying based on configured properties such as geolocation or by weighted random selection.
 * 
 */
public final class RRSetRoutingPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyResponse Empty = new RRSetRoutingPolicyResponse();

    @Import(name="geo", required=true)
    private RRSetRoutingPolicyGeoPolicyResponse geo;

    public RRSetRoutingPolicyGeoPolicyResponse geo() {
        return this.geo;
    }

    @Import(name="geoPolicy", required=true)
    private RRSetRoutingPolicyGeoPolicyResponse geoPolicy;

    public RRSetRoutingPolicyGeoPolicyResponse geoPolicy() {
        return this.geoPolicy;
    }

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    @Import(name="wrr", required=true)
    private RRSetRoutingPolicyWrrPolicyResponse wrr;

    public RRSetRoutingPolicyWrrPolicyResponse wrr() {
        return this.wrr;
    }

    @Import(name="wrrPolicy", required=true)
    private RRSetRoutingPolicyWrrPolicyResponse wrrPolicy;

    public RRSetRoutingPolicyWrrPolicyResponse wrrPolicy() {
        return this.wrrPolicy;
    }

    private RRSetRoutingPolicyResponse() {}

    private RRSetRoutingPolicyResponse(RRSetRoutingPolicyResponse $) {
        this.geo = $.geo;
        this.geoPolicy = $.geoPolicy;
        this.kind = $.kind;
        this.wrr = $.wrr;
        this.wrrPolicy = $.wrrPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RRSetRoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyResponse $;

        public Builder() {
            $ = new RRSetRoutingPolicyResponse();
        }

        public Builder(RRSetRoutingPolicyResponse defaults) {
            $ = new RRSetRoutingPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder geo(RRSetRoutingPolicyGeoPolicyResponse geo) {
            $.geo = geo;
            return this;
        }

        public Builder geoPolicy(RRSetRoutingPolicyGeoPolicyResponse geoPolicy) {
            $.geoPolicy = geoPolicy;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder wrr(RRSetRoutingPolicyWrrPolicyResponse wrr) {
            $.wrr = wrr;
            return this;
        }

        public Builder wrrPolicy(RRSetRoutingPolicyWrrPolicyResponse wrrPolicy) {
            $.wrrPolicy = wrrPolicy;
            return this;
        }

        public RRSetRoutingPolicyResponse build() {
            $.geo = Objects.requireNonNull($.geo, "expected parameter 'geo' to be non-null");
            $.geoPolicy = Objects.requireNonNull($.geoPolicy, "expected parameter 'geoPolicy' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.wrr = Objects.requireNonNull($.wrr, "expected parameter 'wrr' to be non-null");
            $.wrrPolicy = Objects.requireNonNull($.wrrPolicy, "expected parameter 'wrrPolicy' to be non-null");
            return $;
        }
    }

}
