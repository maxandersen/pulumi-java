// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDHCPOptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDHCPOptionsArgs Empty = new GetDHCPOptionsArgs();

    @Import(name="dhcpOptionsId", required=true)
    private String dhcpOptionsId;

    public String dhcpOptionsId() {
        return this.dhcpOptionsId;
    }

    private GetDHCPOptionsArgs() {}

    private GetDHCPOptionsArgs(GetDHCPOptionsArgs $) {
        this.dhcpOptionsId = $.dhcpOptionsId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDHCPOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDHCPOptionsArgs $;

        public Builder() {
            $ = new GetDHCPOptionsArgs();
        }

        public Builder(GetDHCPOptionsArgs defaults) {
            $ = new GetDHCPOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dhcpOptionsId(String dhcpOptionsId) {
            $.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        public GetDHCPOptionsArgs build() {
            $.dhcpOptionsId = Objects.requireNonNull($.dhcpOptionsId, "expected parameter 'dhcpOptionsId' to be non-null");
            return $;
        }
    }

}
