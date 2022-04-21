// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginGroupMember extends com.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroupMember Empty = new DistributionOriginGroupMember();

    @Import(name="originId", required=true)
    private String originId;

    public String originId() {
        return this.originId;
    }

    private DistributionOriginGroupMember() {}

    private DistributionOriginGroupMember(DistributionOriginGroupMember $) {
        this.originId = $.originId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginGroupMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginGroupMember $;

        public Builder() {
            $ = new DistributionOriginGroupMember();
        }

        public Builder(DistributionOriginGroupMember defaults) {
            $ = new DistributionOriginGroupMember(Objects.requireNonNull(defaults));
        }

        public Builder originId(String originId) {
            $.originId = originId;
            return this;
        }

        public DistributionOriginGroupMember build() {
            $.originId = Objects.requireNonNull($.originId, "expected parameter 'originId' to be non-null");
            return $;
        }
    }

}
