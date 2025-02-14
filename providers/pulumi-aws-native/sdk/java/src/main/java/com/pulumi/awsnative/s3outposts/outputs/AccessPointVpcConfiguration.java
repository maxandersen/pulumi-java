// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPointVpcConfiguration {
    /**
     * @return Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
     * 
     */
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private AccessPointVpcConfiguration(@CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * @return Virtual Private Cloud (VPC) Id from which AccessPoint will allow requests.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public AccessPointVpcConfiguration build() {
            return new AccessPointVpcConfiguration(vpcId);
        }
    }
}
