// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigNetworkResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedZonePrivateVisibilityConfigNetworkResponse Empty = new ManagedZonePrivateVisibilityConfigNetworkResponse();

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl", required=true)
    private String networkUrl;

    public String networkUrl() {
        return this.networkUrl;
    }

    private ManagedZonePrivateVisibilityConfigNetworkResponse() {}

    private ManagedZonePrivateVisibilityConfigNetworkResponse(ManagedZonePrivateVisibilityConfigNetworkResponse $) {
        this.kind = $.kind;
        this.networkUrl = $.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZonePrivateVisibilityConfigNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZonePrivateVisibilityConfigNetworkResponse $;

        public Builder() {
            $ = new ManagedZonePrivateVisibilityConfigNetworkResponse();
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetworkResponse defaults) {
            $ = new ManagedZonePrivateVisibilityConfigNetworkResponse(Objects.requireNonNull(defaults));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder networkUrl(String networkUrl) {
            $.networkUrl = networkUrl;
            return this;
        }

        public ManagedZonePrivateVisibilityConfigNetworkResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.networkUrl = Objects.requireNonNull($.networkUrl, "expected parameter 'networkUrl' to be non-null");
            return $;
        }
    }

}
