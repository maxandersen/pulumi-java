// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.composer.inputs.GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigWebServerNetworkAccessControl extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWebServerNetworkAccessControl Empty = new GetEnvironmentConfigWebServerNetworkAccessControl();

    @Import(name="allowedIpRanges", required=true)
    private List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges;

    public List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges() {
        return this.allowedIpRanges;
    }

    private GetEnvironmentConfigWebServerNetworkAccessControl() {}

    private GetEnvironmentConfigWebServerNetworkAccessControl(GetEnvironmentConfigWebServerNetworkAccessControl $) {
        this.allowedIpRanges = $.allowedIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentConfigWebServerNetworkAccessControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentConfigWebServerNetworkAccessControl $;

        public Builder() {
            $ = new GetEnvironmentConfigWebServerNetworkAccessControl();
        }

        public Builder(GetEnvironmentConfigWebServerNetworkAccessControl defaults) {
            $ = new GetEnvironmentConfigWebServerNetworkAccessControl(Objects.requireNonNull(defaults));
        }

        public Builder allowedIpRanges(List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges) {
            $.allowedIpRanges = allowedIpRanges;
            return this;
        }

        public Builder allowedIpRanges(GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange... allowedIpRanges) {
            return allowedIpRanges(List.of(allowedIpRanges));
        }

        public GetEnvironmentConfigWebServerNetworkAccessControl build() {
            $.allowedIpRanges = Objects.requireNonNull($.allowedIpRanges, "expected parameter 'allowedIpRanges' to be non-null");
            return $;
        }
    }

}
