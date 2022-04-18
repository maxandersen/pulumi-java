// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketRedirectAllRequestsToProtocol;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketRedirectAllRequestsTo {
    /**
     * Name of the host where requests are redirected.
     * 
     */
    private final String hostName;
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    private final @Nullable BucketRedirectAllRequestsToProtocol protocol;

    @CustomType.Constructor
    private BucketRedirectAllRequestsTo(
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("protocol") @Nullable BucketRedirectAllRequestsToProtocol protocol) {
        this.hostName = hostName;
        this.protocol = protocol;
    }

    /**
     * Name of the host where requests are redirected.
     * 
    */
    public String hostName() {
        return this.hostName;
    }
    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
    */
    public Optional<BucketRedirectAllRequestsToProtocol> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRedirectAllRequestsTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private @Nullable BucketRedirectAllRequestsToProtocol protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRedirectAllRequestsTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.protocol = defaults.protocol;
        }

        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder protocol(@Nullable BucketRedirectAllRequestsToProtocol protocol) {
            this.protocol = protocol;
            return this;
        }        public BucketRedirectAllRequestsTo build() {
            return new BucketRedirectAllRequestsTo(hostName, protocol);
        }
    }
}
